package org.boehn.kmlframework;

public class NetworkLink extends Feature {
	
	private Boolean refreshVisibility;
	private Boolean flyToView;
	private Link link;
	
	public boolean isRefreshVisibility() {
		return refreshVisibility;
	}
	
	public void setRefreshVisibility(boolean refreshVisibility) {
		this.refreshVisibility = refreshVisibility;
	}
	
	public Boolean isFlyToView() {
		return flyToView;
	}
	
	public void setFlyToView(Boolean flyToView) {
		this.flyToView = flyToView;
	}

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<NetworkLink" + getIdAndTargetIdFormatted() + ">", 1);
		writeInner(kmlDocument);
		if (refreshVisibility != null) {
			kmlDocument.println("<refreshVisibility>" + booleanToInt(refreshVisibility) + "</refreshVisibility>");
		}
		if (flyToView != null) {
			kmlDocument.println("<flyToView>" + booleanToInt(flyToView) + "</flyToView>");
		}
		if (link != null) {
			link.write(kmlDocument);
		}
		kmlDocument.println(-1, "</NetworkLink>");
	}
}