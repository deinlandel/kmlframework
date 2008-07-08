package org.boehn.gef.modelgenerated;

public class NumCycles {

	private String numCycles;
	private String id;

	public NumCycles() {
	}

	public NumCycles(String numCycles, String id) {
		this.numCycles = numCycles;
		this.id = id;
	}

	public String getNumCycles() {
		return this.numCycles;
	}

	public void SetNumCycles(String numCycles) {
		this.numCycles = numCycles;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("numCycles");
		if (this.numCycles != null) {
			element.appendChild(xmlDocument.createCDATASection(this.numCycles));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
