package org.boehn.gef.modelgenerated;

public class Extrude {

	private String extrude;
	private String id;

	public Extrude() {
	}

	public Extrude(String extrude, String id) {
		this.extrude = extrude;
		this.id = id;
	}

	public String getExtrude() {
		return this.extrude;
	}

	public void SetExtrude(String extrude) {
		this.extrude = extrude;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("extrude");
		if (this.extrude != null) {
			element.appendChild(xmlDocument.createCDATASection(this.extrude));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
