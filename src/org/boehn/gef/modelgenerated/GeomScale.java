package org.boehn.gef.modelgenerated;

public class GeomScale {

	private String geomScale;
	private String id;

	public GeomScale() {
	}

	public GeomScale(String geomScale, String id) {
		this.geomScale = geomScale;
		this.id = id;
	}

	public String getGeomScale() {
		return this.geomScale;
	}

	public void SetGeomScale(String geomScale) {
		this.geomScale = geomScale;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("geomScale");
		if (this.geomScale != null) {
			element.appendChild(xmlDocument.createCDATASection(this.geomScale));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
