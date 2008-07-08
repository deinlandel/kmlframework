package org.boehn.gef.modelgenerated;

public class PreserveTextLevel {

	private String preserveTextLevel;
	private String id;

	public PreserveTextLevel() {
	}

	public PreserveTextLevel(String preserveTextLevel, String id) {
		this.preserveTextLevel = preserveTextLevel;
		this.id = id;
	}

	public String getPreserveTextLevel() {
		return this.preserveTextLevel;
	}

	public void SetPreserveTextLevel(String preserveTextLevel) {
		this.preserveTextLevel = preserveTextLevel;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("preserveTextLevel");
		if (this.preserveTextLevel != null) {
			element.appendChild(xmlDocument.createCDATASection(this.preserveTextLevel));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
