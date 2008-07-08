package org.boehn.gef.modelgenerated;

public class ViewRefreshMode {

	private String viewRefreshMode;
	private String id;

	public ViewRefreshMode() {
	}

	public ViewRefreshMode(String viewRefreshMode, String id) {
		this.viewRefreshMode = viewRefreshMode;
		this.id = id;
	}

	public String getViewRefreshMode() {
		return this.viewRefreshMode;
	}

	public void SetViewRefreshMode(String viewRefreshMode) {
		this.viewRefreshMode = viewRefreshMode;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("viewRefreshMode");
		if (this.viewRefreshMode != null) {
			element.appendChild(xmlDocument.createCDATASection(this.viewRefreshMode));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
