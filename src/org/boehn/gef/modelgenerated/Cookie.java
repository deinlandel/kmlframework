package org.boehn.gef.modelgenerated;

public class Cookie {

	private String cookie;
	private String id;

	public Cookie() {
	}

	public Cookie(String cookie, String id) {
		this.cookie = cookie;
		this.id = id;
	}

	public String getCookie() {
		return this.cookie;
	}

	public void SetCookie(String cookie) {
		this.cookie = cookie;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("cookie");
		if (this.cookie != null) {
			element.appendChild(xmlDocument.createCDATASection(this.cookie));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
