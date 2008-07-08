package org.boehn.gef.modelgenerated;

public class East {

	private String east;
	private String id;

	public East() {
	}

	public East(String east, String id) {
		this.east = east;
		this.id = id;
	}

	public String getEast() {
		return this.east;
	}

	public void SetEast(String east) {
		this.east = east;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("east");
		if (this.east != null) {
			element.appendChild(xmlDocument.createCDATASection(this.east));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
