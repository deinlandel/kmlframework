package org.boehn.gef.modelgenerated;

public class LabelPlacement {

	private String labelPlacement;
	private String id;

	public LabelPlacement() {
	}

	public LabelPlacement(String labelPlacement, String id) {
		this.labelPlacement = labelPlacement;
		this.id = id;
	}

	public String getLabelPlacement() {
		return this.labelPlacement;
	}

	public void SetLabelPlacement(String labelPlacement) {
		this.labelPlacement = labelPlacement;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("labelPlacement");
		if (this.labelPlacement != null) {
			element.appendChild(xmlDocument.createCDATASection(this.labelPlacement));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
