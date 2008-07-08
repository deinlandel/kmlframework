package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class MultiPolygon {

	private String id;
	private Collection<Polygon> polygons;
	private Extrude extrude;

	public MultiPolygon() {
	}

	public MultiPolygon(String id, Collection<Polygon> polygons, Extrude extrude) {
		this.id = id;
		this.polygons = polygons;
		this.extrude = extrude;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<Polygon> getPolygons() {
		return this.polygons;
	}

	public void setPolygons(Collection<Polygon> polygons) {
		this.polygons = polygons;
	}

	public Extrude getExtrude() {
		return this.extrude;
	}

	public void setExtrude(Extrude extrude) {
		this.extrude = extrude;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("MultiPolygon");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.polygons != null) {
			for (Polygon polygon: this.polygons) {
				element.appendChild(polygon.getElement(xmlDocument));
			}
		}
		if (this.extrude != null) {
			element.appendChild(this.extrude.getElement(xmlDocument));
		}

		return element;
	}
}
