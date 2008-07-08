package org.boehn.gef.modelgenerated;

public class Tessellate {

	private String tessellate;
	private String id;

	public Tessellate() {
	}

	public Tessellate(String tessellate, String id) {
		this.tessellate = tessellate;
		this.id = id;
	}

	public String getTessellate() {
		return this.tessellate;
	}

	public void SetTessellate(String tessellate) {
		this.tessellate = tessellate;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("tessellate");
		if (this.tessellate != null) {
			element.appendChild(xmlDocument.createCDATASection(this.tessellate));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
