package org.boehn.gef.modelgenerated;

public class Link {

	private String id;
	private Name name;
	private Description description;
	private Snippet snippet;
	private RefreshCounter refreshCounter;
	private RefreshInterval refreshInterval;
	private RefreshMode refreshMode;
	private RefreshPeriod refreshPeriod;
	private Url url;
	private ViewFormat viewFormat;
	private ViewRefreshMode viewRefreshMode;
	private ViewRefreshTime viewRefreshTime;
	private ViewBoundScale viewBoundScale;

	public Link() {
	}

	public Link(String id, Name name, Description description, Snippet snippet, RefreshCounter refreshCounter, RefreshInterval refreshInterval, RefreshMode refreshMode, RefreshPeriod refreshPeriod, Url url, ViewFormat viewFormat, ViewRefreshMode viewRefreshMode, ViewRefreshTime viewRefreshTime, ViewBoundScale viewBoundScale) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.snippet = snippet;
		this.refreshCounter = refreshCounter;
		this.refreshInterval = refreshInterval;
		this.refreshMode = refreshMode;
		this.refreshPeriod = refreshPeriod;
		this.url = url;
		this.viewFormat = viewFormat;
		this.viewRefreshMode = viewRefreshMode;
		this.viewRefreshTime = viewRefreshTime;
		this.viewBoundScale = viewBoundScale;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Name getName() {
		return this.name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Description getDescription() {
		return this.description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public Snippet getSnippet() {
		return this.snippet;
	}

	public void setSnippet(Snippet snippet) {
		this.snippet = snippet;
	}

	public RefreshCounter getRefreshCounter() {
		return this.refreshCounter;
	}

	public void setRefreshCounter(RefreshCounter refreshCounter) {
		this.refreshCounter = refreshCounter;
	}

	public RefreshInterval getRefreshInterval() {
		return this.refreshInterval;
	}

	public void setRefreshInterval(RefreshInterval refreshInterval) {
		this.refreshInterval = refreshInterval;
	}

	public RefreshMode getRefreshMode() {
		return this.refreshMode;
	}

	public void setRefreshMode(RefreshMode refreshMode) {
		this.refreshMode = refreshMode;
	}

	public RefreshPeriod getRefreshPeriod() {
		return this.refreshPeriod;
	}

	public void setRefreshPeriod(RefreshPeriod refreshPeriod) {
		this.refreshPeriod = refreshPeriod;
	}

	public Url getUrl() {
		return this.url;
	}

	public void setUrl(Url url) {
		this.url = url;
	}

	public ViewFormat getViewFormat() {
		return this.viewFormat;
	}

	public void setViewFormat(ViewFormat viewFormat) {
		this.viewFormat = viewFormat;
	}

	public ViewRefreshMode getViewRefreshMode() {
		return this.viewRefreshMode;
	}

	public void setViewRefreshMode(ViewRefreshMode viewRefreshMode) {
		this.viewRefreshMode = viewRefreshMode;
	}

	public ViewRefreshTime getViewRefreshTime() {
		return this.viewRefreshTime;
	}

	public void setViewRefreshTime(ViewRefreshTime viewRefreshTime) {
		this.viewRefreshTime = viewRefreshTime;
	}

	public ViewBoundScale getViewBoundScale() {
		return this.viewBoundScale;
	}

	public void setViewBoundScale(ViewBoundScale viewBoundScale) {
		this.viewBoundScale = viewBoundScale;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("Link");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.name != null) {
			element.appendChild(this.name.getElement(xmlDocument));
		}
		if (this.description != null) {
			element.appendChild(this.description.getElement(xmlDocument));
		}
		if (this.snippet != null) {
			element.appendChild(this.snippet.getElement(xmlDocument));
		}
		if (this.refreshCounter != null) {
			element.appendChild(this.refreshCounter.getElement(xmlDocument));
		}
		if (this.refreshInterval != null) {
			element.appendChild(this.refreshInterval.getElement(xmlDocument));
		}
		if (this.refreshMode != null) {
			element.appendChild(this.refreshMode.getElement(xmlDocument));
		}
		if (this.refreshPeriod != null) {
			element.appendChild(this.refreshPeriod.getElement(xmlDocument));
		}
		if (this.url != null) {
			element.appendChild(this.url.getElement(xmlDocument));
		}
		if (this.viewFormat != null) {
			element.appendChild(this.viewFormat.getElement(xmlDocument));
		}
		if (this.viewRefreshMode != null) {
			element.appendChild(this.viewRefreshMode.getElement(xmlDocument));
		}
		if (this.viewRefreshTime != null) {
			element.appendChild(this.viewRefreshTime.getElement(xmlDocument));
		}
		if (this.viewBoundScale != null) {
			element.appendChild(this.viewBoundScale.getElement(xmlDocument));
		}

		return element;
	}
}
