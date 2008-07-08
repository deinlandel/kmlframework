package org.boehn.gef.modelgenerated;

public class South {

	private String south;
	private String id;

	public South() {
	}

	public South(String south, String id) {
		this.south = south;
		this.id = id;
	}

	public String getSouth() {
		return this.south;
	}

	public void SetSouth(String south) {
		this.south = south;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("south");
		if (this.south != null) {
			element.appendChild(xmlDocument.createCDATASection(this.south));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
