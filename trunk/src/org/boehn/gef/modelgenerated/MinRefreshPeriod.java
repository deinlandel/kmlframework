package org.boehn.gef.modelgenerated;

public class MinRefreshPeriod {

	private String minRefreshPeriod;
	private String id;

	public MinRefreshPeriod() {
	}

	public MinRefreshPeriod(String minRefreshPeriod, String id) {
		this.minRefreshPeriod = minRefreshPeriod;
		this.id = id;
	}

	public String getMinRefreshPeriod() {
		return this.minRefreshPeriod;
	}

	public void SetMinRefreshPeriod(String minRefreshPeriod) {
		this.minRefreshPeriod = minRefreshPeriod;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("minRefreshPeriod");
		if (this.minRefreshPeriod != null) {
			element.appendChild(xmlDocument.createCDATASection(this.minRefreshPeriod));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
