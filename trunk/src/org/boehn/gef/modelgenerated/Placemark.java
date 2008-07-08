package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class Placemark {

	private String id;
	private Collection<GeometryCollection> geometryCollections;
	private Collection<LineString> lineStrings;
	private LookAt lookAt;
	private Collection<MultiGeometry> multiGeometrys;
	private Collection<MultiLineString> multiLineStrings;
	private Collection<MultiPoint> multiPoints;
	private Collection<MultiPolygon> multiPolygons;
	private Collection<Point> points;
	private Collection<Polygon> polygons;
	private Collection<Style> styles;
	private Collection<TimePeriod> timePeriods;
	private Address address;
	private Description description;
	private Name name;
	private Open open;
	private Snippet snippet;
	private StyleUrl styleUrl;
	private Visibility visibility;

	public Placemark() {
	}

	public Placemark(String id, Collection<GeometryCollection> geometryCollections, Collection<LineString> lineStrings, LookAt lookAt, Collection<MultiGeometry> multiGeometrys, Collection<MultiLineString> multiLineStrings, Collection<MultiPoint> multiPoints, Collection<MultiPolygon> multiPolygons, Collection<Point> points, Collection<Polygon> polygons, Collection<Style> styles, Collection<TimePeriod> timePeriods, Address address, Description description, Name name, Open open, Snippet snippet, StyleUrl styleUrl, Visibility visibility) {
		this.id = id;
		this.geometryCollections = geometryCollections;
		this.lineStrings = lineStrings;
		this.lookAt = lookAt;
		this.multiGeometrys = multiGeometrys;
		this.multiLineStrings = multiLineStrings;
		this.multiPoints = multiPoints;
		this.multiPolygons = multiPolygons;
		this.points = points;
		this.polygons = polygons;
		this.styles = styles;
		this.timePeriods = timePeriods;
		this.address = address;
		this.description = description;
		this.name = name;
		this.open = open;
		this.snippet = snippet;
		this.styleUrl = styleUrl;
		this.visibility = visibility;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<GeometryCollection> getGeometryCollections() {
		return this.geometryCollections;
	}

	public void setGeometryCollections(Collection<GeometryCollection> geometryCollections) {
		this.geometryCollections = geometryCollections;
	}

	public Collection<LineString> getLineStrings() {
		return this.lineStrings;
	}

	public void setLineStrings(Collection<LineString> lineStrings) {
		this.lineStrings = lineStrings;
	}

	public LookAt getLookAt() {
		return this.lookAt;
	}

	public void setLookAt(LookAt lookAt) {
		this.lookAt = lookAt;
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

	public Collection<Style> getStyles() {
		return this.styles;
	}

	public void setStyles(Collection<Style> styles) {
		this.styles = styles;
	}

	public Collection<TimePeriod> getTimePeriods() {
		return this.timePeriods;
	}

	public void setTimePeriods(Collection<TimePeriod> timePeriods) {
		this.timePeriods = timePeriods;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Description getDescription() {
		return this.description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public Name getName() {
		return this.name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Open getOpen() {
		return this.open;
	}

	public void setOpen(Open open) {
		this.open = open;
	}

	public Snippet getSnippet() {
		return this.snippet;
	}

	public void setSnippet(Snippet snippet) {
		this.snippet = snippet;
	}

	public StyleUrl getStyleUrl() {
		return this.styleUrl;
	}

	public void setStyleUrl(StyleUrl styleUrl) {
		this.styleUrl = styleUrl;
	}

	public Visibility getVisibility() {
		return this.visibility;
	}

	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("Placemark");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.geometryCollections != null) {
			for (GeometryCollection geometryCollection: this.geometryCollections) {
				element.appendChild(geometryCollection.getElement(xmlDocument));
			}
		}
		if (this.lineStrings != null) {
			for (LineString lineString: this.lineStrings) {
				element.appendChild(lineString.getElement(xmlDocument));
			}
		}
		if (this.lookAt != null) {
			element.appendChild(this.lookAt.getElement(xmlDocument));
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
		if (this.styles != null) {
			for (Style style: this.styles) {
				element.appendChild(style.getElement(xmlDocument));
			}
		}
		if (this.timePeriods != null) {
			for (TimePeriod timePeriod: this.timePeriods) {
				element.appendChild(timePeriod.getElement(xmlDocument));
			}
		}
		if (this.address != null) {
			element.appendChild(this.address.getElement(xmlDocument));
		}
		if (this.description != null) {
			element.appendChild(this.description.getElement(xmlDocument));
		}
		if (this.name != null) {
			element.appendChild(this.name.getElement(xmlDocument));
		}
		if (this.open != null) {
			element.appendChild(this.open.getElement(xmlDocument));
		}
		if (this.snippet != null) {
			element.appendChild(this.snippet.getElement(xmlDocument));
		}
		if (this.styleUrl != null) {
			element.appendChild(this.styleUrl.getElement(xmlDocument));
		}
		if (this.visibility != null) {
			element.appendChild(this.visibility.getElement(xmlDocument));
		}

		return element;
	}
}
