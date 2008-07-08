package org.boehn.gef.modelgenerated;

public class NetworkLinkControl {

	private String id;
	private Cookie cookie;
	private LinkName linkName;
	private LinkDescription linkDescription;
	private LinkSnippet linkSnippet;
	private Message message;
	private MinRefreshPeriod minRefreshPeriod;

	public NetworkLinkControl() {
	}

	public NetworkLinkControl(String id, Cookie cookie, LinkName linkName, LinkDescription linkDescription, LinkSnippet linkSnippet, Message message, MinRefreshPeriod minRefreshPeriod) {
		this.id = id;
		this.cookie = cookie;
		this.linkName = linkName;
		this.linkDescription = linkDescription;
		this.linkSnippet = linkSnippet;
		this.message = message;
		this.minRefreshPeriod = minRefreshPeriod;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Cookie getCookie() {
		return this.cookie;
	}

	public void setCookie(Cookie cookie) {
		this.cookie = cookie;
	}

	public LinkName getLinkName() {
		return this.linkName;
	}

	public void setLinkName(LinkName linkName) {
		this.linkName = linkName;
	}

	public LinkDescription getLinkDescription() {
		return this.linkDescription;
	}

	public void setLinkDescription(LinkDescription linkDescription) {
		this.linkDescription = linkDescription;
	}

	public LinkSnippet getLinkSnippet() {
		return this.linkSnippet;
	}

	public void setLinkSnippet(LinkSnippet linkSnippet) {
		this.linkSnippet = linkSnippet;
	}

	public Message getMessage() {
		return this.message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public MinRefreshPeriod getMinRefreshPeriod() {
		return this.minRefreshPeriod;
	}

	public void setMinRefreshPeriod(MinRefreshPeriod minRefreshPeriod) {
		this.minRefreshPeriod = minRefreshPeriod;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("NetworkLinkControl");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.cookie != null) {
			element.appendChild(this.cookie.getElement(xmlDocument));
		}
		if (this.linkName != null) {
			element.appendChild(this.linkName.getElement(xmlDocument));
		}
		if (this.linkDescription != null) {
			element.appendChild(this.linkDescription.getElement(xmlDocument));
		}
		if (this.linkSnippet != null) {
			element.appendChild(this.linkSnippet.getElement(xmlDocument));
		}
		if (this.message != null) {
			element.appendChild(this.message.getElement(xmlDocument));
		}
		if (this.minRefreshPeriod != null) {
			element.appendChild(this.minRefreshPeriod.getElement(xmlDocument));
		}

		return element;
	}
}
