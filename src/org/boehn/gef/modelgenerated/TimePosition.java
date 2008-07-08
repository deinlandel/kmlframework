package org.boehn.gef.modelgenerated;

public class TimePosition {

	private String timePosition;
	private String id;

	public TimePosition() {
	}

	public TimePosition(String timePosition, String id) {
		this.timePosition = timePosition;
		this.id = id;
	}

	public String getTimePosition() {
		return this.timePosition;
	}

	public void SetTimePosition(String timePosition) {
		this.timePosition = timePosition;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("timePosition");
		if (this.timePosition != null) {
			element.appendChild(xmlDocument.createCDATASection(this.timePosition));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
