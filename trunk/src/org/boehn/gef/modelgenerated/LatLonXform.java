package org.boehn.gef.modelgenerated;

public class LatLonXform {

	private String id;
	private Rotation rotation;

	public LatLonXform() {
	}

	public LatLonXform(String id, Rotation rotation) {
		this.id = id;
		this.rotation = rotation;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Rotation getRotation() {
		return this.rotation;
	}

	public void setRotation(Rotation rotation) {
		this.rotation = rotation;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("LatLonXform");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.rotation != null) {
			element.appendChild(this.rotation.getElement(xmlDocument));
		}

		return element;
	}
}
