package org.boehn.kmlframework;

public class Folder extends Container {

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<Folder" + getIdAndTargetIdFormatted() + ">", 1);
		writeInner(kmlDocument);
		kmlDocument.println(-1, "</Folder>");
	}

}
