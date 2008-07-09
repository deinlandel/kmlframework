package org.boehn.kmlframework;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ViewPosition {

	private double longitude;
	private double latitude;
	private Double range;
	private Double tilt;
	private Double heading;
	
	public ViewPosition() {
	}
	
	public ViewPosition(double latitude, double longitude) {
		this(latitude, longitude, null, null, null);
	}
	
	public ViewPosition(double latitude, double longitude, Double range, Double tilt, Double heading) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.range = range;
		this.tilt = tilt;
		this.heading = heading;
	}

	public Double getHeading() {
		return heading;
	}

	public void setHeading(Double heading) {
		this.heading = heading;
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

	public Double getRange() {
		return range;
	}

	public void setRange(Double range) {
		this.range = range;
	}

	public Double getTilt() {
		return tilt;
	}

	public void setTilt(Double tilt) {
		this.tilt = tilt;
	}

	public void addKml(Element parentElement, Model model, Document xmlDocument) {
		Element lookAtElement = xmlDocument.createElement("LookAt");
		
		Element longitudeElement = xmlDocument.createElement("longitude");
		longitudeElement.appendChild(xmlDocument.createTextNode(Double.toString(longitude)));
		lookAtElement.appendChild(longitudeElement);
		
		Element latitudeElement = xmlDocument.createElement("latitude");
		latitudeElement.appendChild(xmlDocument.createTextNode(Double.toString(latitude)));
		lookAtElement.appendChild(latitudeElement);
		
		if (range != null) {
			Element rangeElement = xmlDocument.createElement("range");
			rangeElement.appendChild(xmlDocument.createTextNode(range.toString()));
			lookAtElement.appendChild(rangeElement);
		}
		
		if (tilt!= null) {
			Element tiltElement = xmlDocument.createElement("tilt");
			tiltElement.appendChild(xmlDocument.createTextNode(tilt.toString()));
			lookAtElement.appendChild(tiltElement);
		}
		
		if (heading != null) {
			Element headingElement = xmlDocument.createElement("heading");
			headingElement.appendChild(xmlDocument.createTextNode(heading.toString()));
			lookAtElement.appendChild(headingElement);
		}

		parentElement.appendChild(lookAtElement);
	}
}
