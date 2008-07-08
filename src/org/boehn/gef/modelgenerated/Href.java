package org.boehn.gef.modelgenerated;

public class Href {

	private String href;
	private String id;

	public Href() {
	}

	public Href(String href, String id) {
		this.href = href;
		this.id = id;
	}

	public String getHref() {
		return this.href;
	}

	public void SetHref(String href) {
		this.href = href;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("href");
		if (this.href != null) {
			element.appendChild(xmlDocument.createCDATASection(this.href));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
