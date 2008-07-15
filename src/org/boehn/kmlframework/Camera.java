package org.boehn.kmlframework;

public class Camera extends AbstractView {

	private Double roll;

	public Double getRoll() {
		return roll;
	}

	public void setRoll(Double roll) {
		this.roll = roll;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<Camera" + getIdAndTargetIdFormatted() + ">", 1);
		super.writeInner(kmlDocument);
		if (roll != null) {
			kmlDocument.println("<roll>" + roll + "</roll>");
		}
		kmlDocument.println(-1, "</Camera>");
	}
}