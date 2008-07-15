package org.boehn.kmlframework;

public class Region extends KmlObject {

	private Double north;
	private Double south;
	private Double east;
	private Double west;
	private Double minAltitude;
	private Double maxAltitude;
	private AltitudeModeEnum altitudeMode;
	private Double minLodPixels;
	private Double maxLodPixels;
	private Double minFadeExtent;
	private Double maxFadeExtent;
	
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

	public Double getMinAltitude() {
		return minAltitude;
	}

	public void setMinAltitude(Double minAltitude) {
		this.minAltitude = minAltitude;
	}

	public Double getMaxAltitude() {
		return maxAltitude;
	}

	public void setMaxAltitude(Double maxAltitude) {
		this.maxAltitude = maxAltitude;
	}

	public AltitudeModeEnum getAltitudeMode() {
		return altitudeMode;
	}

	public void setAltitudeMode(AltitudeModeEnum altitudeMode) {
		this.altitudeMode = altitudeMode;
	}

	public Double getMinLodPixels() {
		return minLodPixels;
	}

	public void setMinLodPixels(Double minLodPixels) {
		this.minLodPixels = minLodPixels;
	}

	public Double getMaxLodPixels() {
		return maxLodPixels;
	}

	public void setMaxLodPixels(Double maxLodPixels) {
		this.maxLodPixels = maxLodPixels;
	}

	public Double getMinFadeExtent() {
		return minFadeExtent;
	}

	public void setMinFadeExtent(Double minFadeExtent) {
		this.minFadeExtent = minFadeExtent;
	}

	public Double getMaxFadeExtent() {
		return maxFadeExtent;
	}

	public void setMaxFadeExtent(Double maxFadeExtent) {
		this.maxFadeExtent = maxFadeExtent;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		// We validate the data
		if (north == null) {
			throw new KmlException("north is required in Region");
		}
		if (south == null) {
			throw new KmlException("south is required in Region");
		}
		if (east == null) {
			throw new KmlException("east is required in Region");
		}
		if (west == null) {
			throw new KmlException("west is required in Region");
		}
		
		kmlDocument.println("<Region" + getIdAndTargetIdFormatted() + ">", 1);
		kmlDocument.println("<LatLonAltBox>", 1);
		kmlDocument.println("<north>" + north + "</north>");
		kmlDocument.println("<south>" + south + "</south>");
		kmlDocument.println("<east>" + east + "</east>");
		kmlDocument.println("<west>" + west + "</west>");
		kmlDocument.println(-1, "<LatLonAltBox>");
		if (minAltitude != null) {
			kmlDocument.println("<minAltitude>" + minAltitude + "</minAltitude>");
		}
		if (maxAltitude != null) {
			kmlDocument.println("<maxAltitude>" + maxAltitude + "</maxAltitude>");
		}
		if (altitudeMode!= null) {
			kmlDocument.println("<altitudeMode>" + altitudeMode + "</altitudeMode>");
		}
		if (minLodPixels != null || maxLodPixels != null || minFadeExtent != null || maxFadeExtent != null) {
			kmlDocument.println("<Lod>", 1);
			if (minLodPixels != null) {
				kmlDocument.println("<minLodPixels>" + minLodPixels + "</minLodPixels>");
			}
			if (maxLodPixels != null) {
				kmlDocument.println("<maxLodPixels>" + maxLodPixels + "</maxLodPixels>");
			}
			if (minFadeExtent != null) {
				kmlDocument.println("<minFadeExtent>" + minFadeExtent + "</minFadeExtent>");
			}
			if (minFadeExtent != null) {
				kmlDocument.println("<minFadeExtent>" + minFadeExtent + "</minFadeExtent>");
			}
			if (maxFadeExtent != null) {
				kmlDocument.println("<maxFadeExtent>" + maxFadeExtent + "</maxFadeExtent>");
			}
			kmlDocument.println(-1, "<Lod>");
		}
		kmlDocument.println(-1, "</Region>");
	}
}