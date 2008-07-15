package org.boehn.kmlframework;

public class Data extends KmlObject {

	private String name;
	private String displayName;
	private String value;
	
	public Data() {}
	
	public Data(String name, String displayName, String value) {
		this.name = name;
		this.displayName = displayName;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<Data name=\"" + name +"\">", 1);
		if (displayName != null) {
			kmlDocument.println("<displayName>" + displayName + "</displayName>");
		}
		if (value != null) {
			kmlDocument.println("<value>" + value + "</value>");
		}
		kmlDocument.println(-1, "</Data>");
	}

}
