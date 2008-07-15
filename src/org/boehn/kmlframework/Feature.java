package org.boehn.kmlframework;

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
	private AbstractView cameraOrLookAt;
	private TimePrimitive timeStampOrtimeSpan;
	private String styleUrl;
	private StyleSelector styleOrStyleMap;
	private Region region;
	private ExtendedData extendedData;
	
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
	
	public AbstractView getCameraOrLookAt() {
		return cameraOrLookAt;
	}

	public void setCameraOrLookAt(AbstractView cameraOrLookAt) {
		this.cameraOrLookAt = cameraOrLookAt;
	}

	public String getStyleUrl() {
		return styleUrl;
	}
	
	public void setStyleUrl(String styleUrl) {
		this.styleUrl = styleUrl;
	}
	
	public StyleSelector getStyleOrStyleMap() {
		return styleOrStyleMap;
	}

	public void setStyleOrStyleMap(StyleSelector styleOrStyleMap) {
		this.styleOrStyleMap = styleOrStyleMap;
	}

	public TimePrimitive getTimeStampOrtimeSpan() {
		return timeStampOrtimeSpan;
	}

	public void setTimeStampOrtimeSpan(TimePrimitive timeStampOrtimeSpan) {
		this.timeStampOrtimeSpan = timeStampOrtimeSpan;
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

	public void writeInner(KmlDocument kmlDocument) throws KmlException {
		if (name != null) {
			kmlDocument.println("<name>" + name + "</name>");
		}
		if (visability != null) {
			kmlDocument.println("<visability>" + booleanToInt(visability) + "</visability>");
		}
		if (open != null) {
			kmlDocument.println("<open>" + booleanToInt(open) + "</open>");
		}
		if (atomAuthor != null) {
			atomAuthor.write(kmlDocument);
		}
		if (atomLink != null) {
			atomLink.write(kmlDocument);
		}
		if (address != null) {
			kmlDocument.println("<address>" + address + "</address>");
		}
		if (xalAddressDeatails != null) {
			kmlDocument.println("<xal:AddressDetails>" + xalAddressDeatails + "</xal:AddressDetails>");
		}
		if (phoneNumber != null) {
			kmlDocument.println("<phoneNumber>" + phoneNumber + "</phoneNumber>");
		}
		if (snippet != null) {
			kmlDocument.println("<snippet maxLines=\"" + (snippetMaxLines != null ? snippetMaxLines : "2" ) + "\">" + snippet + "</snippet>");
		}
		if (description != null) {
			kmlDocument.println("<description>" + description + "</description>");
		}
		if (cameraOrLookAt != null) {
			cameraOrLookAt.write(kmlDocument);
		}
		if (timeStampOrtimeSpan != null) {
			timeStampOrtimeSpan.write(kmlDocument);
		}
		if (styleUrl!= null) {
			kmlDocument.println("<styleUrl>" + styleUrl + "</styleUrl>");
		}
		if (styleOrStyleMap != null) {
			styleOrStyleMap.write(kmlDocument);
		}
		if (region != null) {
			region.write(kmlDocument);
		}
		if (extendedData != null) {
			extendedData.write(kmlDocument);
		}
	}
}
