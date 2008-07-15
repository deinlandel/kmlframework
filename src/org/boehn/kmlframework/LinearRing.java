package org.boehn.kmlframework;

import java.util.List;

public class LinearRing extends Geometry {

	private Boolean extrude;
	private Boolean tessellate;
	private AltitudeModeEnum altitudeMode;
	private List<Point> coordinates;
	
	public Boolean getExtrude() {
		return extrude;
	}

	public void setExtrude(Boolean extrude) {
		this.extrude = extrude;
	}

	public Boolean getTessellate() {
		return tessellate;
	}

	public void setTessellate(Boolean tessellate) {
		this.tessellate = tessellate;
	}

	public AltitudeModeEnum getAltitudeMode() {
		return altitudeMode;
	}

	public void setAltitudeMode(AltitudeModeEnum altitudeMode) {
		this.altitudeMode = altitudeMode;
	}

	public List<Point> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<Point> coordinates) {
		this.coordinates = coordinates;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		// We validate the data
		if (coordinates == null || coordinates.size() < 3) {
			throw new KmlException("LineString must contain at least 3 points");
		}
		
		kmlDocument.println("<LinearRing" + getIdAndTargetIdFormatted() + ">", 1);
		if (extrude != null) {
			kmlDocument.println("<extrude>" + booleanToInt(extrude) + "</extrude>");
		}
		if (tessellate!= null) {
			kmlDocument.println("<tessellate>" + booleanToInt(tessellate) + "</tessellate>");
		}
		if (altitudeMode!= null) {
			kmlDocument.println("<altitudeMode>" + altitudeMode + "</altitudeMode>");
		}
		kmlDocument.print("<coordinates>");
		boolean firstLoop = true;
		for (Point point : coordinates) {
			if (firstLoop) {
				firstLoop = false;
			} else {
				kmlDocument.print(" ");
			}
			kmlDocument.print(point.getLongitudeLatitudeAltitudeString());
		}
		// We add the first coordinate to the end, as KML require the first coordinate to be equal to the last
		kmlDocument.print(" " + coordinates.get(0).getLongitudeLatitudeAltitudeString());
		
		kmlDocument.println("</coordinates>");

		kmlDocument.println(-1, "</LinearRing>");
	}

}