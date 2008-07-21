package org.boehn.kmlframework.kml;

import java.util.List;

import org.boehn.kmlframework.atom.AtomAuthor;
import org.boehn.kmlframework.atom.AtomLink;

public class Folder extends Container {
	
	public Folder() {}
	
	public Folder(String name, Boolean visability, Boolean open, AtomAuthor atomAuthor, AtomLink atomLink, String address, String xalAddressDetails, String phoneNumber, String snippet, Integer snippetMaxLines,String description, AbstractView abstractView, TimePrimitive timePrimitive, String styleUrl, StyleSelector styleSelector, Region region, ExtendedData extendedData, List<Feature> feauters) {
		super(name, visability, open, atomAuthor, atomLink, address, xalAddressDetails, phoneNumber, snippet, snippetMaxLines, description, abstractView, timePrimitive, styleUrl, styleSelector, region, extendedData, feauters);
	}

	public void write(Kml kml) throws KmlException {
		kml.println("<Folder" + getIdAndTargetIdFormatted(kml) + ">", 1);
		writeInner(kml);
		kml.println(-1, "</Folder>");
	}
	
	public void writeDelete(Kml kml) throws KmlException {
		kml.println("<Folder" + getIdAndTargetIdFormatted(kml) + "></>");
	}
}
