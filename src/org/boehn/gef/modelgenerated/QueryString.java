package org.boehn.gef.modelgenerated;

public class QueryString {

	private String queryString;
	private String id;

	public QueryString() {
	}

	public QueryString(String queryString, String id) {
		this.queryString = queryString;
		this.id = id;
	}

	public String getQueryString() {
		return this.queryString;
	}

	public void SetQueryString(String queryString) {
		this.queryString = queryString;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("queryString");
		if (this.queryString != null) {
			element.appendChild(xmlDocument.createCDATASection(this.queryString));
		}
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
