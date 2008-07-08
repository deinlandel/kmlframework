package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class LookAt {

	private String id;
	private Collection<Heading> headings;
	private Collection<Latitude> latitudes;
	private Collection<Longitude> longitudes;
	private Collection<Range> ranges;
	private Tilt tilt;

	public LookAt() {
	}

	public LookAt(String id, Collection<Heading> headings, Collection<Latitude> latitudes, Collection<Longitude> longitudes, Collection<Range> ranges, Tilt tilt) {
		this.id = id;
		this.headings = headings;
		this.latitudes = latitudes;
		this.longitudes = longitudes;
		this.ranges = ranges;
		this.tilt = tilt;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<Heading> getHeadings() {
		return this.headings;
	}

	public void setHeadings(Collection<Heading> headings) {
		this.headings = headings;
	}

	public Collection<Latitude> getLatitudes() {
		return this.latitudes;
	}

	public void setLatitudes(Collection<Latitude> latitudes) {
		this.latitudes = latitudes;
	}

	public Collection<Longitude> getLongitudes() {
		return this.longitudes;
	}

	public void setLongitudes(Collection<Longitude> longitudes) {
		this.longitudes = longitudes;
	}

	public Collection<Range> getRanges() {
		return this.ranges;
	}

	public void setRanges(Collection<Range> ranges) {
		this.ranges = ranges;
	}

	public Tilt getTilt() {
		return this.tilt;
	}

	public void setTilt(Tilt tilt) {
		this.tilt = tilt;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("LookAt");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.headings != null) {
			for (Heading heading: this.headings) {
				element.appendChild(heading.getElement(xmlDocument));
			}
		}
		if (this.latitudes != null) {
			for (Latitude latitude: this.latitudes) {
				element.appendChild(latitude.getElement(xmlDocument));
			}
		}
		if (this.longitudes != null) {
			for (Longitude longitude: this.longitudes) {
				element.appendChild(longitude.getElement(xmlDocument));
			}
		}
		if (this.ranges != null) {
			for (Range range: this.ranges) {
				element.appendChild(range.getElement(xmlDocument));
			}
		}
		if (this.tilt != null) {
			element.appendChild(this.tilt.getElement(xmlDocument));
		}

		return element;
	}
}
