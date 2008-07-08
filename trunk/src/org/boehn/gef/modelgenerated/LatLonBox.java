package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class LatLonBox {

	private String id;
	private Collection<East> easts;
	private Collection<North> norths;
	private Collection<South> souths;
	private Collection<West> wests;
	private Rotation rotation;

	public LatLonBox() {
	}

	public LatLonBox(String id, Collection<East> easts, Collection<North> norths, Collection<South> souths, Collection<West> wests, Rotation rotation) {
		this.id = id;
		this.easts = easts;
		this.norths = norths;
		this.souths = souths;
		this.wests = wests;
		this.rotation = rotation;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<East> getEasts() {
		return this.easts;
	}

	public void setEasts(Collection<East> easts) {
		this.easts = easts;
	}

	public Collection<North> getNorths() {
		return this.norths;
	}

	public void setNorths(Collection<North> norths) {
		this.norths = norths;
	}

	public Collection<South> getSouths() {
		return this.souths;
	}

	public void setSouths(Collection<South> souths) {
		this.souths = souths;
	}

	public Collection<West> getWests() {
		return this.wests;
	}

	public void setWests(Collection<West> wests) {
		this.wests = wests;
	}

	public Rotation getRotation() {
		return this.rotation;
	}

	public void setRotation(Rotation rotation) {
		this.rotation = rotation;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("LatLonBox");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.easts != null) {
			for (East east: this.easts) {
				element.appendChild(east.getElement(xmlDocument));
			}
		}
		if (this.norths != null) {
			for (North north: this.norths) {
				element.appendChild(north.getElement(xmlDocument));
			}
		}
		if (this.souths != null) {
			for (South south: this.souths) {
				element.appendChild(south.getElement(xmlDocument));
			}
		}
		if (this.wests != null) {
			for (West west: this.wests) {
				element.appendChild(west.getElement(xmlDocument));
			}
		}
		if (this.rotation != null) {
			element.appendChild(this.rotation.getElement(xmlDocument));
		}

		return element;
	}
}
