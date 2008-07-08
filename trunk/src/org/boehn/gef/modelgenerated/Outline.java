package org.boehn.gef.modelgenerated;

public class Outline {

	private String outline;
	private String id;

	public Outline() {
	}

	public Outline(String outline, String id) {
		this.outline = outline;
		this.id = id;
	}

	public String getOutline() {
		return this.outline;
	}

	public void SetOutline(String outline) {
		this.outline = outline;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("outline");
		if (this.outline != null) {
			element.appendChild(xmlDocument.createCDATASection(this.outline));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
