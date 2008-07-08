package org.boehn.gef.modelgenerated;

public class Latitude {

	private String latitude;
	private String id;

	public Latitude() {
	}

	public Latitude(String latitude, String id) {
		this.latitude = latitude;
		this.id = id;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void SetLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("latitude");
		if (this.latitude != null) {
			element.appendChild(xmlDocument.createCDATASection(this.latitude));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
