package org.boehn.kmlframework.todo.coordinates;


public interface Coordinate {

	EarthCoordinate toEarthCoordinate(EarthCoordinate earthCoordinate, Double rotation, CartesianCoordinate localReferenceCoordinate, CartesianCoordinate scale);
	
}
