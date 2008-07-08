package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class Style {

	private String id;
	private BalloonStyle balloonStyle;
	private ColorStyle colorStyle;
	private Collection<Icon> icons;
	private IconStyle iconStyle;
	private LabelStyle labelStyle;
	private LineStyle lineStyle;
	private PolyStyle polyStyle;
	private GeomScale geomScale;
	private GeomColor geomColor;

	public Style() {
	}

	public Style(String id, BalloonStyle balloonStyle, ColorStyle colorStyle, Collection<Icon> icons, IconStyle iconStyle, LabelStyle labelStyle, LineStyle lineStyle, PolyStyle polyStyle, GeomScale geomScale, GeomColor geomColor) {
		this.id = id;
		this.balloonStyle = balloonStyle;
		this.colorStyle = colorStyle;
		this.icons = icons;
		this.iconStyle = iconStyle;
		this.labelStyle = labelStyle;
		this.lineStyle = lineStyle;
		this.polyStyle = polyStyle;
		this.geomScale = geomScale;
		this.geomColor = geomColor;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public BalloonStyle getBalloonStyle() {
		return this.balloonStyle;
	}

	public void setBalloonStyle(BalloonStyle balloonStyle) {
		this.balloonStyle = balloonStyle;
	}

	public ColorStyle getColorStyle() {
		return this.colorStyle;
	}

	public void setColorStyle(ColorStyle colorStyle) {
		this.colorStyle = colorStyle;
	}

	public Collection<Icon> getIcons() {
		return this.icons;
	}

	public void setIcons(Collection<Icon> icons) {
		this.icons = icons;
	}

	public IconStyle getIconStyle() {
		return this.iconStyle;
	}

	public void setIconStyle(IconStyle iconStyle) {
		this.iconStyle = iconStyle;
	}

	public LabelStyle getLabelStyle() {
		return this.labelStyle;
	}

	public void setLabelStyle(LabelStyle labelStyle) {
		this.labelStyle = labelStyle;
	}

	public LineStyle getLineStyle() {
		return this.lineStyle;
	}

	public void setLineStyle(LineStyle lineStyle) {
		this.lineStyle = lineStyle;
	}

	public PolyStyle getPolyStyle() {
		return this.polyStyle;
	}

	public void setPolyStyle(PolyStyle polyStyle) {
		this.polyStyle = polyStyle;
	}

	public GeomScale getGeomScale() {
		return this.geomScale;
	}

	public void setGeomScale(GeomScale geomScale) {
		this.geomScale = geomScale;
	}

	public GeomColor getGeomColor() {
		return this.geomColor;
	}

	public void setGeomColor(GeomColor geomColor) {
		this.geomColor = geomColor;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("Style");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.balloonStyle != null) {
			element.appendChild(this.balloonStyle.getElement(xmlDocument));
		}
		if (this.colorStyle != null) {
			element.appendChild(this.colorStyle.getElement(xmlDocument));
		}
		if (this.icons != null) {
			for (Icon icon: this.icons) {
				element.appendChild(icon.getElement(xmlDocument));
			}
		}
		if (this.iconStyle != null) {
			element.appendChild(this.iconStyle.getElement(xmlDocument));
		}
		if (this.labelStyle != null) {
			element.appendChild(this.labelStyle.getElement(xmlDocument));
		}
		if (this.lineStyle != null) {
			element.appendChild(this.lineStyle.getElement(xmlDocument));
		}
		if (this.polyStyle != null) {
			element.appendChild(this.polyStyle.getElement(xmlDocument));
		}
		if (this.geomScale != null) {
			element.appendChild(this.geomScale.getElement(xmlDocument));
		}
		if (this.geomColor != null) {
			element.appendChild(this.geomColor.getElement(xmlDocument));
		}

		return element;
	}
}
