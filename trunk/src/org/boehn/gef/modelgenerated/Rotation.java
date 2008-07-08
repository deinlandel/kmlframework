package org.boehn.gef.modelgenerated;

public class Rotation {

	private String rotation;
	private String id;

	public Rotation() {
	}

	public Rotation(String rotation, String id) {
		this.rotation = rotation;
		this.id = id;
	}

	public String getRotation() {
		return this.rotation;
	}

	public void SetRotation(String rotation) {
		this.rotation = rotation;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("rotation");
		if (this.rotation != null) {
			element.appendChild(xmlDocument.createCDATASection(this.rotation));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
