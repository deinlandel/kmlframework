package org.boehn.gef.modelgenerated;

public class NetworkLink {

	private String id;
	private Url url;
	private FlyToView flyToView;
	private Name name;
	private RefreshVisibility refreshVisibility;
	private Snippet snippet;
	private Visibility visibility;

	public NetworkLink() {
	}

	public NetworkLink(String id, Url url, FlyToView flyToView, Name name, RefreshVisibility refreshVisibility, Snippet snippet, Visibility visibility) {
		this.id = id;
		this.url = url;
		this.flyToView = flyToView;
		this.name = name;
		this.refreshVisibility = refreshVisibility;
		this.snippet = snippet;
		this.visibility = visibility;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Url getUrl() {
		return this.url;
	}

	public void setUrl(Url url) {
		this.url = url;
	}

	public FlyToView getFlyToView() {
		return this.flyToView;
	}

	public void setFlyToView(FlyToView flyToView) {
		this.flyToView = flyToView;
	}

	public Name getName() {
		return this.name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public RefreshVisibility getRefreshVisibility() {
		return this.refreshVisibility;
	}

	public void setRefreshVisibility(RefreshVisibility refreshVisibility) {
		this.refreshVisibility = refreshVisibility;
	}

	public Snippet getSnippet() {
		return this.snippet;
	}

	public void setSnippet(Snippet snippet) {
		this.snippet = snippet;
	}

	public Visibility getVisibility() {
		return this.visibility;
	}

	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("NetworkLink");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.url != null) {
			element.appendChild(this.url.getElement(xmlDocument));
		}
		if (this.flyToView != null) {
			element.appendChild(this.flyToView.getElement(xmlDocument));
		}
		if (this.name != null) {
			element.appendChild(this.name.getElement(xmlDocument));
		}
		if (this.refreshVisibility != null) {
			element.appendChild(this.refreshVisibility.getElement(xmlDocument));
		}
		if (this.snippet != null) {
			element.appendChild(this.snippet.getElement(xmlDocument));
		}
		if (this.visibility != null) {
			element.appendChild(this.visibility.getElement(xmlDocument));
		}

		return element;
	}
}
