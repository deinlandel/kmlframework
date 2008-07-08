package org.boehn.gef.modelgenerated;

public class Message {

	private String message;
	private String id;

	public Message() {
	}

	public Message(String message, String id) {
		this.message = message;
		this.id = id;
	}

	public String getMessage() {
		return this.message;
	}

	public void SetMessage(String message) {
		this.message = message;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("message");
		if (this.message != null) {
			element.appendChild(xmlDocument.createCDATASection(this.message));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
