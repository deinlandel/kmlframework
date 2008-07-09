package org.boehn.kmlframework;

import java.util.Collection;

import org.boehn.kmlframework.coordinates.CartesianCoordinate;
import org.boehn.kmlframework.coordinates.Coordinate;
import org.boehn.kmlframework.coordinates.EarthCoordinate;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public interface GraphicalModelElement {

	public Collection<Coordinate> getCoordinates();
	public void addKml(Element parentElement, Model model, Document xmlDocument, EarthCoordinate earthCoordinate, Double rotation, CartesianCoordinate localReferenceCoordinate, CartesianCoordinate scale) throws ModelException;
	
}
