package org.boehn.kmlframework;

public class Icon extends Link {

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<Icon" + getIdAndTargetIdFormatted() + ">", 1);
		writeInner(kmlDocument);
		kmlDocument.println(-1, "</Icon>");
	}
}
