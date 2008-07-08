package org.boehn.gef.modelgenerated;

public class ShowState {

	private String showState;
	private String id;

	public ShowState() {
	}

	public ShowState(String showState, String id) {
		this.showState = showState;
		this.id = id;
	}

	public String getShowState() {
		return this.showState;
	}

	public void SetShowState(String showState) {
		this.showState = showState;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("showState");
		if (this.showState != null) {
			element.appendChild(xmlDocument.createCDATASection(this.showState));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
