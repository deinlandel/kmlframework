package org.boehn.kmlframework;

public class Alias extends KmlObject {

	private String targetHref;
	private String sourceHref;
	
	public String getTargetHref() {
		return targetHref;
	}

	public void setTargetHref(String targetHref) {
		this.targetHref = targetHref;
	}

	public String getSourceHref() {
		return sourceHref;
	}

	public void setSourceHref(String sourceHref) {
		this.sourceHref = sourceHref;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<Alias" + getIdAndTargetIdFormatted() + ">", 1);
		if (targetHref != null) {
			kmlDocument.println("<targetHref>" + targetHref + "</targetHref>");
		}
		if (sourceHref != null) {
			kmlDocument.println("<sourceHref>" + sourceHref + "</sourceHref>");
		}
		kmlDocument.println(-1, "</Alias>");
	}
}