package org.boehn.gef.modelgenerated;

public class Longitude {

	private String longitude;
	private String id;

	public Longitude() {
	}

	public Longitude(String longitude, String id) {
		this.longitude = longitude;
		this.id = id;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void SetLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("longitude");
		if (this.longitude != null) {
			element.appendChild(xmlDocument.createCDATASection(this.longitude));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
