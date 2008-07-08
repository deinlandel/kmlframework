package org.boehn.gef.modelgenerated;

public class RefreshCounter {

	private String refreshCounter;
	private String id;

	public RefreshCounter() {
	}

	public RefreshCounter(String refreshCounter, String id) {
		this.refreshCounter = refreshCounter;
		this.id = id;
	}

	public String getRefreshCounter() {
		return this.refreshCounter;
	}

	public void SetRefreshCounter(String refreshCounter) {
		this.refreshCounter = refreshCounter;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("refreshCounter");
		if (this.refreshCounter != null) {
			element.appendChild(xmlDocument.createCDATASection(this.refreshCounter));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
