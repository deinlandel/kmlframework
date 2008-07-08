package org.boehn.gef.modelgenerated;

public class ColorStyle {

	private String id;
	private Antialias antialias;
	private Color color;
	private ColorMode colorMode;

	public ColorStyle() {
	}

	public ColorStyle(String id, Antialias antialias, Color color, ColorMode colorMode) {
		this.id = id;
		this.antialias = antialias;
		this.color = color;
		this.colorMode = colorMode;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Antialias getAntialias() {
		return this.antialias;
	}

	public void setAntialias(Antialias antialias) {
		this.antialias = antialias;
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

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("ColorStyle");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.antialias != null) {
			element.appendChild(this.antialias.getElement(xmlDocument));
		}
		if (this.color != null) {
			element.appendChild(this.color.getElement(xmlDocument));
		}
		if (this.colorMode != null) {
			element.appendChild(this.colorMode.getElement(xmlDocument));
		}

		return element;
	}
}
