package org.boehn.gef.modelgenerated;

public class LayerIndex {

	private String layerIndex;
	private String id;

	public LayerIndex() {
	}

	public LayerIndex(String layerIndex, String id) {
		this.layerIndex = layerIndex;
		this.id = id;
	}

	public String getLayerIndex() {
		return this.layerIndex;
	}

	public void SetLayerIndex(String layerIndex) {
		this.layerIndex = layerIndex;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("layerIndex");
		if (this.layerIndex != null) {
			element.appendChild(xmlDocument.createCDATASection(this.layerIndex));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
