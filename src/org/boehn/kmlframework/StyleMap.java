package org.boehn.kmlframework;

import java.util.List;

public class StyleMap extends StyleSelector {

	private List<Pair> pairs;
	
	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<StyleMap" + getIdAndTargetIdFormatted() + ">", 1);
		if (pairs != null) {
			for (Pair pair : pairs) {
				pair.write(kmlDocument);
			}
		}
		kmlDocument.println(-1, "</StyleMap>");
	}
}
