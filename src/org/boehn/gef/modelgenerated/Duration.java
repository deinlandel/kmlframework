package org.boehn.gef.modelgenerated;

public class Duration {

	private String duration;
	private String id;

	public Duration() {
	}

	public Duration(String duration, String id) {
		this.duration = duration;
		this.id = id;
	}

	public String getDuration() {
		return this.duration;
	}

	public void SetDuration(String duration) {
		this.duration = duration;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("duration");
		if (this.duration != null) {
			element.appendChild(xmlDocument.createCDATASection(this.duration));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
