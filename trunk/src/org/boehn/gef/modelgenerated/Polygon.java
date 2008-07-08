package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class Polygon {

	private String id;
	private Collection<InnerBoundaryIs> innerBoundaryIss;
	private Collection<LinearRing> linearRings;
	private Collection<OuterBoundaryIs> outerBoundaryIss;
	private AltitudeMode altitudeMode;
	private Extrude extrude;

	public Polygon() {
	}

	public Polygon(String id, Collection<InnerBoundaryIs> innerBoundaryIss, Collection<LinearRing> linearRings, Collection<OuterBoundaryIs> outerBoundaryIss, AltitudeMode altitudeMode, Extrude extrude) {
		this.id = id;
		this.innerBoundaryIss = innerBoundaryIss;
		this.linearRings = linearRings;
		this.outerBoundaryIss = outerBoundaryIss;
		this.altitudeMode = altitudeMode;
		this.extrude = extrude;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<InnerBoundaryIs> getInnerBoundaryIs() {
		return this.innerBoundaryIss;
	}

	public void setInnerBoundaryIs(Collection<InnerBoundaryIs> innerBoundaryIss) {
		this.innerBoundaryIss = innerBoundaryIss;
	}

	public Collection<LinearRing> getLinearRings() {
		return this.linearRings;
	}

	public void setLinearRings(Collection<LinearRing> linearRings) {
		this.linearRings = linearRings;
	}

	public Collection<OuterBoundaryIs> getOuterBoundaryIs() {
		return this.outerBoundaryIss;
	}

	public void setOuterBoundaryIs(Collection<OuterBoundaryIs> outerBoundaryIss) {
		this.outerBoundaryIss = outerBoundaryIss;
	}

	public AltitudeMode getAltitudeMode() {
		return this.altitudeMode;
	}

	public void setAltitudeMode(AltitudeMode altitudeMode) {
		this.altitudeMode = altitudeMode;
	}

	public Extrude getExtrude() {
		return this.extrude;
	}

	public void setExtrude(Extrude extrude) {
		this.extrude = extrude;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("Polygon");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.innerBoundaryIss != null) {
			for (InnerBoundaryIs innerBoundaryIs: this.innerBoundaryIss) {
				element.appendChild(innerBoundaryIs.getElement(xmlDocument));
			}
		}
		if (this.linearRings != null) {
			for (LinearRing linearRing: this.linearRings) {
				element.appendChild(linearRing.getElement(xmlDocument));
			}
		}
		if (this.outerBoundaryIss != null) {
			for (OuterBoundaryIs outerBoundaryIs: this.outerBoundaryIss) {
				element.appendChild(outerBoundaryIs.getElement(xmlDocument));
			}
		}
		if (this.altitudeMode != null) {
			element.appendChild(this.altitudeMode.getElement(xmlDocument));
		}
		if (this.extrude != null) {
			element.appendChild(this.extrude.getElement(xmlDocument));
		}

		return element;
	}
}
