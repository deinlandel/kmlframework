package org.boehn.gef.modelgenerated;

public class RefreshVisibility {

	private String refreshVisibility;
	private String id;

	public RefreshVisibility() {
	}

	public RefreshVisibility(String refreshVisibility, String id) {
		this.refreshVisibility = refreshVisibility;
		this.id = id;
	}

	public String getRefreshVisibility() {
		return this.refreshVisibility;
	}

	public void SetRefreshVisibility(String refreshVisibility) {
		this.refreshVisibility = refreshVisibility;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("refreshVisibility");
		if (this.refreshVisibility != null) {
			element.appendChild(xmlDocument.createCDATASection(this.refreshVisibility));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
