package org.boehn.gef.modelgenerated;

public class Coordinates {

	private String coordinates;
	private String id;

	public Coordinates() {
	}

	public Coordinates(String coordinates, String id) {
		this.coordinates = coordinates;
		this.id = id;
	}

	public String getCoordinates() {
		return this.coordinates;
	}

	public void SetCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("coordinates");
		if (this.coordinates != null) {
			element.appendChild(xmlDocument.createCDATASection(this.coordinates));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
