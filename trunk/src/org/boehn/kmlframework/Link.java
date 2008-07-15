package org.boehn.kmlframework;

public class Link extends KmlObject {

	private String href;
	private RefreshModeEnum refreshMode;
	private Double refreshInterval;
	private ViewRefreshModeEnum viewRefreshMode;
	private Double viewRefreshTime;
	private Double viewBoundScale;
	private ViewFormat viewFormat;
	private String httpQuery;
	
	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public RefreshModeEnum getRefreshMode() {
		return refreshMode;
	}

	public void setRefreshMode(RefreshModeEnum refreshMode) {
		this.refreshMode = refreshMode;
	}

	public Double getRefreshInterval() {
		return refreshInterval;
	}

	public void setRefreshInterval(Double refreshInterval) {
		this.refreshInterval = refreshInterval;
	}

	public ViewRefreshModeEnum getViewRefreshMode() {
		return viewRefreshMode;
	}

	public void setViewRefreshMode(ViewRefreshModeEnum viewRefreshMode) {
		this.viewRefreshMode = viewRefreshMode;
	}

	public Double getViewRefreshTime() {
		return viewRefreshTime;
	}

	public void setViewRefreshTime(Double viewRefreshTime) {
		this.viewRefreshTime = viewRefreshTime;
	}

	public Double getViewBoundScale() {
		return viewBoundScale;
	}

	public void setViewBoundScale(Double viewBoundScale) {
		this.viewBoundScale = viewBoundScale;
	}

	public ViewFormat getViewFormat() {
		return viewFormat;
	}

	public void setViewFormat(ViewFormat viewFormat) {
		this.viewFormat = viewFormat;
	}

	public String getHttpQuery() {
		return httpQuery;
	}

	public void setHttpQuery(String httpQuery) {
		this.httpQuery = httpQuery;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<Link" + getIdAndTargetIdFormatted() + ">", 1);
		writeInner(kmlDocument);
		kmlDocument.println(-1, "</Link>");
	}

	protected void writeInner(KmlDocument kmlDocument) throws KmlException {
		if (href != null) {
			kmlDocument.println("<href>" + href + "</href>");
		}
		if (refreshMode != null) {
			kmlDocument.println("<refreshMode>" + refreshMode + "</refreshMode>");
		}
		if (refreshInterval != null) {
			kmlDocument.println("<refreshInterval>" + refreshInterval + "</refreshInterval>");
		}
		if (refreshInterval != null) {
			kmlDocument.println("<refreshInterval>" + refreshInterval + "</refreshInterval>");
		}
		if (viewRefreshMode != null) {
			kmlDocument.println("<viewRefreshMode>" + viewRefreshMode + "</viewRefreshMode>");
		}
		if (viewRefreshTime != null) {
			kmlDocument.println("<viewRefreshTime>" + viewRefreshTime + "</viewRefreshTime>");
		}
		if (viewBoundScale != null) {
			kmlDocument.println("<viewBoundScale>" + viewBoundScale + "</viewBoundScale>");
		}
		if (viewFormat != null) {
			viewFormat.write(kmlDocument);
		}
		if (httpQuery != null) {
			kmlDocument.println("<httpQuery>" + httpQuery + "</httpQuery>");
		}
	}
}