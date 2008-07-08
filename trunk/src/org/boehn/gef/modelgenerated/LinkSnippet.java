package org.boehn.gef.modelgenerated;

public class LinkSnippet {

	private String linkSnippet;
	private String id;

	public LinkSnippet() {
	}

	public LinkSnippet(String linkSnippet, String id) {
		this.linkSnippet = linkSnippet;
		this.id = id;
	}

	public String getLinkSnippet() {
		return this.linkSnippet;
	}

	public void SetLinkSnippet(String linkSnippet) {
		this.linkSnippet = linkSnippet;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("linkSnippet");
		if (this.linkSnippet != null) {
			element.appendChild(xmlDocument.createCDATASection(this.linkSnippet));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
