package org.boehn.gef.modelgenerated;

public class AltitudeMode {

	private String altitudeMode;
	private String id;

	public AltitudeMode() {
	}

	public AltitudeMode(String altitudeMode, String id) {
		this.altitudeMode = altitudeMode;
		this.id = id;
	}

	public String getAltitudeMode() {
		return this.altitudeMode;
	}

	public void SetAltitudeMode(String altitudeMode) {
		this.altitudeMode = altitudeMode;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("altitudeMode");
		if (this.altitudeMode != null) {
			element.appendChild(xmlDocument.createCDATASection(this.altitudeMode));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
