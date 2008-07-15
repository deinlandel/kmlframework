package org.boehn.kmlframework;

public class Pair extends KmlObject {

	private StyleStateEnum key;
	private String styleUrl;
	
	public Pair(StyleStateEnum key, String styleUrl) {
		this.key = key;
		this.styleUrl = styleUrl;
	}
	
 	public StyleStateEnum getKey() {
		return key;
	}

	public void setKey(StyleStateEnum key) {
		this.key = key;
	}

	public String getStyleUrl() {
		return styleUrl;
	}

	public void setStyleUrl(String styleUrl) {
		this.styleUrl = styleUrl;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		// We validate the data
		if (key == null) {
			throw new KmlException("Key missing for Pair");
		}
		if (styleUrl == null) {
			throw new KmlException("StyleUrl missing for Pair");
		}
		kmlDocument.println("<Pair" + getIdAndTargetIdFormatted() + ">", 1);
		kmlDocument.println("<key>" + key + "</key>");
		kmlDocument.println("<styleUrl>" + styleUrl + "</styleUrl>");
		kmlDocument.println(-1, "</Pair>");
	}
}