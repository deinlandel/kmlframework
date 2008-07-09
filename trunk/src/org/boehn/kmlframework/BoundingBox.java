package org.boehn.kmlframework;

import org.boehn.kmlframework.coordinates.EarthCoordinate;

public class BoundingBox {

	private Double north;
	private Double east;
	private Double south;
	private Double west;
	
	public BoundingBox() {}
	
	public BoundingBox(Double north, Double east, Double south, Double west) {
		this.north = north;
		this.east = east;
		this.south = south;
		this.west = west;
	}

	public boolean isInsideBoundingBox(EarthCoordinate earthCoordinate) {
		return earthCoordinate.getLatitude() < north && earthCoordinate.getLatitude() > south && earthCoordinate.getLongitude() > west && earthCoordinate.getLongitude() < east;
	}
	
	public Double getEast() {
		return east;
	}

	public void setEast(Double east) {
		this.east = east;
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

	public Double getWest() {
		return west;
	}

	public void setWest(Double west) {
		this.west = west;
	}
	
}
