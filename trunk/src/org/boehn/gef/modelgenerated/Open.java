package org.boehn.gef.modelgenerated;

public class Open {

	private String open;
	private String id;

	public Open() {
	}

	public Open(String open, String id) {
		this.open = open;
		this.id = id;
	}

	public String getOpen() {
		return this.open;
	}

	public void SetOpen(String open) {
		this.open = open;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("open");
		if (this.open != null) {
			element.appendChild(xmlDocument.createCDATASection(this.open));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
