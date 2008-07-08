package org.boehn.gef.modelgenerated;

public class GeomColor {

	private String geomColor;
	private String id;

	public GeomColor() {
	}

	public GeomColor(String geomColor, String id) {
		this.geomColor = geomColor;
		this.id = id;
	}

	public String getGeomColor() {
		return this.geomColor;
	}

	public void SetGeomColor(String geomColor) {
		this.geomColor = geomColor;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("geomColor");
		if (this.geomColor != null) {
			element.appendChild(xmlDocument.createCDATASection(this.geomColor));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
