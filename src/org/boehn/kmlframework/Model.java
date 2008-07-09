package org.boehn.kmlframework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.boehn.kmlframework.servlet.Observer;
import org.boehn.kmlframework.style.Style;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Model {

	private List<ModelElement> modelElements;
	private Observer observer;
	private Hashtable<String,Style> styles;
	
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
	
	public Model() {
		modelElements = new ArrayList<ModelElement>();
	}

	public void add(ModelElement element) { 
		modelElements.add(element);
	}
	
	public List<ModelElement> getModelElements() {
		return modelElements;
	}

	public void setModelElements(List<ModelElement> modelElements) {
		this.modelElements = modelElements;
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

	public void write(OutputStream outputStream) throws ModelException {	
		try {
			Result result = new StreamResult(new OutputStreamWriter(outputStream, ENCODING));
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			if (XML_INDENT) {
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			}
			transformer.setOutputProperty(OutputKeys.ENCODING, ENCODING);
			transformer.transform(new DOMSource(generateXmlDocument()),result);
		} catch (UnsupportedEncodingException e) {
			throw new ModelException(e);
		} catch (TransformerConfigurationException e) {
			throw new ModelException(e);
		} catch (TransformerException e) {
			throw new ModelException(e);
		}
	}
	
	public void write(String fileName) throws ModelException, IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(fileName);
		write(fileOutputStream);
		fileOutputStream.close();
	}
	
	/*public void writeXPP(String fileName) throws ModelException, IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(fileName);
		writeXPP(fileOutputStream);
		fileOutputStream.close();
	}
	
	public void writeDirect(String fileName) throws ModelException, IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(fileName);
		writeDirect(fileOutputStream);
		fileOutputStream.close();
	}

	public void writeXPP(OutputStream outputStream) throws ModelException {
		
		try {
			XmlPullParserFactory factory;
			factory = XmlPullParserFactory.newInstance(System.getProperty(XmlPullParserFactory.PROPERTY_NAME), null);
			XmlSerializer serializer = factory.newSerializer();
			serializer.setOutput(outputStream, "UTF-8");
			serializer.startDocument(null, null);
			generateXmlDocumentXPP(serializer);
			serializer.endDocument();
		} catch (XmlPullParserException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void writeDirect(OutputStream outputStream) throws ModelException {
		try {
			Writer writer = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
			writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			generateXmlDocumentDirect(writer);
			writer.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void generateXmlDocumentXPP(XmlSerializer serializer) throws ModelException, IllegalArgumentException, IllegalStateException, IOException {
		serializer.startTag(null, "kml");
		serializer.attribute(null, "xmlns", "http://earth.google.com/kml/2.0");
		serializer.endTag(null, "kml");
		
		if (modelElements != null) {
			modelElements.addKmlXPP(this, serializer);
		}
	}
	
	public void generateXmlDocumentDirect(Writer writer) throws ModelException, IllegalArgumentException, IllegalStateException, IOException {
		writer.write("<kml xmlns=\"http://earth.google.com/kml/2.0\">");
		
		if (modelElements != null) {
			modelElements.addKmlDirect(this, writer);
		}
	}*/
	
	public Document generateXmlDocument() throws ModelException {
		Document xmlDocument;
		try {
			xmlDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
		} catch (ParserConfigurationException e) {
			throw new  ModelException(e);
		}
		
		Element kmlElement = xmlDocument.createElement("kml");
		kmlElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", "http://earth.google.com/kml/2.0");
		xmlDocument.appendChild(kmlElement);

		Element documentElement = xmlDocument.createElement("Document");
		kmlElement.appendChild(documentElement);
		
		if (styles != null) {
			for (Style style: styles.values()) {
				style.addKml(documentElement, this, xmlDocument);
			}
		}
		
		if (modelElements != null) {
			for (ModelElement modelElement: modelElements)
			modelElement.addKml(documentElement, this, xmlDocument);
		}
		
		return xmlDocument;
	}
}
