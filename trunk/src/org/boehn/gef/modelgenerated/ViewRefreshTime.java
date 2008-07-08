package org.boehn.gef.modelgenerated;

public class ViewRefreshTime {

	private String viewRefreshTime;
	private String id;

	public ViewRefreshTime() {
	}

	public ViewRefreshTime(String viewRefreshTime, String id) {
		this.viewRefreshTime = viewRefreshTime;
		this.id = id;
	}

	public String getViewRefreshTime() {
		return this.viewRefreshTime;
	}

	public void SetViewRefreshTime(String viewRefreshTime) {
		this.viewRefreshTime = viewRefreshTime;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("viewRefreshTime");
		if (this.viewRefreshTime != null) {
			element.appendChild(xmlDocument.createCDATASection(this.viewRefreshTime));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
