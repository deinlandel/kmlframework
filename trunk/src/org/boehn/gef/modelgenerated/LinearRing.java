package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class LinearRing {

	private String id;
	private Collection<Coordinates> coordinatess;

	public LinearRing() {
	}

	public LinearRing(String id, Collection<Coordinates> coordinatess) {
		this.id = id;
		this.coordinatess = coordinatess;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<Coordinates> getCoordinates() {
		return this.coordinatess;
	}

	public void setCoordinates(Collection<Coordinates> coordinatess) {
		this.coordinatess = coordinatess;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("LinearRing");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.coordinatess != null) {
			for (Coordinates coordinates: this.coordinatess) {
				element.appendChild(coordinates.getElement(xmlDocument));
			}
		}

		return element;
	}
}
