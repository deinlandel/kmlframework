package org.boehn.kmlframework;

public class BallonStyle extends KmlObject {

	private String bgColor;
	private String textColor;
	private String text;
	private DisplayModeEnum displayMode;
	
	public String getBgColor() {
		return bgColor;
	}

	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

	public String getTextColor() {
		return textColor;
	}

	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public DisplayModeEnum getDisplayMode() {
		return displayMode;
	}

	public void setDisplayMode(DisplayModeEnum displayMode) {
		this.displayMode = displayMode;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<BallonStyle" + getIdAndTargetIdFormatted() + ">", 1);
		if (bgColor != null) {
			kmlDocument.println("<bgColor>" + bgColor + "</bgColor>");
		}
		if (textColor != null) {
			kmlDocument.println("<textColor>" + textColor + "</textColor>");
		}
		if (text != null) {
			kmlDocument.println("<text>" + text + "</text>");
		}
		if (displayMode != null) {
			kmlDocument.println("<displayMode>" + (displayMode == DisplayModeEnum._default ? "default" : displayMode) + "</displayMode>");
		}
		kmlDocument.println(-1, "</BallonStyle>");
	}
}