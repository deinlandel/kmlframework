package org.boehn.gef.modelgenerated;

public class Search {

	private String id;
	private Description description;
	private Name name;
	private QueryString queryString;
	private SearchString searchString;
	private ServerUrl serverUrl;
	private Snippet snippet;

	public Search() {
	}

	public Search(String id, Description description, Name name, QueryString queryString, SearchString searchString, ServerUrl serverUrl, Snippet snippet) {
		this.id = id;
		this.description = description;
		this.name = name;
		this.queryString = queryString;
		this.searchString = searchString;
		this.serverUrl = serverUrl;
		this.snippet = snippet;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Description getDescription() {
		return this.description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public Name getName() {
		return this.name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public QueryString getQueryString() {
		return this.queryString;
	}

	public void setQueryString(QueryString queryString) {
		this.queryString = queryString;
	}

	public SearchString getSearchString() {
		return this.searchString;
	}

	public void setSearchString(SearchString searchString) {
		this.searchString = searchString;
	}

	public ServerUrl getServerUrl() {
		return this.serverUrl;
	}

	public void setServerUrl(ServerUrl serverUrl) {
		this.serverUrl = serverUrl;
	}

	public Snippet getSnippet() {
		return this.snippet;
	}

	public void setSnippet(Snippet snippet) {
		this.snippet = snippet;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("Search");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.description != null) {
			element.appendChild(this.description.getElement(xmlDocument));
		}
		if (this.name != null) {
			element.appendChild(this.name.getElement(xmlDocument));
		}
		if (this.queryString != null) {
			element.appendChild(this.queryString.getElement(xmlDocument));
		}
		if (this.searchString != null) {
			element.appendChild(this.searchString.getElement(xmlDocument));
		}
		if (this.serverUrl != null) {
			element.appendChild(this.serverUrl.getElement(xmlDocument));
		}
		if (this.snippet != null) {
			element.appendChild(this.snippet.getElement(xmlDocument));
		}

		return element;
	}
}
