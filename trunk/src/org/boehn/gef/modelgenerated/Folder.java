package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class Folder {

	private String id;
	private Collection<Channel> channels;
	private Collection<Folder> folders;
	private Collection<GroundOverlay> groundOverlays;
	private LookAt lookAt;
	private Collection<NetworkLink> networkLinks;
	private Collection<Placemark> placemarks;
	private Collection<ScreenOverlay> screenOverlays;
	private Collection<Search> searchs;
	private Snippet snippet;
	private Collection<Style> styles;
	private Description description;
	private Name name;
	private Open open;
	private Visibility visibility;

	public Folder() {
	}

	public Folder(String id, Collection<Channel> channels, Collection<Folder> folders, Collection<GroundOverlay> groundOverlays, LookAt lookAt, Collection<NetworkLink> networkLinks, Collection<Placemark> placemarks, Collection<ScreenOverlay> screenOverlays, Collection<Search> searchs, Snippet snippet, Collection<Style> styles, Description description, Name name, Open open, Visibility visibility) {
		this.id = id;
		this.channels = channels;
		this.folders = folders;
		this.groundOverlays = groundOverlays;
		this.lookAt = lookAt;
		this.networkLinks = networkLinks;
		this.placemarks = placemarks;
		this.screenOverlays = screenOverlays;
		this.searchs = searchs;
		this.snippet = snippet;
		this.styles = styles;
		this.description = description;
		this.name = name;
		this.open = open;
		this.visibility = visibility;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<Channel> getChannels() {
		return this.channels;
	}

	public void setChannels(Collection<Channel> channels) {
		this.channels = channels;
	}

	public Collection<Folder> getFolders() {
		return this.folders;
	}

	public void setFolders(Collection<Folder> folders) {
		this.folders = folders;
	}

	public Collection<GroundOverlay> getGroundOverlays() {
		return this.groundOverlays;
	}

	public void setGroundOverlays(Collection<GroundOverlay> groundOverlays) {
		this.groundOverlays = groundOverlays;
	}

	public LookAt getLookAt() {
		return this.lookAt;
	}

	public void setLookAt(LookAt lookAt) {
		this.lookAt = lookAt;
	}

	public Collection<NetworkLink> getNetworkLinks() {
		return this.networkLinks;
	}

	public void setNetworkLinks(Collection<NetworkLink> networkLinks) {
		this.networkLinks = networkLinks;
	}

	public Collection<Placemark> getPlacemarks() {
		return this.placemarks;
	}

	public void setPlacemarks(Collection<Placemark> placemarks) {
		this.placemarks = placemarks;
	}

	public Collection<ScreenOverlay> getScreenOverlays() {
		return this.screenOverlays;
	}

	public void setScreenOverlays(Collection<ScreenOverlay> screenOverlays) {
		this.screenOverlays = screenOverlays;
	}

	public Collection<Search> getSearchs() {
		return this.searchs;
	}

	public void setSearchs(Collection<Search> searchs) {
		this.searchs = searchs;
	}

	public Snippet getSnippet() {
		return this.snippet;
	}

	public void setSnippet(Snippet snippet) {
		this.snippet = snippet;
	}

	public Collection<Style> getStyles() {
		return this.styles;
	}

	public void setStyles(Collection<Style> styles) {
		this.styles = styles;
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

	public Open getOpen() {
		return this.open;
	}

	public void setOpen(Open open) {
		this.open = open;
	}

	public Visibility getVisibility() {
		return this.visibility;
	}

	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("Folder");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.channels != null) {
			for (Channel channel: this.channels) {
				element.appendChild(channel.getElement(xmlDocument));
			}
		}
		if (this.folders != null) {
			for (Folder folder: this.folders) {
				element.appendChild(folder.getElement(xmlDocument));
			}
		}
		if (this.groundOverlays != null) {
			for (GroundOverlay groundOverlay: this.groundOverlays) {
				element.appendChild(groundOverlay.getElement(xmlDocument));
			}
		}
		if (this.lookAt != null) {
			element.appendChild(this.lookAt.getElement(xmlDocument));
		}
		if (this.networkLinks != null) {
			for (NetworkLink networkLink: this.networkLinks) {
				element.appendChild(networkLink.getElement(xmlDocument));
			}
		}
		if (this.placemarks != null) {
			for (Placemark placemark: this.placemarks) {
				element.appendChild(placemark.getElement(xmlDocument));
			}
		}
		if (this.screenOverlays != null) {
			for (ScreenOverlay screenOverlay: this.screenOverlays) {
				element.appendChild(screenOverlay.getElement(xmlDocument));
			}
		}
		if (this.searchs != null) {
			for (Search search: this.searchs) {
				element.appendChild(search.getElement(xmlDocument));
			}
		}
		if (this.snippet != null) {
			element.appendChild(this.snippet.getElement(xmlDocument));
		}
		if (this.styles != null) {
			for (Style style: this.styles) {
				element.appendChild(style.getElement(xmlDocument));
			}
		}
		if (this.description != null) {
			element.appendChild(this.description.getElement(xmlDocument));
		}
		if (this.name != null) {
			element.appendChild(this.name.getElement(xmlDocument));
		}
		if (this.open != null) {
			element.appendChild(this.open.getElement(xmlDocument));
		}
		if (this.visibility != null) {
			element.appendChild(this.visibility.getElement(xmlDocument));
		}

		return element;
	}
}
