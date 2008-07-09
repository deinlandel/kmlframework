package org.boehn.kmlframework.overlays;

import java.io.IOException;
import java.io.Writer;

import org.boehn.kmlframework.Model;
import org.boehn.kmlframework.ModelException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xmlpull.v1.XmlSerializer;

public class ScreenOverlay extends Overlay {

	private OverlayXY overlayXY;
	private ScreenXY screenXY;
	private Size size;
	private Double rotation;
	
	public ScreenOverlay() {}

	public ScreenOverlayUnitsCapsule getOverlayXY() {
		return overlayXY;
	}

	public Double getRotation() {
		return rotation;
	}

	public void setRotation(Double rotation) {
		this.rotation = rotation;
	}

	public ScreenXY getScreenXY() {
		return screenXY;
	}

	public void setScreenXY(ScreenXY screenXY) {
		this.screenXY = screenXY;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public void setOverlayXY(OverlayXY overlayXY) {
		this.overlayXY = overlayXY;
	}

	public void addKml(Element parentElement, Model model, Document xmlDocument) throws ModelException {
		Element screenOverlayElement = xmlDocument.createElement("ScreenOverlay");

		if (name != null) {
			Element nameElement = xmlDocument.createElement("name");
			nameElement.appendChild(xmlDocument.createTextNode(name));
			screenOverlayElement.appendChild(nameElement);
		}
		
		if (description != null) {
			Element descriptionElement = xmlDocument.createElement("description");
			descriptionElement.appendChild(xmlDocument.createCDATASection(description));
			screenOverlayElement.appendChild(descriptionElement);
		}
		
		if (rotation != null) {
			Element rotationElement = xmlDocument.createElement("rotation");
			rotationElement.appendChild(xmlDocument.createTextNode(rotation.toString()));
			screenOverlayElement.appendChild(rotationElement);
		}
		
		if (overlayXY != null) {
			overlayXY.addKml(screenOverlayElement, model, xmlDocument);
		}
		
		if (screenXY != null) {
			screenXY.addKml(screenOverlayElement, model, xmlDocument);
		}
		
		if (size != null) {
			size.addKml(screenOverlayElement, model, xmlDocument);
		}
		
		if (icon != null) {
			icon.addKml(screenOverlayElement, model, xmlDocument);
		}
		
		if (drawOrder != null) {
			Element drawOrderElement = xmlDocument.createElement("drawOrder");
			drawOrderElement.appendChild(xmlDocument.createTextNode(drawOrder.toString()));
			screenOverlayElement.appendChild(drawOrderElement);
		}
		
		if (visibility != null) {
			Element visibilityElement = xmlDocument.createElement("visibility");
			visibilityElement.appendChild(xmlDocument.createTextNode((visibility) ? "1" : "0"));
			screenOverlayElement.appendChild(visibilityElement);
		}
		
		parentElement.appendChild(screenOverlayElement);
	}

	public void addKmlXPP(Model model, XmlSerializer serializer) {
		// TODO Auto-generated method stub
		
	}

	public void addKmlDirect(Model model, Writer writer) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
}
