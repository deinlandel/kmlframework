package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class MultiPoint {

	private String id;
	private Collection<Point> points;
	private Extrude extrude;

	public MultiPoint() {
	}

	public MultiPoint(String id, Collection<Point> points, Extrude extrude) {
		this.id = id;
		this.points = points;
		this.extrude = extrude;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<Point> getPoints() {
		return this.points;
	}

	public void setPoints(Collection<Point> points) {
		this.points = points;
	}

	public Extrude getExtrude() {
		return this.extrude;
	}

	public void setExtrude(Extrude extrude) {
		this.extrude = extrude;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("MultiPoint");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.points != null) {
			for (Point point: this.points) {
				element.appendChild(point.getElement(xmlDocument));
			}
		}
		if (this.extrude != null) {
			element.appendChild(this.extrude.getElement(xmlDocument));
		}

		return element;
	}
}
