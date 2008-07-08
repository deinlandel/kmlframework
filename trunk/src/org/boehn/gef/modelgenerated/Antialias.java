package org.boehn.gef.modelgenerated;

public class Antialias {

	private String antialias;
	private String id;

	public Antialias() {
	}

	public Antialias(String antialias, String id) {
		this.antialias = antialias;
		this.id = id;
	}

	public String getAntialias() {
		return this.antialias;
	}

	public void SetAntialias(String antialias) {
		this.antialias = antialias;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("antialias");
		if (this.antialias != null) {
			element.appendChild(xmlDocument.createCDATASection(this.antialias));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
