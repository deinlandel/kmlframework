package org.boehn.gef.modelgenerated;

public class Scale {

	private String scale;
	private String id;

	public Scale() {
	}

	public Scale(String scale, String id) {
		this.scale = scale;
		this.id = id;
	}

	public String getScale() {
		return this.scale;
	}

	public void SetScale(String scale) {
		this.scale = scale;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("scale");
		if (this.scale != null) {
			element.appendChild(xmlDocument.createCDATASection(this.scale));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
