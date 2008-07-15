package org.boehn.kmlframework;

public class GroundOverlay extends Overlay {

	private Double altitude;
	private AltitudeModeEnum altitudeMode;
	private Double north;
	private Double south;
	private Double east;
	private Double west;
	private Double rotation;
	
	public Double getAltitude() {
		return altitude;
	}

	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

	public AltitudeModeEnum getAltitudeMode() {
		return altitudeMode;
	}

	public void setAltitudeMode(AltitudeModeEnum altitudeMode) {
		this.altitudeMode = altitudeMode;
	}

	public Double getNorth() {
		return north;
	}

	public void setNorth(Double north) {
		this.north = north;
	}

	public Double getSouth() {
		return south;
	}

	public void setSouth(Double south) {
		this.south = south;
	}

	public Double getEast() {
		return east;
	}

	public void setEast(Double east) {
		this.east = east;
	}

	public Double getWest() {
		return west;
	}

	public void setWest(Double west) {
		this.west = west;
	}

	public Double getRotation() {
		return rotation;
	}

	public void setRotation(Double rotation) {
		this.rotation = rotation;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<GroundOverlay" + getIdAndTargetIdFormatted() + ">", 1);
		super.writeInner(kmlDocument);
		if (altitude != null) {
			kmlDocument.println("<altitude>" + altitude + "</altitude>");
		}
		if (altitudeMode != null) {
			kmlDocument.println("<altitudeMode>" + altitudeMode + "</altitudeMode>");
		}
		if (north != null || south != null || east != null || west != null || rotation != null) {
			kmlDocument.println("<LatLonBox>", 1);
			if (north != null) {
				kmlDocument.println("<north>" + north + "</north>");
			}
			if (south != null) {
				kmlDocument.println("<south>" + south + "</south>");
			}
			if (east != null) {
				kmlDocument.println("<east>" + east + "</east>");
			}
			if (west != null) {
				kmlDocument.println("<west>" + west + "</west>");
			}
			if (rotation != null) {
				kmlDocument.println("<rotation>" + rotation + "</rotation>");
			}
			kmlDocument.println(-1, "</LatLonBox>");
		}
		kmlDocument.println(-1, "</GroundOverlay>");
	}
}