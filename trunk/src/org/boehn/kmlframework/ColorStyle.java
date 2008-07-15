package org.boehn.kmlframework;

public abstract class ColorStyle extends KmlObject {

	private String color; // TOOD change to Java class?
	private ColorModeEnum colorMode;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public ColorModeEnum getColorMode() {
		return colorMode;
	}
	
	public void setColorMode(ColorModeEnum colorMode) {
		this.colorMode = colorMode;
	}
	
	public void writeInner(KmlDocument kmlDocument) throws KmlException {
		if (color != null) {
			kmlDocument.println("<color>" + color + "</color>");
		}
		if (colorMode != null) {
			kmlDocument.println("<colorMode>" + colorMode + "</colorMode>");
		}
	}
}