package org.boehn.gef.modelgenerated;

public class Name {

	private String name;
	private String id;

	public Name() {
	}

	public Name(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void SetName(String name) {
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("name");
		if (this.name != null) {
			element.appendChild(xmlDocument.createCDATASection(this.name));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
