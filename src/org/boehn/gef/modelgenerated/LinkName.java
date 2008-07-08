package org.boehn.gef.modelgenerated;

public class LinkName {

	private String linkName;
	private String id;

	public LinkName() {
	}

	public LinkName(String linkName, String id) {
		this.linkName = linkName;
		this.id = id;
	}

	public String getLinkName() {
		return this.linkName;
	}

	public void SetLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("linkName");
		if (this.linkName != null) {
			element.appendChild(xmlDocument.createCDATASection(this.linkName));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
