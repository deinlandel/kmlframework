package org.boehn.gef.modelgenerated;

public class BalloonStyle {

	private String id;
	private Color color;
	private Text text;

	public BalloonStyle() {
	}

	public BalloonStyle(String id, Color color, Text text) {
		this.id = id;
		this.color = color;
		this.text = text;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Color getColor() {
		return this.color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Text getText() {
		return this.text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("BalloonStyle");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.color != null) {
			element.appendChild(this.color.getElement(xmlDocument));
		}
		if (this.text != null) {
			element.appendChild(this.text.getElement(xmlDocument));
		}

		return element;
	}
}
