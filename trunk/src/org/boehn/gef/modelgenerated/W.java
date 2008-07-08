package org.boehn.gef.modelgenerated;

public class W {

	private String w;
	private String id;

	public W() {
	}

	public W(String w, String id) {
		this.w = w;
		this.id = id;
	}

	public String getW() {
		return this.w;
	}

	public void SetW(String w) {
		this.w = w;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("w");
		if (this.w != null) {
			element.appendChild(xmlDocument.createCDATASection(this.w));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
