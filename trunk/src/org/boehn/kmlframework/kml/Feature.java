package org.boehn.kmlframework.kml;

import org.boehn.kmlframework.atom.AtomAuthor;
import org.boehn.kmlframework.atom.AtomLink;

public abstract class Feature extends KmlObject {
	
	private String name;
	private Boolean visability;
	private Boolean open;
	private AtomAuthor atomAuthor;
	private AtomLink atomLink;
	private String address;
	private String xalAddressDeatails;
	private String phoneNumber;
	private String snippet;
	private Integer snippetMaxLines;
	private String description;
	private AbstractView abstractView;
	private TimePrimitive timePrimitive;
	private String styleUrl;
	private StyleSelector styleSelector;
	private Region region;
	private ExtendedData extendedData;
	
	public Feature() {}
	
	public Feature(String name, Boolean visability, Boolean open, AtomAuthor atomAuthor, AtomLink atomLink, String address, String xalAddressDetails, String phoneNumber, String snippet, Integer snippetMaxLines,String description, AbstractView abstractView, TimePrimitive timePrimitive, String styleUrl, StyleSelector styleSelector, Region region, ExtendedData extendedData) {
		this.name = name;
		this.visability = visability;
		this.open = open;
		this.atomAuthor = atomAuthor;
		this.atomLink = atomLink;
		this.address = address;
		this.xalAddressDeatails = xalAddressDetails;
		this.phoneNumber = phoneNumber;
		this.snippet = snippet;
		this.snippetMaxLines = snippetMaxLines;
		this.description = description;
		this.abstractView = abstractView;
		this.timePrimitive = timePrimitive;
		this.styleUrl = styleUrl;
		this.styleSelector = styleSelector;
		this.region = region;
		this.extendedData = extendedData;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Boolean isVisability() {
		return visability;
	}
	
	public void setVisability(Boolean visability) {
		this.visability = visability;
	}
	
	public boolean isOpen() {
		return open;
	}
	
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	public AtomAuthor getAtomAuthor() {
		return atomAuthor;
	}

	public void setAtomAuthor(AtomAuthor atomAuthor) {
		this.atomAuthor = atomAuthor;
	}

	public AtomLink getAtomLink() {
		return atomLink;
	}

	public void setAtomLink(AtomLink link) {
		this.atomLink = link;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getXalAddressDeatails() {
		return xalAddressDeatails;
	}

	public void setXalAddressDeatails(String xalAddressDeatails) {
		this.xalAddressDeatails = xalAddressDeatails;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getSnippet() {
		return snippet;
	}

	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}

	public Integer getSnippetMaxLines() {
		return snippetMaxLines;
	}

	public void setSnippetMaxLines(Integer snippetMaxLines) {
		this.snippetMaxLines = snippetMaxLines;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public AbstractView getAbstractView() {
		return abstractView;
	}

	public void setAbstractView(AbstractView abstractView) {
		this.abstractView = abstractView;
	}

	public String getStyleUrl() {
		return styleUrl;
	}
	
	public void setStyleUrl(String styleUrl) {
		this.styleUrl = styleUrl;
	}
	
	public StyleSelector getStyleSelector() {
		return styleSelector;
	}

	public void setStyleSelector(StyleSelector styleSelector) {
		this.styleSelector = styleSelector;
	}

	public TimePrimitive getTimePrimitive() {
		return timePrimitive;
	}

	public void setTimePrimitive(TimePrimitive timePrimitive) {
		this.timePrimitive = timePrimitive;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public ExtendedData getExtendedData() {
		return extendedData;
	}

	public void setExtendedData(ExtendedData extendedData) {
		this.extendedData = extendedData;
	}

	public void writeInner(Kml kml) throws KmlException {
		if (name != null) {
			kml.println("<name>" + name + "</name>");
		}
		if (visability != null) {
			kml.println("<visability>" + booleanToInt(visability) + "</visability>");
		}
		if (open != null) {
			kml.println("<open>" + booleanToInt(open) + "</open>");
		}
		if (atomAuthor != null) {
			atomAuthor.write(kml);
		}
		if (atomLink != null) {
			atomLink.write(kml);
		}
		if (address != null) {
			kml.println("<address>" + address + "</address>");
		}
		if (xalAddressDeatails != null) {
			kml.println("<xal:AddressDetails>" + xalAddressDeatails + "</xal:AddressDetails>");
		}
		if (phoneNumber != null) {
			kml.println("<phoneNumber>" + phoneNumber + "</phoneNumber>");
		}
		if (snippet != null) {
			kml.println("<snippet maxLines=\"" + (snippetMaxLines != null ? snippetMaxLines : "2" ) + "\">" + snippet + "</snippet>");
		}
		if (description != null) {
			kml.println("<description>" + description + "</description>");
		}
		if (abstractView != null) {
			abstractView.write(kml);
		}
		if (timePrimitive != null) {
			timePrimitive.write(kml);
		}
		if (styleUrl!= null) {
			kml.println("<styleUrl>" + styleUrl + "</styleUrl>");
		}
		if (styleSelector != null) {
			styleSelector.write(kml);
		}
		if (region != null) {
			region.write(kml);
		}
		if (extendedData != null) {
			extendedData.write(kml);
		}
	}
}
