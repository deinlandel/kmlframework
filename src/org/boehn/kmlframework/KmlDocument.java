package org.boehn.kmlframework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;

import org.boehn.kmlframework.todo.servlet.Observer;
import org.boehn.kmlframework.todo.style.Style;

public class KmlDocument extends Container {

	private Observer observer;
	private Hashtable<String,Style> styles; // TODO to remove?
	// TODO Schema
	
	private PrintWriter printWriter;
	private int indentLevel = 0;
	
	public int CURRENT_TIME_OFFSET = 0; // in seconds
	public int TAIL_HISTORY_TIME_LIMIT = 3600; // in seconds
	public boolean ENABLE_TAILS = true;
	public boolean ENABLE_3D_OBJECTS = true;
	public int DISTANCE_LIMIT_TAIL = 15000; // in meters
	public int DISTANCE_LIMIT_3D_OBJECTS = 15000; // in meters
	public boolean ENABLE_DETAILS_DEPENDS_ON_DISTANCE_TO_OBSERVER = true;
	public boolean ENABLE_ONLY_SHOW_OBJECTS_VISIBLE_TO_OBSERVER = true;
	public String ENCODING = "UTF-8";
	public boolean XML_INDENT = false;
	
	public KmlDocument() {
		
	}
		
	public Observer getObserver() {
		return observer;
	}

	public void setObserver(Observer observer) {
		this.observer = observer;
	}

	public Hashtable<String, Style> getStyles() {
		return styles;
	}

	public void setStyles(Hashtable<String, Style> styles) {
		this.styles = styles;
	}
	
	public void addStyle(Style style) {
		if (styles == null) {
			styles = new Hashtable<String, Style>();
		}
		// We give a name to the style if it is missing that
		if (style.getId() == null) {
			int i = styles.size();
			while (styles.containsKey("style" + i)) {
				i++;
			}
			style.setId("style" + i);
		}
		styles.put(style.getId(), style);
	}
	
	public Style getStyle(String id) {
		return styles.get(id);
	}

	public void print(String string) {
		print(string, 0);
	}
	
	public void println(String string) {
		println(string, 0);
	}
	
	public void print(String string, int indentChangeAfter) {
		printIndents();
		indentLevel += indentChangeAfter;
		printWriter.print(string);
	}
	
	public void println(String string, int indentChangeAfter) {
		printIndents();
		indentLevel += indentChangeAfter;
		printWriter.println(string);
	}
	
	public void print(int indentChangeBefore, String string) {
		indentLevel += indentChangeBefore;
		printIndents();
		printWriter.print(string);
	}
	
	public void println(int indentChangeBefore, String string) {
		indentLevel += indentChangeBefore;
		printIndents();
		printWriter.println(string);
	}
	
	private void printIndents() {
		if (XML_INDENT) {
			for (int i = 0; i < indentLevel; i++) {
				printWriter.print("\t");
			}
		}
	}
	
	public void decreaseIndentLevel() {
		indentLevel--;
	}
	
	public void increaseIndentLevel() {
		indentLevel++;
	}
	
	public void write(KmlDocument kmlDocument) throws KmlException {
		println("<Document" + getIdAndTargetIdFormatted() + ">", 1);
		writeInner(kmlDocument);
		//TODO add support for styles in KmlDocument
		//if (styles != null) {
		//	for (Style style: styles.values()) {
		//		style.addKml(documentElement, this, xmlDocument);
		//	}
		//}
		
		if (features != null) {
			for (Feature feature: features)
			feature.write(this);
		}
		
		println(-1, "</Document>");
	}
	
	public void createKml(String fileName) throws KmlException, IOException {
		createKml(new PrintWriter(new BufferedWriter(new FileWriter(fileName))));
	}
	
	public void createKml(PrintWriter printWriter) throws KmlException, IOException {
		this.printWriter = printWriter;
		println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		println("<kml xmlns=\"http://earth.google.com/kml/2.2\">", 1);
		write(this);
		println(-1, "</kml>");
		this.printWriter.close();
	}
	
}
