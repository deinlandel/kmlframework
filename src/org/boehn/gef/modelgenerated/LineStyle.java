package org.boehn.gef.modelgenerated;

public class LineStyle {

	private String id;
	private Color color;
	private ColorMode colorMode;
	private Width width;

	public LineStyle() {
	}

	public LineStyle(String id, Color color, ColorMode colorMode, Width width) {
		this.id = id;
		this.color = color;
		this.colorMode = colorMode;
		this.width = width;
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

	public ColorMode getColorMode() {
		return this.colorMode;
	}

	public void setColorMode(ColorMode colorMode) {
		this.colorMode = colorMode;
	}

	public Width getWidth() {
		return this.width;
	}

	public void setWidth(Width width) {
		this.width = width;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("LineStyle");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.color != null) {
			element.appendChild(this.color.getElement(xmlDocument));
		}
		if (this.colorMode != null) {
			element.appendChild(this.colorMode.getElement(xmlDocument));
		}
		if (this.width != null) {
			element.appendChild(this.width.getElement(xmlDocument));
		}

		return element;
	}
}
