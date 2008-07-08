package org.boehn.gef.modelgenerated;

public class View {

	private String view;
	private String id;

	public View() {
	}

	public View(String view, String id) {
		this.view = view;
		this.id = id;
	}

	public String getView() {
		return this.view;
	}

	public void SetView(String view) {
		this.view = view;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("View");
		if (this.view != null) {
			element.appendChild(xmlDocument.createCDATASection(this.view));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
