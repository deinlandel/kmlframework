package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class Icon {

	private String id;
	private Collection<Href> hrefs;
	private H h;
	private RefreshMode refreshMode;
	private RefreshInterval refreshInterval;
	private ViewFormat viewFormat;
	private ViewRefreshMode viewRefreshMode;
	private ViewBoundScale viewBoundScale;
	private W w;
	private X x;
	private Y y;

	public Icon() {
	}

	public Icon(String id, Collection<Href> hrefs, H h, RefreshMode refreshMode, RefreshInterval refreshInterval, ViewFormat viewFormat, ViewRefreshMode viewRefreshMode, ViewBoundScale viewBoundScale, W w, X x, Y y) {
		this.id = id;
		this.hrefs = hrefs;
		this.h = h;
		this.refreshMode = refreshMode;
		this.refreshInterval = refreshInterval;
		this.viewFormat = viewFormat;
		this.viewRefreshMode = viewRefreshMode;
		this.viewBoundScale = viewBoundScale;
		this.w = w;
		this.x = x;
		this.y = y;
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

	public H getH() {
		return this.h;
	}

	public void setH(H h) {
		this.h = h;
	}

	public RefreshMode getRefreshMode() {
		return this.refreshMode;
	}

	public void setRefreshMode(RefreshMode refreshMode) {
		this.refreshMode = refreshMode;
	}

	public RefreshInterval getRefreshInterval() {
		return this.refreshInterval;
	}

	public void setRefreshInterval(RefreshInterval refreshInterval) {
		this.refreshInterval = refreshInterval;
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

	public ViewBoundScale getViewBoundScale() {
		return this.viewBoundScale;
	}

	public void setViewBoundScale(ViewBoundScale viewBoundScale) {
		this.viewBoundScale = viewBoundScale;
	}

	public W getW() {
		return this.w;
	}

	public void setW(W w) {
		this.w = w;
	}

	public X getX() {
		return this.x;
	}

	public void setX(X x) {
		this.x = x;
	}

	public Y getY() {
		return this.y;
	}

	public void setY(Y y) {
		this.y = y;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("Icon");
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
		if (this.h != null) {
			element.appendChild(this.h.getElement(xmlDocument));
		}
		if (this.refreshMode != null) {
			element.appendChild(this.refreshMode.getElement(xmlDocument));
		}
		if (this.refreshInterval != null) {
			element.appendChild(this.refreshInterval.getElement(xmlDocument));
		}
		if (this.viewFormat != null) {
			element.appendChild(this.viewFormat.getElement(xmlDocument));
		}
		if (this.viewRefreshMode != null) {
			element.appendChild(this.viewRefreshMode.getElement(xmlDocument));
		}
		if (this.viewBoundScale != null) {
			element.appendChild(this.viewBoundScale.getElement(xmlDocument));
		}
		if (this.w != null) {
			element.appendChild(this.w.getElement(xmlDocument));
		}
		if (this.x != null) {
			element.appendChild(this.x.getElement(xmlDocument));
		}
		if (this.y != null) {
			element.appendChild(this.y.getElement(xmlDocument));
		}

		return element;
	}
}
