package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class OuterBoundaryIs {

	private String id;
	private Collection<LinearRing> linearRings;

	public OuterBoundaryIs() {
	}

	public OuterBoundaryIs(String id, Collection<LinearRing> linearRings) {
		this.id = id;
		this.linearRings = linearRings;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<LinearRing> getLinearRings() {
		return this.linearRings;
	}

	public void setLinearRings(Collection<LinearRing> linearRings) {
		this.linearRings = linearRings;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("outerBoundaryIs");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.linearRings != null) {
			for (LinearRing linearRing: this.linearRings) {
				element.appendChild(linearRing.getElement(xmlDocument));
			}
		}

		return element;
	}
}
