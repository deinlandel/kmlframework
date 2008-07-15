package org.boehn.kmlframework;

public class LabelStyle extends ColorStyle {

	private Double scale;
	
	public Double getScale() {
		return scale;
	}

	public void setScale(Double scale) {
		this.scale = scale;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<LabelStyle" + getIdAndTargetIdFormatted() + ">", 1);
		super.writeInner(kmlDocument);
		if (scale != null) {
			kmlDocument.println("<scale>" + scale + "</scale>");
		}
		kmlDocument.println(-1, "</LabelStyle>");
	}
}