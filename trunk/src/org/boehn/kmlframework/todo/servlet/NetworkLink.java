package org.boehn.kmlframework.todo.servlet;

import org.boehn.kmlframework.kml.Kml;
import org.boehn.kmlframework.kml.KmlException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class NetworkLink /*implements KmlDocumentElement*/ {

	private String name;
	private Boolean flyToView;
	private String url;
	private RefreshModes refreshMode;
	private Integer refreshInterval;
	private ViewRefreshModes viewRefreshMode;
	private Integer viewRefreshTime;
	private String viewFormat;
	private Boolean refreshVisibility;
	private Boolean open;

	public NetworkLink() {
		// We set the default values
		viewFormat = "gefObserver=[bboxNorth],[bboxEast],[bboxSouth],[bboxWest],[lookatLat],[lookatLon],[lookatRange],[lookatTilt],[lookatHeading]";
		refreshMode = RefreshModes.once;
		viewRefreshMode = ViewRefreshModes.onStop;
		viewRefreshTime = 0;
		open = true;
	}
	
	public NetworkLink(String url, String name) {
		this();
		this.url = url;
		this.name = name;
	}
	
	public Boolean getFlyToView() {
		return flyToView;
	}

	public void setFlyToView(Boolean flyToView) {
		this.flyToView = flyToView;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RefreshModes getRefreshMode() {
		return refreshMode;
	}

	public void setRefreshMode(RefreshModes refreshMode) {
		this.refreshMode = refreshMode;
	}

	public Integer getRefreshInterval() {
		return refreshInterval;
	}

	public void setRefreshInterval(Integer refreshInterval) {
		this.refreshInterval = refreshInterval;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getViewFormat() {
		return viewFormat;
	}

	public void setViewFormat(String viewFormat) {
		this.viewFormat = viewFormat;
	}

	public ViewRefreshModes getViewRefreshMode() {
		return viewRefreshMode;
	}

	public void setViewRefreshMode(ViewRefreshModes viewRefreshMode) {
		this.viewRefreshMode = viewRefreshMode;
	}

	public Integer getViewRefreshTime() {
		return viewRefreshTime;
	}

	public void setViewRefreshTime(Integer viewRefreshTime) {
		this.viewRefreshTime = viewRefreshTime;
	}
	
	public Boolean getRefreshVisibility() {
		return refreshVisibility;
	}

	public void setRefreshVisibility(Boolean refreshVisibility) {
		this.refreshVisibility = refreshVisibility;
	}

	public Boolean getOpen() {
		return open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}
	
	/*
	public static void main(String[] args) throws KmlException, IOException {
		if (args.length != 3) {
			System.err.println("Usage: java org.boehn.gef.elements.NetworkLink <url> <name> <destinationFile>");
			System.exit(-1);
		} else {
			Kml model = new Kml();
			//model.add(new NetworkLink(args[0], args[1]));
			//model.write(args[2]);
		}
	}*/

	public void addKml(Element parentElement, Kml model, Document xmlDocument) throws KmlException {

		Element networkLinkElement = xmlDocument.createElement("NetworkLink");
		
		if (name != null) {
			Element nameElement = xmlDocument.createElement("name");
			nameElement.appendChild(xmlDocument.createTextNode(name));
			networkLinkElement.appendChild(nameElement);
		}
		
		if (open != null) {
			Element openElement = xmlDocument.createElement("open");
			openElement.appendChild(xmlDocument.createTextNode((open) ? "1" : "0"));
			networkLinkElement.appendChild(openElement);
		}
		
		if (flyToView != null) {
			Element flyToViewElement = xmlDocument.createElement("flyToView");
			flyToViewElement.appendChild(xmlDocument.createTextNode((flyToView) ? "1" : "0"));
			networkLinkElement.appendChild(flyToViewElement);
		}
		
		if (refreshVisibility != null) {
			Element refreshVisibilityElement = xmlDocument.createElement("refreshVisibility");
			refreshVisibilityElement.appendChild(xmlDocument.createTextNode((refreshVisibility) ? "1" : "0"));
			networkLinkElement.appendChild(refreshVisibilityElement);
		}
		
		if (url != null) {
			Element urlElement = xmlDocument.createElement("Url");
			Element hrefElement = xmlDocument.createElement("href");
			hrefElement.appendChild(xmlDocument.createTextNode(url));
			urlElement.appendChild(hrefElement);
			if (refreshMode != null) {
				Element refreshModeElement = xmlDocument.createElement("refreshMode");
				refreshModeElement.appendChild(xmlDocument.createTextNode(refreshMode.toString()));
				urlElement.appendChild(refreshModeElement);
			}
			if (refreshInterval != null) {
				Element refreshIntervalElement = xmlDocument.createElement("refreshInterval");
				refreshIntervalElement.appendChild(xmlDocument.createTextNode(refreshInterval.toString()));
				urlElement.appendChild(refreshIntervalElement);
			}
			if (viewRefreshMode != null) {
				Element viewRefreshModeElement = xmlDocument.createElement("viewRefreshMode");
				viewRefreshModeElement.appendChild(xmlDocument.createTextNode(viewRefreshMode.toString()));
				urlElement.appendChild(viewRefreshModeElement);
			}
			if (viewRefreshTime != null) {
				Element viewRefreshTimeElement = xmlDocument.createElement("viewRefreshTime");
				viewRefreshTimeElement.appendChild(xmlDocument.createTextNode(viewRefreshTime.toString()));
				urlElement.appendChild(viewRefreshTimeElement);
			}
			if (viewFormat != null) {
				Element viewFormatElement = xmlDocument.createElement("viewFormat");
				viewFormatElement.appendChild(xmlDocument.createTextNode(viewFormat));
				urlElement.appendChild(viewFormatElement);
			}
			networkLinkElement.appendChild(urlElement);
		}
		parentElement.appendChild(networkLinkElement);
	}
}
