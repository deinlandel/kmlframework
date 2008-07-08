package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class Url {

	private String id;
	private Collection<Href> hrefs;
	private RefreshInterval refreshInterval;
	private RefreshMode refreshMode;
	private ViewFormat viewFormat;
	private ViewRefreshMode viewRefreshMode;
	private ViewRefreshTime viewRefreshTime;

	public Url() {
	}

	public Url(String id, Collection<Href> hrefs, RefreshInterval refreshInterval, RefreshMode refreshMode, ViewFormat viewFormat, ViewRefreshMode viewRefreshMode, ViewRefreshTime viewRefreshTime) {
		this.id = id;
		this.hrefs = hrefs;
		this.refreshInterval = refreshInterval;
		this.refreshMode = refreshMode;
		this.viewFormat = viewFormat;
		this.viewRefreshMode = viewRefreshMode;
		this.viewRefreshTime = viewRefreshTime;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<Href> getHrefs() {
		return this.hrefs;
	}

	public void setHrefs(Collection<Href> hrefs) {
		this.hrefs = hrefs;
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

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("Url");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.hrefs != null) {
			for (Href href: this.hrefs) {
				element.appendChild(href.getElement(xmlDocument));
			}
		}
		if (this.refreshInterval != null) {
			element.appendChild(this.refreshInterval.getElement(xmlDocument));
		}
		if (this.refreshMode != null) {
			element.appendChild(this.refreshMode.getElement(xmlDocument));
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

		return element;
	}
}
