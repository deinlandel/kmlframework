package org.boehn.kmlframework.todo;

import java.util.Collection;

import org.boehn.kmlframework.KmlDocument;
import org.boehn.kmlframework.KmlException;
import org.boehn.kmlframework.todo.coordinates.CartesianCoordinate;
import org.boehn.kmlframework.todo.coordinates.Coordinate;
import org.boehn.kmlframework.todo.coordinates.EarthCoordinate;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public interface GraphicalModelElement {

	public Collection<Coordinate> getCoordinates();
	public void addKml(Element parentElement, KmlDocument model, Document xmlDocument, EarthCoordinate earthCoordinate, Double rotation, CartesianCoordinate localReferenceCoordinate, CartesianCoordinate scale) throws KmlException;
	
}
