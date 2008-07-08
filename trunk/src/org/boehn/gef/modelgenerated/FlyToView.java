package org.boehn.gef.modelgenerated;

public class FlyToView {

	private String flyToView;
	private String id;

	public FlyToView() {
	}

	public FlyToView(String flyToView, String id) {
		this.flyToView = flyToView;
		this.id = id;
	}

	public String getFlyToView() {
		return this.flyToView;
	}

	public void SetFlyToView(String flyToView) {
		this.flyToView = flyToView;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("flyToView");
		if (this.flyToView != null) {
			element.appendChild(xmlDocument.createCDATASection(this.flyToView));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
