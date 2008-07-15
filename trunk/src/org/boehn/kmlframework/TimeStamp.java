package org.boehn.kmlframework;

public class TimeStamp extends TimePrimitive {

	private String when;
	
	public String getWhen() {
		return when;
	}

	public void setWhen(String when) {
		this.when = when;
	}
	
	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<TimeStamp" + getIdAndTargetIdFormatted() + ">", 1);
		if (when != null) {
			kmlDocument.println("<when>" + when + "</when>");
		}
		kmlDocument.println(-1, "</TimeStamp>");
	}
}