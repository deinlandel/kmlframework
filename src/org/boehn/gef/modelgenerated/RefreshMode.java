package org.boehn.gef.modelgenerated;

public class RefreshMode {

	private String refreshMode;
	private String id;

	public RefreshMode() {
	}

	public RefreshMode(String refreshMode, String id) {
		this.refreshMode = refreshMode;
		this.id = id;
	}

	public String getRefreshMode() {
		return this.refreshMode;
	}

	public void SetRefreshMode(String refreshMode) {
		this.refreshMode = refreshMode;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("refreshMode");
		if (this.refreshMode != null) {
			element.appendChild(xmlDocument.createCDATASection(this.refreshMode));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
