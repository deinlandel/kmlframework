package org.boehn.gef.modelgenerated;

public class End {

	private String id;
	private TimeInstant timeInstant;

	public End() {
	}

	public End(String id, TimeInstant timeInstant) {
		this.id = id;
		this.timeInstant = timeInstant;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public TimeInstant getTimeInstant() {
		return this.timeInstant;
	}

	public void setTimeInstant(TimeInstant timeInstant) {
		this.timeInstant = timeInstant;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("end");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.timeInstant != null) {
			element.appendChild(this.timeInstant.getElement(xmlDocument));
		}

		return element;
	}
}
