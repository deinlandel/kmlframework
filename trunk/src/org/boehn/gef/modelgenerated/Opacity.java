package org.boehn.gef.modelgenerated;

public class Opacity {

	private String opacity;
	private String id;

	public Opacity() {
	}

	public Opacity(String opacity, String id) {
		this.opacity = opacity;
		this.id = id;
	}

	public String getOpacity() {
		return this.opacity;
	}

	public void SetOpacity(String opacity) {
		this.opacity = opacity;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("opacity");
		if (this.opacity != null) {
			element.appendChild(xmlDocument.createCDATASection(this.opacity));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
