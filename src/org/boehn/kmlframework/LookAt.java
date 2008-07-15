package org.boehn.kmlframework;

public class LookAt extends AbstractView {

	private Double range;

	public Double getRange() {
		return range;
	}

	public void setRange(Double range) {
		this.range = range;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<LookAt" + getIdAndTargetIdFormatted() + ">", 1);
		super.writeInner(kmlDocument);
		if (range != null) {
			kmlDocument.println("<range>" + range + "</range>");
		}
		kmlDocument.println(-1, "</LookAt>");
	}
}