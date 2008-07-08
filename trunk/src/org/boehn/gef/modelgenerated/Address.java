package org.boehn.gef.modelgenerated;

public class Address {

	private String address;
	private String id;

	public Address() {
	}

	public Address(String address, String id) {
		this.address = address;
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void SetAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("address");
		if (this.address != null) {
			element.appendChild(xmlDocument.createCDATASection(this.address));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
