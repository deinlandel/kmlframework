package org.boehn.gef.modelgenerated;

public class H {

	private String h;
	private String id;

	public H() {
	}

	public H(String h, String id) {
		this.h = h;
		this.id = id;
	}

	public String getH() {
		return this.h;
	}

	public void SetH(String h) {
		this.h = h;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("h");
		if (this.h != null) {
			element.appendChild(xmlDocument.createCDATASection(this.h));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
