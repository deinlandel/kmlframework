package org.boehn.gef.coordinates;

import java.io.IOException;
import java.io.Writer;

import org.boehn.gef.AltitudeModes;
import org.boehn.gef.Model;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xmlpull.v1.XmlSerializer;

public class EarthCoordinate implements Coordinate {

	private double altitude;
	private double latitude;
	private double longitude;
	private Boolean extrude;
	private Boolean tessellate; 
	private AltitudeModes altitudeMode;
	public static double EARTHRADIUS = 6372795.477598; // in meters
	
	public EarthCoordinate() {}
	
	public EarthCoordinate(double altitude, double latitude, double longitude) {
		this.altitude = altitude;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public EarthCoordinate(double latitude, double longitude) {
		this(0, latitude, longitude);
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
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

	public void addKml(Element parentElement, Model model, Document xmlDocument) {
		Element pointElement = xmlDocument.createElement("Point");
		
		Element coordinatesElement = xmlDocument.createElement("coordinates");
		coordinatesElement.appendChild(xmlDocument.createTextNode(getLongitude() + "," + getLatitude() + "," + getAltitude()));
		pointElement.appendChild(coordinatesElement);
		
		if (extrude != null) {
			Element extrudeElement = xmlDocument.createElement("extrude");
			extrudeElement.appendChild(xmlDocument.createTextNode((extrude) ? "1" : "0"));
			pointElement.appendChild(extrudeElement);
		}
		
		if (tessellate != null) {
			Element tessellateElement = xmlDocument.createElement("tessellate");
			tessellateElement.appendChild(xmlDocument.createTextNode((tessellate) ? "1" : "0"));
			pointElement.appendChild(tessellateElement);
		}
		
		if (altitudeMode!= null) {
			Element altitudeModeElement = xmlDocument.createElement("altitudeMode");
			altitudeModeElement.appendChild(xmlDocument.createTextNode(altitudeMode.toString()));
			pointElement.appendChild(altitudeModeElement);
		}

		parentElement.appendChild(pointElement);
	}

	public void addKmlXPP(Model model, XmlSerializer serializer) throws IllegalArgumentException, IllegalStateException, IOException {
		serializer.startTag(null, "Point");
		serializer.startTag(null, "coordinates");
		serializer.text(getLongitude() + "," + getLatitude() + "," + getAltitude());
		serializer.endTag(null, "coordinates");
		serializer.endTag(null, "Point");
		
		/*Element coordinatesElement = xmlDocument.createElement("coordinates");
		coordinatesElement.appendChild(xmlDocument.createTextNode(getLongitude() + "," + getLatitude() + "," + getAltitude()));
		pointElement.appendChild(coordinatesElement);
		
		if (extrude != null) {
			Element extrudeElement = xmlDocument.createElement("extrude");
			extrudeElement.appendChild(xmlDocument.createTextNode((extrude) ? "1" : "0"));
			pointElement.appendChild(extrudeElement);
		}
		
		if (tessellate != null) {
			Element tessellateElement = xmlDocument.createElement("tessellate");
			tessellateElement.appendChild(xmlDocument.createTextNode((tessellate) ? "1" : "0"));
			pointElement.appendChild(tessellateElement);
		}
		
		if (altitudeMode!= null) {
			Element altitudeModeElement = xmlDocument.createElement("altitudeMode");
			altitudeModeElement.appendChild(xmlDocument.createTextNode(altitudeMode.toString()));
			pointElement.appendChild(altitudeModeElement);
		}

		parentElement.appendChild(pointElement);*/
	}

	public void addKmlDirect(Model model, Writer writer) throws IOException {
		writer.write("<Point><coordinates>" + getLongitude() + "," + getLatitude() + "," + getAltitude() + "</coordinates></Point>");
		
		/*Element coordinatesElement = xmlDocument.createElement("coordinates");
		coordinatesElement.appendChild(xmlDocument.createTextNode(getLongitude() + "," + getLatitude() + "," + getAltitude()));
		pointElement.appendChild(coordinatesElement);
		
		if (extrude != null) {
			Element extrudeElement = xmlDocument.createElement("extrude");
			extrudeElement.appendChild(xmlDocument.createTextNode((extrude) ? "1" : "0"));
			pointElement.appendChild(extrudeElement);
		}
		
		if (tessellate != null) {
			Element tessellateElement = xmlDocument.createElement("tessellate");
			tessellateElement.appendChild(xmlDocument.createTextNode((tessellate) ? "1" : "0"));
			pointElement.appendChild(tessellateElement);
		}
		
		if (altitudeMode!= null) {
			Element altitudeModeElement = xmlDocument.createElement("altitudeMode");
			altitudeModeElement.appendChild(xmlDocument.createTextNode(altitudeMode.toString()));
			pointElement.appendChild(altitudeModeElement);
		}

		parentElement.appendChild(pointElement);*/
	}
	
	public double getRadius() {
		return altitude + EARTHRADIUS;
	}
	
	public CartesianCoordinate toCartesianCoordinate() {
		CartesianCoordinate cartesianCoordinate = new CartesianCoordinate();
		cartesianCoordinate.setX(getRadius() * Math.sin(Math.PI/2 - latitude*(Math.PI/180)) * Math.cos(longitude*(Math.PI/180)));
		cartesianCoordinate.setY(getRadius() * Math.sin(Math.PI/2 - latitude*(Math.PI/180)) * Math.sin(longitude*(Math.PI/180)));
		cartesianCoordinate.setZ(getRadius() * Math.cos(Math.PI/2 - latitude*(Math.PI/180)));
		return cartesianCoordinate;
	}
	
	public double distanceTo(EarthCoordinate earthCoordinate) {
		return toCartesianCoordinate().distanceTo(earthCoordinate.toCartesianCoordinate());
	}
	
	public String toString() {
		return "[" + altitude + ", " + latitude + ", " + longitude + "]";
	}

	public EarthCoordinate toEarthCoordinate(EarthCoordinate earthCoordinate, Double rotation, CartesianCoordinate localReferenceCoordinate, CartesianCoordinate scale) {
		return this;
	}
	
}
