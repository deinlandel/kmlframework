package org.boehn.gef;

import java.util.ArrayList;
import java.util.Collection;

import org.boehn.gef.coordinates.CartesianCoordinate;
import org.boehn.gef.coordinates.Coordinate;
import org.boehn.gef.coordinates.EarthCoordinate;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class GraphicalModel implements GraphicalModelElement {

	private Collection<GraphicalModelElement> elements;
	private Integer visibleFrom;
	private Integer visibleTo;
	
	public GraphicalModel() {}

	public Collection<GraphicalModelElement> getElements() {
		return elements;
	}

	public void setElements(Collection<GraphicalModelElement> elements) {
		this.elements = elements;
	}
	
	public void addGraphicalModelElement(GraphicalModelElement graphicalModelElement) {
		if (elements == null) {
			elements = new ArrayList<GraphicalModelElement>();
		}
		elements.add(graphicalModelElement);
	}

	public Integer getVisibleFrom() {
		return visibleFrom;
	}

	public void setVisibleFrom(Integer visibleFrom) {
		this.visibleFrom = visibleFrom;
	}

	public Integer getVisibleTo() {
		return visibleTo;
	}

	public void setVisibleTo(Integer visibleTo) {
		this.visibleTo = visibleTo;
	}
	
	public Collection<Coordinate> getCoordinates() {
		Collection<Coordinate> coordinates = new ArrayList<Coordinate>();
		for (GraphicalModelElement element : elements) {
			coordinates.addAll(element.getCoordinates());
		}
		return coordinates;
	}
	
	public void addKml(Element parentElement, Model model, Document xmlDocument, EarthCoordinate location, Double rotation, CartesianCoordinate localReferenceCoordinate, CartesianCoordinate scale) throws ModelException {		
		if (elements != null) {
			for (GraphicalModelElement element : elements) {
				element.addKml(parentElement, model, xmlDocument, location, rotation, localReferenceCoordinate, scale);
			}
		}
	}
	
	public String toString() {
		StringBuffer text = new StringBuffer("GraphicalModel:\n");
		text.append("   visibleFrom: " + visibleFrom + "\n");
		text.append("   visibleTo: " + visibleTo + "\n");
		text.append("   elements: " + elements);
		return text.toString();
	}
	
}
