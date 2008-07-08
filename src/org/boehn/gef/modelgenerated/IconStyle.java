package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class IconStyle {

	private String id;
	private Collection<Icon> icons;
	private Color color;
	private ColorMode colorMode;
	private Heading heading;
	private Scale scale;

	public IconStyle() {
	}

	public IconStyle(String id, Collection<Icon> icons, Color color, ColorMode colorMode, Heading heading, Scale scale) {
		this.id = id;
		this.icons = icons;
		this.color = color;
		this.colorMode = colorMode;
		this.heading = heading;
		this.scale = scale;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<Icon> getIcons() {
		return this.icons;
	}

	public void setIcons(Collection<Icon> icons) {
		this.icons = icons;
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

	public Heading getHeading() {
		return this.heading;
	}

	public void setHeading(Heading heading) {
		this.heading = heading;
	}

	public Scale getScale() {
		return this.scale;
	}

	public void setScale(Scale scale) {
		this.scale = scale;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("IconStyle");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.icons != null) {
			for (Icon icon: this.icons) {
				element.appendChild(icon.getElement(xmlDocument));
			}
		}
		if (this.color != null) {
			element.appendChild(this.color.getElement(xmlDocument));
		}
		if (this.colorMode != null) {
			element.appendChild(this.colorMode.getElement(xmlDocument));
		}
		if (this.heading != null) {
			element.appendChild(this.heading.getElement(xmlDocument));
		}
		if (this.scale != null) {
			element.appendChild(this.scale.getElement(xmlDocument));
		}

		return element;
	}
}
