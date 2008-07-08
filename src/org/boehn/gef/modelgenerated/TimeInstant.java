package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class TimeInstant {

	private String id;
	private Collection<TimePosition> timePositions;

	public TimeInstant() {
	}

	public TimeInstant(String id, Collection<TimePosition> timePositions) {
		this.id = id;
		this.timePositions = timePositions;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<TimePosition> getTimePositions() {
		return this.timePositions;
	}

	public void setTimePositions(Collection<TimePosition> timePositions) {
		this.timePositions = timePositions;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("TimeInstant");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.timePositions != null) {
			for (TimePosition timePosition: this.timePositions) {
				element.appendChild(timePosition.getElement(xmlDocument));
			}
		}

		return element;
	}
}
