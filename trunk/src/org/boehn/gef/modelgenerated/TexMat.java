package org.boehn.gef.modelgenerated;

public class TexMat {

	private String texMat;
	private String id;

	public TexMat() {
	}

	public TexMat(String texMat, String id) {
		this.texMat = texMat;
		this.id = id;
	}

	public String getTexMat() {
		return this.texMat;
	}

	public void SetTexMat(String texMat) {
		this.texMat = texMat;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("texMat");
		if (this.texMat != null) {
			element.appendChild(xmlDocument.createCDATASection(this.texMat));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
