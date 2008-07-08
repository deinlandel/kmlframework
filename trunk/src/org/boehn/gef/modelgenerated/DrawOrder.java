package org.boehn.gef.modelgenerated;

public class DrawOrder {

	private String drawOrder;
	private String id;

	public DrawOrder() {
	}

	public DrawOrder(String drawOrder, String id) {
		this.drawOrder = drawOrder;
		this.id = id;
	}

	public String getDrawOrder() {
		return this.drawOrder;
	}

	public void SetDrawOrder(String drawOrder) {
		this.drawOrder = drawOrder;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("drawOrder");
		if (this.drawOrder != null) {
			element.appendChild(xmlDocument.createCDATASection(this.drawOrder));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
