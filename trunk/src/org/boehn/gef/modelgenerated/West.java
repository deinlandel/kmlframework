package org.boehn.gef.modelgenerated;

public class West {

	private String west;
	private String id;

	public West() {
	}

	public West(String west, String id) {
		this.west = west;
		this.id = id;
	}

	public String getWest() {
		return this.west;
	}

	public void SetWest(String west) {
		this.west = west;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("west");
		if (this.west != null) {
			element.appendChild(xmlDocument.createCDATASection(this.west));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
