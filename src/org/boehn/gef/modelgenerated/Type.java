package org.boehn.gef.modelgenerated;

public class Type {

	private String type;
	private String id;

	public Type() {
	}

	public Type(String type, String id) {
		this.type = type;
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void SetType(String type) {
		this.type = type;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("type");
		if (this.type != null) {
			element.appendChild(xmlDocument.createCDATASection(this.type));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
