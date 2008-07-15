package org.boehn.kmlframework;

public class PolyStyle extends ColorStyle {

	private Boolean fill;
	private Boolean outline;
	
	public Boolean getFill() {
		return fill;
	}

	public void setFill(Boolean fill) {
		this.fill = fill;
	}

	public Boolean getOutline() {
		return outline;
	}

	public void setOutline(Boolean outline) {
		this.outline = outline;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<PolyStyle" + getIdAndTargetIdFormatted() + ">", 1);
		super.writeInner(kmlDocument);
		if (fill != null) {
			kmlDocument.println("<fill>" + booleanToInt(fill) + "</fill>");
		}
		if (outline != null) {
			kmlDocument.println("<outline>" + booleanToInt(outline) + "</outline>");
		}
		kmlDocument.println(-1, "</PolyStyle>");
	}
}