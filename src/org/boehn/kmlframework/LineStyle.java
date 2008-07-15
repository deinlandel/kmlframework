package org.boehn.kmlframework;

public class LineStyle extends ColorStyle {

	private Double width;
	
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<LineStyle" + getIdAndTargetIdFormatted() + ">", 1);
		super.writeInner(kmlDocument);
		if (width != null) {
			kmlDocument.println("<width>" + width + "</width>");
		}
		kmlDocument.println(-1, "</LineStyle>");
	}
}