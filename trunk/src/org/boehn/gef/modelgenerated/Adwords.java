package org.boehn.gef.modelgenerated;

public class Adwords {

	private String adwords;
	private String id;

	public Adwords() {
	}

	public Adwords(String adwords, String id) {
		this.adwords = adwords;
		this.id = id;
	}

	public String getAdwords() {
		return this.adwords;
	}

	public void SetAdwords(String adwords) {
		this.adwords = adwords;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("adwords");
		if (this.adwords != null) {
			element.appendChild(xmlDocument.createCDATASection(this.adwords));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
