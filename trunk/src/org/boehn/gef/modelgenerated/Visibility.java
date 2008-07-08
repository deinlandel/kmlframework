package org.boehn.gef.modelgenerated;

public class Visibility {

	private String visibility;
	private String id;

	public Visibility() {
	}

	public Visibility(String visibility, String id) {
		this.visibility = visibility;
		this.id = id;
	}

	public String getVisibility() {
		return this.visibility;
	}

	public void SetVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("visibility");
		if (this.visibility != null) {
			element.appendChild(xmlDocument.createCDATASection(this.visibility));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
