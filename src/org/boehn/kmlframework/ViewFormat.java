package org.boehn.kmlframework;

public class ViewFormat extends KmlObject {

	private boolean includeBBox = true;
	private boolean includeCamera = true;
	private boolean includeView = true;
	
	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.print("<viewFormat" + getIdAndTargetIdFormatted() + ">");
		if (includeBBox) {
			kmlDocument.print("BBOX=[bboxWest],[bboxSouth],[bboxEast],[bboxNorth]");
		}
		if (includeBBox && includeCamera) {
			kmlDocument.print(";");
		}
		if (includeCamera) {
			kmlDocument.print("CAMERA=[lookatLon],[lookatLat],[lookatRange],[lookatTilt],[lookatHeading]");
		}
		if (includeCamera && includeView) {
			kmlDocument.print(";");
		}
		if (includeView) {
			kmlDocument.print("VIEW=[horizFov],[vertFov],[horizPixels],[vertPixels],[terrainEnabled]");
		}
		kmlDocument.println("</viewFormat>");
	}

}