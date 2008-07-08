package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class MultiGeometry {

	private String id;
	private AltitudeMode altitudeMode;
	private Extrude extrude;
	private Tessellate tessellate;
	private Collection<LinearRing> linearRings;
	private Collection<LineString> lineStrings;
	private Collection<MultiGeometry> multiGeometrys;
	private Collection<MultiLineString> multiLineStrings;
	private Collection<MultiPoint> multiPoints;
	private Collection<MultiPolygon> multiPolygons;
	private Collection<Point> points;
	private Collection<Polygon> polygons;

	public MultiGeometry() {
	}

	public MultiGeometry(String id, AltitudeMode altitudeMode, Extrude extrude, Tessellate tessellate, Collection<LinearRing> linearRings, Collection<LineString> lineStrings, Collection<MultiGeometry> multiGeometrys, Collection<MultiLineString> multiLineStrings, Collection<MultiPoint> multiPoints, Collection<MultiPolygon> multiPolygons, Collection<Point> points, Collection<Polygon> polygons) {
		this.id = id;
		this.altitudeMode = altitudeMode;
		this.extrude = extrude;
		this.tessellate = tessellate;
		this.linearRings = linearRings;
		this.lineStrings = lineStrings;
		this.multiGeometrys = multiGeometrys;
		this.multiLineStrings = multiLineStrings;
		this.multiPoints = multiPoints;
		this.multiPolygons = multiPolygons;
		this.points = points;
		this.polygons = polygons;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
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

	public Collection<LinearRing> getLinearRings() {
		return this.linearRings;
	}

	public void setLinearRings(Collection<LinearRing> linearRings) {
		this.linearRings = linearRings;
	}

	public Collection<LineString> getLineStrings() {
		return this.lineStrings;
	}

	public void setLineStrings(Collection<LineString> lineStrings) {
		this.lineStrings = lineStrings;
	}

	public Collection<MultiGeometry> getMultiGeometrys() {
		return this.multiGeometrys;
	}

	public void setMultiGeometrys(Collection<MultiGeometry> multiGeometrys) {
		this.multiGeometrys = multiGeometrys;
	}

	public Collection<MultiLineString> getMultiLineStrings() {
		return this.multiLineStrings;
	}

	public void setMultiLineStrings(Collection<MultiLineString> multiLineStrings) {
		this.multiLineStrings = multiLineStrings;
	}

	public Collection<MultiPoint> getMultiPoints() {
		return this.multiPoints;
	}

	public void setMultiPoints(Collection<MultiPoint> multiPoints) {
		this.multiPoints = multiPoints;
	}

	public Collection<MultiPolygon> getMultiPolygons() {
		return this.multiPolygons;
	}

	public void setMultiPolygons(Collection<MultiPolygon> multiPolygons) {
		this.multiPolygons = multiPolygons;
	}

	public Collection<Point> getPoints() {
		return this.points;
	}

	public void setPoints(Collection<Point> points) {
		this.points = points;
	}

	public Collection<Polygon> getPolygons() {
		return this.polygons;
	}

	public void setPolygons(Collection<Polygon> polygons) {
		this.polygons = polygons;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("MultiGeometry");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
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
		if (this.linearRings != null) {
			for (LinearRing linearRing: this.linearRings) {
				element.appendChild(linearRing.getElement(xmlDocument));
			}
		}
		if (this.lineStrings != null) {
			for (LineString lineString: this.lineStrings) {
				element.appendChild(lineString.getElement(xmlDocument));
			}
		}
		if (this.multiGeometrys != null) {
			for (MultiGeometry multiGeometry: this.multiGeometrys) {
				element.appendChild(multiGeometry.getElement(xmlDocument));
			}
		}
		if (this.multiLineStrings != null) {
			for (MultiLineString multiLineString: this.multiLineStrings) {
				element.appendChild(multiLineString.getElement(xmlDocument));
			}
		}
		if (this.multiPoints != null) {
			for (MultiPoint multiPoint: this.multiPoints) {
				element.appendChild(multiPoint.getElement(xmlDocument));
			}
		}
		if (this.multiPolygons != null) {
			for (MultiPolygon multiPolygon: this.multiPolygons) {
				element.appendChild(multiPolygon.getElement(xmlDocument));
			}
		}
		if (this.points != null) {
			for (Point point: this.points) {
				element.appendChild(point.getElement(xmlDocument));
			}
		}
		if (this.polygons != null) {
			for (Polygon polygon: this.polygons) {
				element.appendChild(polygon.getElement(xmlDocument));
			}
		}

		return element;
	}
}
