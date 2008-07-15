package org.boehn.kmlframework;

public class Point extends Geometry {

	private Boolean extrude;
	private AltitudeModeEnum altitudeMode;
	private Double longitude;
	private Double latitude;
	private Double altitude;

	public Point() {}
	
	public Point(Double longitude, Double latitude) {
		setLongitude(longitude);
		setLatitude(latitude);
	}
	
	public Boolean getExtrude() {
		return extrude;
	}

	public void setExtrude(Boolean extrude) {
		this.extrude = extrude;
	}

	public AltitudeModeEnum getAltitudeMode() {
		return altitudeMode;
	}

	public void setAltitudeMode(AltitudeModeEnum altitudeMode) {
		this.altitudeMode = altitudeMode;
	}

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

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<Point" + getIdAndTargetIdFormatted() + ">", 1);
		if (extrude != null) {
			kmlDocument.println("<extrude>" + booleanToInt(extrude) + "</extrude>");
		}
		if (altitudeMode!= null) {
			kmlDocument.println("<altitudeMode>" + altitudeMode + "</altitudeMode>");
		}
		if (longitude != null && latitude != null) {
			kmlDocument.println("<coordinates>" + getLongitudeLatitudeAltitudeString() + "</coordinates>");
		}
		
		kmlDocument.println(-1, "</Point>");
	}
	
	public String getLongitudeLatitudeAltitudeString() {
		return longitude +"," + latitude + (altitude != null? "," + altitude : "");
	}
}
