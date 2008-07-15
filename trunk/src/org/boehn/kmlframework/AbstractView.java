package org.boehn.kmlframework;

public abstract class AbstractView extends KmlObject {
	
	private Double longitude;
	private Double latitude;
	private Double altitude;
	private Double heading;
	private Double tilt;
	private AltitudeModeEnum altitudeMode;

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getAltitude() {
		return altitude;
	}

	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

	public Double getHeading() {
		return heading;
	}

	public void setHeading(Double heading) {
		this.heading = heading;
	}

	public Double getTilt() {
		return tilt;
	}

	public void setTilt(Double tilt) {
		this.tilt = tilt;
	}

	public AltitudeModeEnum getAltitudeMode() {
		return altitudeMode;
	}

	public void setAltitudeMode(AltitudeModeEnum altitudeMode) {
		this.altitudeMode = altitudeMode;
	}

	public void writeInner(KmlDocument kmlDocument) throws KmlException {
		if (longitude != null) {
			kmlDocument.println("<longitude>" + longitude + "</longitude>");
		}
		if (latitude != null) {
			kmlDocument.println("<latitude>" + latitude + "</latitude>");
		}
		if (altitude != null) {
			kmlDocument.println("<altitude>" + altitude + "</altitude>");
		}
		if (heading != null) {
			kmlDocument.println("<heading>" + heading + "</heading>");
		}
		if (tilt != null) {
			kmlDocument.println("<tilt>" + tilt + "</tilt>");
		}
		if (altitudeMode != null) {
			kmlDocument.println("<altitudeMode>" + altitudeMode + "</altitudeMode>");
		}
	}
}
