package org.boehn.gef.modelgenerated;

public class LinkDescription {

	private String linkDescription;
	private String id;

	public LinkDescription() {
	}

	public LinkDescription(String linkDescription, String id) {
		this.linkDescription = linkDescription;
		this.id = id;
	}

	public String getLinkDescription() {
		return this.linkDescription;
	}

	public void SetLinkDescription(String linkDescription) {
		this.linkDescription = linkDescription;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("linkDescription");
		if (this.linkDescription != null) {
			element.appendChild(xmlDocument.createCDATASection(this.linkDescription));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
