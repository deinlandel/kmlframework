package org.boehn.gef.modelgenerated;

public class PolyStyle {

	private String id;
	private Color color;
	private ColorMode colorMode;
	private Fill fill;
	private Outline outline;

	public PolyStyle() {
	}

	public PolyStyle(String id, Color color, ColorMode colorMode, Fill fill, Outline outline) {
		this.id = id;
		this.color = color;
		this.colorMode = colorMode;
		this.fill = fill;
		this.outline = outline;
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

	public Fill getFill() {
		return this.fill;
	}

	public void setFill(Fill fill) {
		this.fill = fill;
	}

	public Outline getOutline() {
		return this.outline;
	}

	public void setOutline(Outline outline) {
		this.outline = outline;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("PolyStyle");
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
		if (this.fill != null) {
			element.appendChild(this.fill.getElement(xmlDocument));
		}
		if (this.outline != null) {
			element.appendChild(this.outline.getElement(xmlDocument));
		}

		return element;
	}
}
