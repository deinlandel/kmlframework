package org.boehn.gef.modelgenerated;

public class RefreshPeriod {

	private String refreshPeriod;
	private String id;

	public RefreshPeriod() {
	}

	public RefreshPeriod(String refreshPeriod, String id) {
		this.refreshPeriod = refreshPeriod;
		this.id = id;
	}

	public String getRefreshPeriod() {
		return this.refreshPeriod;
	}

	public void SetRefreshPeriod(String refreshPeriod) {
		this.refreshPeriod = refreshPeriod;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("refreshPeriod");
		if (this.refreshPeriod != null) {
			element.appendChild(xmlDocument.createCDATASection(this.refreshPeriod));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
