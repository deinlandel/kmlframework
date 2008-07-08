package org.boehn.gef.modelgenerated;

public class LabelColor {

	private String labelColor;
	private String id;

	public LabelColor() {
	}

	public LabelColor(String labelColor, String id) {
		this.labelColor = labelColor;
		this.id = id;
	}

	public String getLabelColor() {
		return this.labelColor;
	}

	public void SetLabelColor(String labelColor) {
		this.labelColor = labelColor;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("labelColor");
		if (this.labelColor != null) {
			element.appendChild(xmlDocument.createCDATASection(this.labelColor));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
