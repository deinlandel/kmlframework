package org.boehn.gef.modelgenerated;

public class Snippet {

	private String id;
	private String maxLines;
	private Text text;

	public Snippet() {
	}

	public Snippet(String id, String maxLines, Text text) {
		this.id = id;
		this.maxLines = maxLines;
		this.text = text;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public String getMaxLines() {
		return this.maxLines;
	}

	public void SetMaxLines(String maxLines) {
		this.maxLines = maxLines;
	}

	public Text getText() {
		return this.text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("Snippet");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.maxLines != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("maxLines");
			attribute.appendChild(xmlDocument.createTextNode(this.maxLines.toString()));
			element.appendChild(attribute);
		}
		if (this.text != null) {
			element.appendChild(this.text.getElement(xmlDocument));
		}

		return element;
	}
}
