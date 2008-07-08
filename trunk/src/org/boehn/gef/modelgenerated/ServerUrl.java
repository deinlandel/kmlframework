package org.boehn.gef.modelgenerated;

public class ServerUrl {

	private String serverUrl;
	private String id;

	public ServerUrl() {
	}

	public ServerUrl(String serverUrl, String id) {
		this.serverUrl = serverUrl;
		this.id = id;
	}

	public String getServerUrl() {
		return this.serverUrl;
	}

	public void SetServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("serverUrl");
		if (this.serverUrl != null) {
			element.appendChild(xmlDocument.createCDATASection(this.serverUrl));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
