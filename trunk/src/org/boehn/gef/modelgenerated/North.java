package org.boehn.gef.modelgenerated;

public class North {

	private String north;
	private String id;

	public North() {
	}

	public North(String north, String id) {
		this.north = north;
		this.id = id;
	}

	public String getNorth() {
		return this.north;
	}

	public void SetNorth(String north) {
		this.north = north;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("north");
		if (this.north != null) {
			element.appendChild(xmlDocument.createCDATASection(this.north));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
