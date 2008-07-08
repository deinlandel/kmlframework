package org.boehn.gef.modelgenerated;

public class SearchString {

	private String searchString;
	private String id;

	public SearchString() {
	}

	public SearchString(String searchString, String id) {
		this.searchString = searchString;
		this.id = id;
	}

	public String getSearchString() {
		return this.searchString;
	}

	public void SetSearchString(String searchString) {
		this.searchString = searchString;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("searchString");
		if (this.searchString != null) {
			element.appendChild(xmlDocument.createCDATASection(this.searchString));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
