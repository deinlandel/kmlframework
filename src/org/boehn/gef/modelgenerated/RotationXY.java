package org.boehn.gef.modelgenerated;

public class RotationXY {

	private String rotationXY;
	private String id;

	public RotationXY() {
	}

	public RotationXY(String rotationXY, String id) {
		this.rotationXY = rotationXY;
		this.id = id;
	}

	public String getRotationXY() {
		return this.rotationXY;
	}

	public void SetRotationXY(String rotationXY) {
		this.rotationXY = rotationXY;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("rotationXY");
		if (this.rotationXY != null) {
			element.appendChild(xmlDocument.createCDATASection(this.rotationXY));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
