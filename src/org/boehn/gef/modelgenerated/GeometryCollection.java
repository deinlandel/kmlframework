package org.boehn.gef.modelgenerated;

public class GeometryCollection {

	private String geometryCollection;
	private String id;

	public GeometryCollection() {
	}

	public GeometryCollection(String geometryCollection, String id) {
		this.geometryCollection = geometryCollection;
		this.id = id;
	}

	public String getGeometryCollection() {
		return this.geometryCollection;
	}

	public void SetGeometryCollection(String geometryCollection) {
		this.geometryCollection = geometryCollection;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("GeometryCollection");
		if (this.geometryCollection != null) {
			element.appendChild(xmlDocument.createCDATASection(this.geometryCollection));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
