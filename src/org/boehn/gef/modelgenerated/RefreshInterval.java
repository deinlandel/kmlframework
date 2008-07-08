package org.boehn.gef.modelgenerated;

public class RefreshInterval {

	private String refreshInterval;
	private String id;

	public RefreshInterval() {
	}

	public RefreshInterval(String refreshInterval, String id) {
		this.refreshInterval = refreshInterval;
		this.id = id;
	}

	public String getRefreshInterval() {
		return this.refreshInterval;
	}

	public void SetRefreshInterval(String refreshInterval) {
		this.refreshInterval = refreshInterval;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("refreshInterval");
		if (this.refreshInterval != null) {
			element.appendChild(xmlDocument.createCDATASection(this.refreshInterval));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
