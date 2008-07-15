package org.boehn.kmlframework.todo.overlays;

import java.io.IOException;
import java.io.Writer;

import org.boehn.kmlframework.KmlDocument;
import org.boehn.kmlframework.KmlException;
import org.boehn.kmlframework.todo.BoundingBox;
import org.boehn.kmlframework.todo.ViewPosition;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class GroundOverlay extends Overlay {

	private ViewPosition viewPosition;
	private String color;
	private BoundingBox boundingBox;
	
	public GroundOverlay() {}
	
	public BoundingBox getBoundingBox() {
		return boundingBox;
	}

	public void setBoundingBox(BoundingBox boundingBox) {
		this.boundingBox = boundingBox;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ViewPosition getViewPosition() {
		return viewPosition;
	}

	public void setViewPosition(ViewPosition viewPosition) {
		this.viewPosition = viewPosition;
	}

	public void addKml(Element parentElement, KmlDocument model, Document xmlDocument) throws KmlException {
		Element groundOverlayElement = xmlDocument.createElement("GroundOverlay");

		if (name != null) {
			Element nameElement = xmlDocument.createElement("name");
			nameElement.appendChild(xmlDocument.createTextNode(name));
			groundOverlayElement.appendChild(nameElement);
		}
		
		if (description != null) {
			Element descriptionElement = xmlDocument.createElement("description");
			descriptionElement.appendChild(xmlDocument.createCDATASection(description));
			groundOverlayElement.appendChild(descriptionElement);
		}
		
		if (color != null) {
			Element colorElement = xmlDocument.createElement("color");
			colorElement.appendChild(xmlDocument.createTextNode(color));
			groundOverlayElement.appendChild(colorElement);
		}
		
		if (viewPosition != null) {
			viewPosition.addKml(groundOverlayElement, model, xmlDocument);
		}
		
		if (boundingBox != null) {
			Element latLonBoxElement = xmlDocument.createElement("LatLonBox");
			if (boundingBox.getNorth() != null) {
				Element northElement = xmlDocument.createElement("north");
				northElement.appendChild(xmlDocument.createTextNode(boundingBox.getNorth().toString()));
				latLonBoxElement.appendChild(northElement);
			}
			if (boundingBox.getSouth() != null) {
				Element southElement = xmlDocument.createElement("south");
				southElement.appendChild(xmlDocument.createTextNode(boundingBox.getSouth().toString()));
				latLonBoxElement.appendChild(southElement);
			}
			if (boundingBox.getWest() != null) {
				Element westElement = xmlDocument.createElement("west");
				westElement.appendChild(xmlDocument.createTextNode(boundingBox.getWest().toString()));
				latLonBoxElement.appendChild(westElement);
			}
			if (boundingBox.getEast() != null) {
				Element eastElement = xmlDocument.createElement("east");
				eastElement.appendChild(xmlDocument.createTextNode(boundingBox.getEast().toString()));
				latLonBoxElement.appendChild(eastElement);
			}
			
			if (icon != null) {
				icon.addKml(groundOverlayElement, model, xmlDocument);
			}
			
			if (drawOrder != null) {
				Element drawOrderElement = xmlDocument.createElement("drawOrder");
				drawOrderElement.appendChild(xmlDocument.createTextNode(drawOrder.toString()));
				groundOverlayElement.appendChild(drawOrderElement);
			}
			
			if (visibility != null) {
				Element visibilityElement = xmlDocument.createElement("visibility");
				visibilityElement.appendChild(xmlDocument.createTextNode((visibility) ? "1" : "0"));
				groundOverlayElement.appendChild(visibilityElement);
			}
			groundOverlayElement.appendChild(latLonBoxElement);
		}
		
		parentElement.appendChild(groundOverlayElement);
	}

	/*public void addKmlXPP(KmlDocument model, XmlSerializer serializer) {
		// TODO Auto-generated method stub
		
	}*/

	public void addKmlDirect(KmlDocument model, Writer writer) throws IOException {
		// TODO Auto-generated method stub
		
	}

	
}
