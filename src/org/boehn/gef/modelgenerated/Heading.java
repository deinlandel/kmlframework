package org.boehn.gef.modelgenerated;

public class Heading {

	private String heading;
	private String id;

	public Heading() {
	}

	public Heading(String heading, String id) {
		this.heading = heading;
		this.id = id;
	}

	public String getHeading() {
		return this.heading;
	}

	public void SetHeading(String heading) {
		this.heading = heading;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("heading");
		if (this.heading != null) {
			element.appendChild(xmlDocument.createCDATASection(this.heading));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
