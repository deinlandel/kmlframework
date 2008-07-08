package org.boehn.gef.modelgenerated;

public class Fill {

	private String fill;
	private String id;

	public Fill() {
	}

	public Fill(String fill, String id) {
		this.fill = fill;
		this.id = id;
	}

	public String getFill() {
		return this.fill;
	}

	public void SetFill(String fill) {
		this.fill = fill;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("fill");
		if (this.fill != null) {
			element.appendChild(xmlDocument.createCDATASection(this.fill));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
