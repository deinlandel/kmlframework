package org.boehn.gef.modelgenerated;

public class Description {

	private String description;
	private String id;

	public Description() {
	}

	public Description(String description, String id) {
		this.description = description;
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void SetDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("description");
		if (this.description != null) {
			element.appendChild(xmlDocument.createCDATASection(this.description));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
