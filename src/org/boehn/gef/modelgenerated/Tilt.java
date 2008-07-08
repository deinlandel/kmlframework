package org.boehn.gef.modelgenerated;

public class Tilt {

	private String tilt;
	private String id;

	public Tilt() {
	}

	public Tilt(String tilt, String id) {
		this.tilt = tilt;
		this.id = id;
	}

	public String getTilt() {
		return this.tilt;
	}

	public void SetTilt(String tilt) {
		this.tilt = tilt;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("tilt");
		if (this.tilt != null) {
			element.appendChild(xmlDocument.createCDATASection(this.tilt));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
