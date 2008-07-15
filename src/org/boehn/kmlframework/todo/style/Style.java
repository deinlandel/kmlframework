package org.boehn.kmlframework.todo.style;

import org.boehn.kmlframework.KmlDocument;
import org.boehn.kmlframework.KmlException;
import org.boehn.kmlframework.todo.overlays.Icon;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Style {

	private String id;
	private Color balloonTextColor;
	private String balloonText;
	private Color balloonColor;
	private Color iconColor;
	private ColorModes iconColorMode;
	private Double iconHeading;
	private Icon icon;
	private Double iconScale;
	private Color labelColor;
	private ColorModes labelColorMode;
	private Double labelScale;
	private Color lineColor;
	private ColorModes lineColorMode;
	private Integer lineWidth;
	private Color polygonColor;
	private ColorModes polygonColorMode;
	private Boolean polygonFill;
	private Boolean polygonOutline;
	
	public Style() {
	}
	
	public Style(String id) {
		this.id = id;
	}
	
	public void addKml(Element parentElement, KmlDocument model, Document xmlDocument) throws KmlException {
		
		Element styleElement = xmlDocument.createElement("Style");
		
		if (id != null) {
			styleElement.setAttribute("id", id);
		}
		
		// We check if a balloon style should be added
		if (balloonText != null || balloonColor != null || balloonTextColor != null) {
			Element balloonStyleElement = xmlDocument.createElement("BalloonStyle");
			if (balloonText != null) {
				Element ballonTextElement = xmlDocument.createElement("text");
				ballonTextElement.appendChild(xmlDocument.createTextNode(balloonText));
				balloonStyleElement.appendChild(ballonTextElement);
			}
			if (balloonTextColor != null) {
				Element ballonTextColorElement = xmlDocument.createElement("textColor");
				ballonTextColorElement.appendChild(xmlDocument.createTextNode(balloonTextColor.toHexString()));
				balloonStyleElement.appendChild(ballonTextColorElement);
			}
			if (balloonColor != null) {
				Element ballonColorElement = xmlDocument.createElement("color");
				ballonColorElement.appendChild(xmlDocument.createTextNode(balloonColor.toHexString()));
				balloonStyleElement.appendChild(ballonColorElement);
			}
			styleElement.appendChild(balloonStyleElement);
		}
		
		// We check if an icon style should be added (icon is required for this to be added)
		if (icon != null) {
			Element iconStyleElement = xmlDocument.createElement("IconStyle");
			if (iconColor != null) {
				Element iconColorElement = xmlDocument.createElement("color");
				iconColorElement.appendChild(xmlDocument.createTextNode(iconColor.toHexString()));
				iconStyleElement.appendChild(iconColorElement);
			}
			if (iconColorMode != null) {
				Element iconColorModeElement = xmlDocument.createElement("colorMode");
				iconColorModeElement.appendChild(xmlDocument.createTextNode(iconColorMode.toString()));
				iconStyleElement.appendChild(iconColorModeElement);
			}
			if (iconHeading != null) {
				Element iconHeadingElement = xmlDocument.createElement("heading");
				iconHeadingElement.appendChild(xmlDocument.createTextNode(iconHeading.toString()));
				iconStyleElement.appendChild(iconHeadingElement);
			}
			icon.addKml(iconStyleElement, model, xmlDocument);
			if (iconScale != null) {
				Element iconScaleElement = xmlDocument.createElement("scale");
				iconScaleElement.appendChild(xmlDocument.createTextNode(iconScale.toString()));
				iconStyleElement.appendChild(iconScaleElement);
			}
			styleElement.appendChild(iconStyleElement);
		}
		
		// We check if a label style should be added
		if (labelColor != null || labelColorMode != null || labelScale != null) {
			Element labelStyleElement = xmlDocument.createElement("LabelStyle");
			if (labelColor != null) {
				Element labelColorElement = xmlDocument.createElement("color");
				labelColorElement.appendChild(xmlDocument.createTextNode(labelColor.toHexString()));
				labelStyleElement.appendChild(labelColorElement);
			}
			if (labelColorMode != null) {
				Element labelColorModeElement = xmlDocument.createElement("colorMode");
				labelColorModeElement.appendChild(xmlDocument.createTextNode(labelColorMode.toString()));
				labelStyleElement.appendChild(labelColorModeElement);
			}
			if (labelScale != null) {
				Element labelScaleElement = xmlDocument.createElement("scale");
				labelScaleElement.appendChild(xmlDocument.createTextNode(labelScale.toString()));
				labelStyleElement.appendChild(labelScaleElement);
			}
			styleElement.appendChild(labelStyleElement);
		}
		
		// We check if a line style should be added
		if (lineColor != null || lineColorMode != null || lineWidth != null) {
			Element lineStyleElement = xmlDocument.createElement("LineStyle");
			if (lineColor != null) {
				Element lineColorElement = xmlDocument.createElement("color");
				lineColorElement.appendChild(xmlDocument.createTextNode(lineColor.toHexString()));
				lineStyleElement.appendChild(lineColorElement);
			}
			if (lineColorMode != null) {
				Element lineColorModeElement = xmlDocument.createElement("colorMode");
				lineColorModeElement.appendChild(xmlDocument.createTextNode(lineColorMode.toString()));
				lineStyleElement.appendChild(lineColorModeElement);
			}
			if (lineWidth != null) {
				Element lineWidthElement = xmlDocument.createElement("width");
				lineWidthElement.appendChild(xmlDocument.createTextNode(lineWidth.toString()));
				lineStyleElement.appendChild(lineWidthElement);
			}
			styleElement.appendChild(lineStyleElement);
		}
		
		// We check if a poly style should be added
		if (polygonColor != null || polygonColorMode != null || polygonFill != null || polygonOutline != null) {
			Element polyStyleElement = xmlDocument.createElement("PolyStyle");
			if (polygonColor != null) {
				Element polygonColorElement = xmlDocument.createElement("color");
				polygonColorElement.appendChild(xmlDocument.createTextNode(polygonColor.toHexString()));
				polyStyleElement.appendChild(polygonColorElement);
			}
			if (polygonColorMode != null) {
				Element polygonColorModeElement = xmlDocument.createElement("colorMode");
				polygonColorModeElement.appendChild(xmlDocument.createTextNode(polygonColorMode.toString()));
				polyStyleElement.appendChild(polygonColorModeElement);
			}
			if (polygonFill != null) {
				Element polygonFillElement = xmlDocument.createElement("fill");
				polygonFillElement.appendChild(xmlDocument.createTextNode((polygonFill? "1" : "0")));
				polyStyleElement.appendChild(polygonFillElement);
			}
			if (polygonOutline != null) {
				Element polygonOutlineElement = xmlDocument.createElement("outline");
				polygonOutlineElement.appendChild(xmlDocument.createTextNode((polygonOutline? "1" : "0")));
				polyStyleElement.appendChild(polygonOutlineElement);
			}
			styleElement.appendChild(polyStyleElement);
		}
		
		parentElement.appendChild(styleElement);
	}

	public Color getBalloonColor() {
		return balloonColor;
	}

	public void setBalloonColor(Color balloonColor) {
		this.balloonColor = balloonColor;
	}

	public String getBalloonText() {
		return balloonText;
	}

	public void setBalloonText(String balloonText) {
		this.balloonText = balloonText;
	}

	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	public Color getIconColor() {
		return iconColor;
	}

	public void setIconColor(Color iconColor) {
		this.iconColor = iconColor;
	}

	public ColorModes getIconColorMode() {
		return iconColorMode;
	}

	public void setIconColorMode(ColorModes iconColorMode) {
		this.iconColorMode = iconColorMode;
	}

	public Double getIconHeading() {
		return iconHeading;
	}

	public void setIconHeading(Double iconHeading) {
		this.iconHeading = iconHeading;
	}

	public Double getIconScale() {
		return iconScale;
	}

	public void setIconScale(Double iconScale) {
		this.iconScale = iconScale;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Color getLabelColor() {
		return labelColor;
	}

	public void setLabelColor(Color labelColor) {
		this.labelColor = labelColor;
	}

	public ColorModes getLabelColorMode() {
		return labelColorMode;
	}

	public void setLabelColorMode(ColorModes labelColorMode) {
		this.labelColorMode = labelColorMode;
	}

	public Double getLabelScale() {
		return labelScale;
	}

	public void setLabelScale(Double labelScale) {
		this.labelScale = labelScale;
	}

	public Color getLineColor() {
		return lineColor;
	}

	public void setLineColor(Color lineColor) {
		this.lineColor = lineColor;
	}

	public ColorModes getLineColorMode() {
		return lineColorMode;
	}

	public void setLineColorMode(ColorModes lineColorMode) {
		this.lineColorMode = lineColorMode;
	}

	public Integer getLineWidth() {
		return lineWidth;
	}

	public void setLineWidth(Integer lineWidth) {
		this.lineWidth = lineWidth;
	}

	public Color getPolygonColor() {
		return polygonColor;
	}

	public void setPolygonColor(Color polygonColor) {
		this.polygonColor = polygonColor;
	}

	public ColorModes getPolygonColorMode() {
		return polygonColorMode;
	}

	public void setPolygonColorMode(ColorModes polygonColorMode) {
		this.polygonColorMode = polygonColorMode;
	}

	public Boolean getPolygonFill() {
		return polygonFill;
	}

	public void setPolygonFill(Boolean polygonFill) {
		this.polygonFill = polygonFill;
	}

	public Boolean getPolygonOutline() {
		return polygonOutline;
	}

	public void setPolygonOutline(Boolean polygonOutline) {
		this.polygonOutline = polygonOutline;
	}

	public Color getBalloonTextColor() {
		return balloonTextColor;
	}

	public void setBalloonTextColor(Color textColor) {
		this.balloonTextColor = textColor;
	}
	
}
