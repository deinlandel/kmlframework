package org.boehn.kmlframework.kml;

import org.boehn.kmlframework.atom.AtomAuthor;
import org.boehn.kmlframework.atom.AtomLink;

public class NetworkLink extends Feature {
	
	private Boolean refreshVisibility;
	private Boolean flyToView;
	private Link link;
	
	public NetworkLink() {}
	
	public NetworkLink(String name, Boolean visability, Boolean open, AtomAuthor atomAuthor, AtomLink atomLink, String address, String xalAddressDetails, String phoneNumber, String snippet, Integer snippetMaxLines,String description, AbstractView abstractView, TimePrimitive timePrimitive, String styleUrl, StyleSelector styleSelector, Region region, ExtendedData extendedData, Boolean refreshVisability, Boolean flyToView, Link link) {
		super(name, visability, open, atomAuthor, atomLink, address, xalAddressDetails, phoneNumber, snippet, snippetMaxLines, description, abstractView, timePrimitive, styleUrl, styleSelector, region, extendedData);
		this.refreshVisibility = refreshVisability;
		this.flyToView = flyToView;
		this.link = link;
	}
	
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

	public void write(Kml kml) throws KmlException {
		kml.println("<NetworkLink" + getIdAndTargetIdFormatted(kml) + ">", 1);
		writeInner(kml);
		if (refreshVisibility != null) {
			kml.println("<refreshVisibility>" + booleanToInt(refreshVisibility) + "</refreshVisibility>");
		}
		if (flyToView != null) {
			kml.println("<flyToView>" + booleanToInt(flyToView) + "</flyToView>");
		}
		if (link != null) {
			link.write(kml);
		}
		kml.println(-1, "</NetworkLink>");
	}
	
	public void writeDelete(Kml kml) throws KmlException {
		kml.println("<NetworkLink" + getIdAndTargetIdFormatted(kml) + "></>");
	}
}