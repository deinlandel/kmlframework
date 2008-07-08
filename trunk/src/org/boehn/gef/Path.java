package org.boehn.gef;

import java.util.ArrayList;
import java.util.List;

import org.boehn.gef.coordinates.CartesianCoordinate;
import org.boehn.gef.coordinates.Coordinate;
import org.boehn.gef.coordinates.EarthCoordinate;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Path implements GraphicalModelElement {

	private List<Coordinate> coordinates;
	private Boolean extrude;
	private Boolean tessellate;
	private AltitudeModes altitudeMode;

	public Path() {}
	
	public Path(List<Coordinate> coordinates) {
		this(coordinates, null, null, null);
	}
	
	public Path(List<Coordinate> coordinates, Boolean extrude, Boolean tessellate, AltitudeModes altitudeMode) {
		this.coordinates = coordinates;
		this.extrude = extrude;
		this.tessellate = tessellate;
		this.altitudeMode = altitudeMode;
	}

	public AltitudeModes getAltitudeMode() {
		return altitudeMode;
	}

	public void setAltitudeMode(AltitudeModes altitudeMode) {
		this.altitudeMode = altitudeMode;
	}

	public Boolean getExtrude() {
		return extrude;
	}

	public void setExtrude(Boolean extrude) {
		this.extrude = extrude;
	}

	public Boolean getTessellate() {
		return tessellate;
	}

	public void setTessellate(Boolean tessellate) {
		this.tessellate = tessellate;
	}

	public List<Coordinate> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<Coordinate> coordinates) {
		this.coordinates = coordinates;
	}
	
	public void addCoordinate(Coordinate coordinate) {
		if (coordinates == null) {
			coordinates = new ArrayList<Coordinate>();
		}
		coordinates.add(coordinate);
	}
	
	public void addCoordinates(List<Coordinate> coordinates) {
		if (this.coordinates == null) {
			this.coordinates = coordinates;
		} else {
			this.coordinates.addAll(coordinates);
		}
	}

	public Element getCoordinates(Document xmlDocument, EarthCoordinate location, Double rotation, CartesianCoordinate localReferenceCoordinate, CartesianCoordinate scale) {
		Element coordinatesElement = xmlDocument.createElement("coordinates");
		
		StringBuffer coordinatesText = new StringBuffer();
		for (Coordinate coordinate : coordinates) {
			EarthCoordinate earthCoordinate = coordinate.toEarthCoordinate(location, rotation, localReferenceCoordinate, scale);
			coordinatesText.append(earthCoordinate.getLongitude() + "," + earthCoordinate.getLatitude() + "," + earthCoordinate.getAltitude() + " ");
		}
		// We remove the extra space added to the end of the string
		coordinatesText.deleteCharAt(coordinatesText.length()-1);
		
		coordinatesElement.appendChild(xmlDocument.createTextNode(coordinatesText.toString()));
		
		return coordinatesElement;
	}
	
	public void addKml(Element parentElement, Model model, Document xmlDocument, EarthCoordinate location, Double rotation, CartesianCoordinate localReferenceCoordinate, CartesianCoordinate scale) {
		Element pathElement = xmlDocument.createElement("LineString");
		
		if (coordinates != null) {
			pathElement.appendChild(getCoordinates(xmlDocument, location, rotation, localReferenceCoordinate, scale));
		}
		
		if (extrude != null) {
			Element extrudeElement = xmlDocument.createElement("extrude");
			extrudeElement.appendChild(xmlDocument.createTextNode((extrude) ? "1" : "0"));
			pathElement.appendChild(extrudeElement);
		}
		
		if (tessellate != null) {
			Element tessellateElement = xmlDocument.createElement("tessellate");
			tessellateElement.appendChild(xmlDocument.createTextNode((tessellate) ? "1" : "0"));
			pathElement.appendChild(tessellateElement);
		}
		
		if (altitudeMode != null) {
			Element altitudeModeElement = xmlDocument.createElement("altitudeMode");
			altitudeModeElement.appendChild(xmlDocument.createTextNode(altitudeMode.toString()));
			pathElement.appendChild(altitudeModeElement);
		}

		parentElement.appendChild(pathElement);
	}
	
	public String toString() {
		StringBuffer text = new StringBuffer("Path");
		text.append("altitudeMode: " + altitudeMode + "\n");
		text.append("extrude: " + extrude + "\n");
		text.append("tessellate: " + tessellate + "\n");
		text.append("coordinates: " + coordinates + "\n");
		return text.toString();
	}
		
}
