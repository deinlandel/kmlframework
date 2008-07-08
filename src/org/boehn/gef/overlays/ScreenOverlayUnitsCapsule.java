package org.boehn.gef.overlays;

import org.boehn.gef.ModelException;
import org.boehn.gef.Model;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public abstract class ScreenOverlayUnitsCapsule {
	
	private String name;
	private Double x;
	private Double y;
	private Units xUnits;
	private Units yUnits;
	
	public ScreenOverlayUnitsCapsule() {}
	
	public ScreenOverlayUnitsCapsule(String name, Double x, Double y, Units xUnits, Units yUnits) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.xUnits = xUnits;
		this.yUnits = yUnits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Units getXUnits() {
		return xUnits;
	}

	public void setXUnits(Units units) {
		xUnits = units;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public Units getYUnits() {
		return yUnits;
	}

	public void setYUnits(Units units) {
		yUnits = units;
	}
	
	public void addKml(Element parentElement, Model model, Document xmlDocument) throws ModelException {
		Element element = xmlDocument.createElement(name);
		if (x != null) {
			element.setAttribute("x", x.toString());
		}
		if (y != null) {
			element.setAttribute("y", y.toString());
		}
		if (xUnits != null) {
			element.setAttribute("xunits", xUnits.toString());
		}
		if (yUnits != null) {
			element.setAttribute("yunits", yUnits.toString());
		}
		parentElement.appendChild(element);
	}

}