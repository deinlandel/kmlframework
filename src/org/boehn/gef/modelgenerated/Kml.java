package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class Kml {

	private String id;
	private Collection<NetworkLinkControl> networkLinkControls;
	private Channel channel;
	private Document document;
	private Folder folder;
	private GroundOverlay groundOverlay;
	private LookAt lookAt;
	private NetworkLink networkLink;
	private Placemark placemark;
	private Search search;
	private ScreenOverlay screenOverlay;

	public Kml() {
	}

	public Kml(String id, Collection<NetworkLinkControl> networkLinkControls, Channel channel, Document document, Folder folder, GroundOverlay groundOverlay, LookAt lookAt, NetworkLink networkLink, Placemark placemark, Search search, ScreenOverlay screenOverlay) {
		this.id = id;
		this.networkLinkControls = networkLinkControls;
		this.channel = channel;
		this.document = document;
		this.folder = folder;
		this.groundOverlay = groundOverlay;
		this.lookAt = lookAt;
		this.networkLink = networkLink;
		this.placemark = placemark;
		this.search = search;
		this.screenOverlay = screenOverlay;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<NetworkLinkControl> getNetworkLinkControls() {
		return this.networkLinkControls;
	}

	public void setNetworkLinkControls(Collection<NetworkLinkControl> networkLinkControls) {
		this.networkLinkControls = networkLinkControls;
	}

	public Channel getChannel() {
		return this.channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public Document getDocument() {
		return this.document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public Folder getFolder() {
		return this.folder;
	}

	public void setFolder(Folder folder) {
		this.folder = folder;
	}

	public GroundOverlay getGroundOverlay() {
		return this.groundOverlay;
	}

	public void setGroundOverlay(GroundOverlay groundOverlay) {
		this.groundOverlay = groundOverlay;
	}

	public LookAt getLookAt() {
		return this.lookAt;
	}

	public void setLookAt(LookAt lookAt) {
		this.lookAt = lookAt;
	}

	public NetworkLink getNetworkLink() {
		return this.networkLink;
	}

	public void setNetworkLink(NetworkLink networkLink) {
		this.networkLink = networkLink;
	}

	public Placemark getPlacemark() {
		return this.placemark;
	}

	public void setPlacemark(Placemark placemark) {
		this.placemark = placemark;
	}

	public Search getSearch() {
		return this.search;
	}

	public void setSearch(Search search) {
		this.search = search;
	}

	public ScreenOverlay getScreenOverlay() {
		return this.screenOverlay;
	}

	public void setScreenOverlay(ScreenOverlay screenOverlay) {
		this.screenOverlay = screenOverlay;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("kml");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.networkLinkControls != null) {
			for (NetworkLinkControl networkLinkControl: this.networkLinkControls) {
				element.appendChild(networkLinkControl.getElement(xmlDocument));
			}
		}
		if (this.channel != null) {
			element.appendChild(this.channel.getElement(xmlDocument));
		}
		if (this.document != null) {
			element.appendChild(this.document.getElement(xmlDocument));
		}
		if (this.folder != null) {
			element.appendChild(this.folder.getElement(xmlDocument));
		}
		if (this.groundOverlay != null) {
			element.appendChild(this.groundOverlay.getElement(xmlDocument));
		}
		if (this.lookAt != null) {
			element.appendChild(this.lookAt.getElement(xmlDocument));
		}
		if (this.networkLink != null) {
			element.appendChild(this.networkLink.getElement(xmlDocument));
		}
		if (this.placemark != null) {
			element.appendChild(this.placemark.getElement(xmlDocument));
		}
		if (this.search != null) {
			element.appendChild(this.search.getElement(xmlDocument));
		}
		if (this.screenOverlay != null) {
			element.appendChild(this.screenOverlay.getElement(xmlDocument));
		}

		return element;
	}
}
