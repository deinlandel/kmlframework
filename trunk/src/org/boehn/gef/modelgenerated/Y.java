package org.boehn.gef.modelgenerated;

public class Y {

	private String y;
	private String id;

	public Y() {
	}

	public Y(String y, String id) {
		this.y = y;
		this.id = id;
	}

	public String getY() {
		return this.y;
	}

	public void SetY(String y) {
		this.y = y;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("y");
		if (this.y != null) {
			element.appendChild(xmlDocument.createCDATASection(this.y));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
