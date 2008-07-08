package org.boehn.gef.modelgenerated;

public class Key {

	private String key;
	private String id;

	public Key() {
	}

	public Key(String key, String id) {
		this.key = key;
		this.id = id;
	}

	public String getKey() {
		return this.key;
	}

	public void SetKey(String key) {
		this.key = key;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("key");
		if (this.key != null) {
			element.appendChild(xmlDocument.createCDATASection(this.key));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
