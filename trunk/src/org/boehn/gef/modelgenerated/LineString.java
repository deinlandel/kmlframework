package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class LineString {

	private String id;
	private Collection<Coordinates> coordinatess;
	private AltitudeMode altitudeMode;
	private Extrude extrude;
	private Tessellate tessellate;

	public LineString() {
	}

	public LineString(String id, Collection<Coordinates> coordinatess, AltitudeMode altitudeMode, Extrude extrude, Tessellate tessellate) {
		this.id = id;
		this.coordinatess = coordinatess;
		this.altitudeMode = altitudeMode;
		this.extrude = extrude;
		this.tessellate = tessellate;
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

	public Tessellate getTessellate() {
		return this.tessellate;
	}

	public void setTessellate(Tessellate tessellate) {
		this.tessellate = tessellate;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("LineString");
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
		if (this.altitudeMode != null) {
			element.appendChild(this.altitudeMode.getElement(xmlDocument));
		}
		if (this.extrude != null) {
			element.appendChild(this.extrude.getElement(xmlDocument));
		}
		if (this.tessellate != null) {
			element.appendChild(this.tessellate.getElement(xmlDocument));
		}

		return element;
	}
}
