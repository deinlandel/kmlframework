package org.boehn.gef.modelgenerated;

public class Range {

	private String range;
	private String id;

	public Range() {
	}

	public Range(String range, String id) {
		this.range = range;
		this.id = id;
	}

	public String getRange() {
		return this.range;
	}

	public void SetRange(String range) {
		this.range = range;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("range");
		if (this.range != null) {
			element.appendChild(xmlDocument.createCDATASection(this.range));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
