package org.boehn.gef.modelgenerated;

public class ColorMode {

	private String colorMode;
	private String id;

	public ColorMode() {
	}

	public ColorMode(String colorMode, String id) {
		this.colorMode = colorMode;
		this.id = id;
	}

	public String getColorMode() {
		return this.colorMode;
	}

	public void SetColorMode(String colorMode) {
		this.colorMode = colorMode;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("colorMode");
		if (this.colorMode != null) {
			element.appendChild(xmlDocument.createCDATASection(this.colorMode));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
