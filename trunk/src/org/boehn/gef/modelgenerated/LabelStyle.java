package org.boehn.gef.modelgenerated;

public class LabelStyle {

	private String id;
	private Color color;
	private ColorMode colorMode;
	private Scale scale;

	public LabelStyle() {
	}

	public LabelStyle(String id, Color color, ColorMode colorMode, Scale scale) {
		this.id = id;
		this.color = color;
		this.colorMode = colorMode;
		this.scale = scale;
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

	public Scale getScale() {
		return this.scale;
	}

	public void setScale(Scale scale) {
		this.scale = scale;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("LabelStyle");
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
		if (this.scale != null) {
			element.appendChild(this.scale.getElement(xmlDocument));
		}

		return element;
	}
}
