package org.boehn.gef.modelgenerated;

public class Color {

	private String color;
	private String id;

	public Color() {
	}

	public Color(String color, String id) {
		this.color = color;
		this.id = id;
	}

	public String getColor() {
		return this.color;
	}

	public void SetColor(String color) {
		this.color = color;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("color");
		if (this.color != null) {
			element.appendChild(xmlDocument.createCDATASection(this.color));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
