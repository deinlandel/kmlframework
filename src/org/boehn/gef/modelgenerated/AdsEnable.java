package org.boehn.gef.modelgenerated;

public class AdsEnable {

	private String adsEnable;
	private String id;

	public AdsEnable() {
	}

	public AdsEnable(String adsEnable, String id) {
		this.adsEnable = adsEnable;
		this.id = id;
	}

	public String getAdsEnable() {
		return this.adsEnable;
	}

	public void SetAdsEnable(String adsEnable) {
		this.adsEnable = adsEnable;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("adsEnable");
		if (this.adsEnable != null) {
			element.appendChild(xmlDocument.createCDATASection(this.adsEnable));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
