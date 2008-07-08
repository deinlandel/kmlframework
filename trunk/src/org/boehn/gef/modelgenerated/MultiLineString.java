package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class MultiLineString {

	private String id;
	private Collection<LineString> lineStrings;
	private Extrude extrude;

	public MultiLineString() {
	}

	public MultiLineString(String id, Collection<LineString> lineStrings, Extrude extrude) {
		this.id = id;
		this.lineStrings = lineStrings;
		this.extrude = extrude;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<LineString> getLineStrings() {
		return this.lineStrings;
	}

	public void setLineStrings(Collection<LineString> lineStrings) {
		this.lineStrings = lineStrings;
	}

	public Extrude getExtrude() {
		return this.extrude;
	}

	public void setExtrude(Extrude extrude) {
		this.extrude = extrude;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("MultiLineString");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.lineStrings != null) {
			for (LineString lineString: this.lineStrings) {
				element.appendChild(lineString.getElement(xmlDocument));
			}
		}
		if (this.extrude != null) {
			element.appendChild(this.extrude.getElement(xmlDocument));
		}

		return element;
	}
}
