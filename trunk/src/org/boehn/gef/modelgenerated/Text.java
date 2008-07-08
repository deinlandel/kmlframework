package org.boehn.gef.modelgenerated;

public class Text {

	private String text;
	private String id;

	public Text() {
	}

	public Text(String text, String id) {
		this.text = text;
		this.id = id;
	}

	public String getText() {
		return this.text;
	}

	public void SetText(String text) {
		this.text = text;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("text");
		if (this.text != null) {
			element.appendChild(xmlDocument.createCDATASection(this.text));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
