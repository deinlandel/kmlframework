package org.boehn.gef.modelgenerated;

public class Width {

	private String width;
	private String id;

	public Width() {
	}

	public Width(String width, String id) {
		this.width = width;
		this.id = id;
	}

	public String getWidth() {
		return this.width;
	}

	public void SetWidth(String width) {
		this.width = width;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("width");
		if (this.width != null) {
			element.appendChild(xmlDocument.createCDATASection(this.width));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
