package org.boehn.kmlframework;

import java.util.List;

public class Model extends Geometry {

	private AltitudeModeEnum altitudeMode;
	private Double longitude;
	private Double latitude;
	private Integer altitude;
	private Double heading;
	private Double tilt;
	private Double roll;
	private Double scaleX;
	private Double scaleY;
	private Double scaleZ;
	private Link link;
	private List<Alias> resourceMap;
	
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

	public Integer getAltitude() {
		return altitude;
	}

	public void setAltitude(Integer altitude) {
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

	public Double getRoll() {
		return roll;
	}

	public void setRoll(Double roll) {
		this.roll = roll;
	}

	public Double getScaleX() {
		return scaleX;
	}

	public void setScaleX(Double scaleX) {
		this.scaleX = scaleX;
	}

	public Double getScaleY() {
		return scaleY;
	}

	public void setScaleY(Double scaleY) {
		this.scaleY = scaleY;
	}

	public Double getScaleZ() {
		return scaleZ;
	}

	public void setScaleZ(Double scaleZ) {
		this.scaleZ = scaleZ;
	}

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	public List<Alias> getResourceMap() {
		return resourceMap;
	}

	public void setResourceMap(List<Alias> resourceMap) {
		this.resourceMap = resourceMap;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<Model" + getIdAndTargetIdFormatted() + ">", 1);
		if (altitudeMode != null) {
			kmlDocument.println("<altitudeMode>" + altitudeMode + "</altitudeMode>");
		}
		if (longitude != null || latitude != null || altitude != null) {
			kmlDocument.println("<Location>", 1);
			if (longitude != null) {				
				kmlDocument.println("<longitude>" + longitude + "</longitude>");
			}
			if (latitude != null) {				
				kmlDocument.println("<latitude>" + latitude + "</latitude>");
			}
			if (altitude != null) {
				kmlDocument.println("<altitude>" + altitude + "</altitude>");
			}
			kmlDocument.println(-1, "</Location>");
		}
		if (heading != null || tilt != null || roll != null) {
			kmlDocument.println("<Orientation>", 1);
			if (heading != null) {				
				kmlDocument.println("<heading>" + heading + "</heading>");
			}
			if (tilt != null) {				
				kmlDocument.println("<tilt>" + tilt + "</tilt>");
			}
			if (roll != null) {
				kmlDocument.println("<roll>" + roll + "</roll>");
			}
			kmlDocument.println(-1, "</Orientation>");
		}
		if (scaleX != null || scaleY != null || scaleZ != null) {
			kmlDocument.println("<Scale>", 1);
			if (scaleX != null) {				
				kmlDocument.println("<x>" + scaleX + "</x>");
			}
			if (scaleY != null) {				
				kmlDocument.println("<y>" + scaleY+ "</y>");
			}
			if (scaleZ != null) {
				kmlDocument.println("<z>" + scaleZ + "</z>");
			}
			kmlDocument.println(-1, "</Scale>");
		}
		if (link != null) {
			link.write(kmlDocument);
		}
		if (resourceMap != null) {
			kmlDocument.println("<ResourceMap>", -1);
			for (Alias alias : resourceMap) {
				alias.write(kmlDocument);
			}
			kmlDocument.println(-1, "</ResourceMap>");
		}
		kmlDocument.println(-1, "</Model>");
	}
}