package org.boehn.gef.modelgenerated;

public class X {

	private String x;
	private String id;

	public X() {
	}

	public X(String x, String id) {
		this.x = x;
		this.id = id;
	}

	public String getX() {
		return this.x;
	}

	public void SetX(String x) {
		this.x = x;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("x");
		if (this.x != null) {
			element.appendChild(xmlDocument.createCDATASection(this.x));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
