package org.boehn.gef.modelgenerated;

public class ViewFormat {

	private String viewFormat;
	private String id;

	public ViewFormat() {
	}

	public ViewFormat(String viewFormat, String id) {
		this.viewFormat = viewFormat;
		this.id = id;
	}

	public String getViewFormat() {
		return this.viewFormat;
	}

	public void SetViewFormat(String viewFormat) {
		this.viewFormat = viewFormat;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("viewFormat");
		if (this.viewFormat != null) {
			element.appendChild(xmlDocument.createCDATASection(this.viewFormat));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
