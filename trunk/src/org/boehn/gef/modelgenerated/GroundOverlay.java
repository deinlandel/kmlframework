package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class GroundOverlay {

	private String id;
	private Collection<Icon> icons;
	private Collection<LatLonBox> latLonBoxs;
	private LookAt lookAt;
	private Color color;
	private DrawOrder drawOrder;
	private Name name;
	private Opacity opacity;
	private Rotation rotation;
	private TexMat texMat;
	private Visibility visibility;

	public GroundOverlay() {
	}

	public GroundOverlay(String id, Collection<Icon> icons, Collection<LatLonBox> latLonBoxs, LookAt lookAt, Color color, DrawOrder drawOrder, Name name, Opacity opacity, Rotation rotation, TexMat texMat, Visibility visibility) {
		this.id = id;
		this.icons = icons;
		this.latLonBoxs = latLonBoxs;
		this.lookAt = lookAt;
		this.color = color;
		this.drawOrder = drawOrder;
		this.name = name;
		this.opacity = opacity;
		this.rotation = rotation;
		this.texMat = texMat;
		this.visibility = visibility;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public Collection<Icon> getIcons() {
		return this.icons;
	}

	public void setIcons(Collection<Icon> icons) {
		this.icons = icons;
	}

	public Collection<LatLonBox> getLatLonBoxs() {
		return this.latLonBoxs;
	}

	public void setLatLonBoxs(Collection<LatLonBox> latLonBoxs) {
		this.latLonBoxs = latLonBoxs;
	}

	public LookAt getLookAt() {
		return this.lookAt;
	}

	public void setLookAt(LookAt lookAt) {
		this.lookAt = lookAt;
	}

	public Color getColor() {
		return this.color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public DrawOrder getDrawOrder() {
		return this.drawOrder;
	}

	public void setDrawOrder(DrawOrder drawOrder) {
		this.drawOrder = drawOrder;
	}

	public Name getName() {
		return this.name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Opacity getOpacity() {
		return this.opacity;
	}

	public void setOpacity(Opacity opacity) {
		this.opacity = opacity;
	}

	public Rotation getRotation() {
		return this.rotation;
	}

	public void setRotation(Rotation rotation) {
		this.rotation = rotation;
	}

	public TexMat getTexMat() {
		return this.texMat;
	}

	public void setTexMat(TexMat texMat) {
		this.texMat = texMat;
	}

	public Visibility getVisibility() {
		return this.visibility;
	}

	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("GroundOverlay");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.icons != null) {
			for (Icon icon: this.icons) {
				element.appendChild(icon.getElement(xmlDocument));
			}
		}
		if (this.latLonBoxs != null) {
			for (LatLonBox latLonBox: this.latLonBoxs) {
				element.appendChild(latLonBox.getElement(xmlDocument));
			}
		}
		if (this.lookAt != null) {
			element.appendChild(this.lookAt.getElement(xmlDocument));
		}
		if (this.color != null) {
			element.appendChild(this.color.getElement(xmlDocument));
		}
		if (this.drawOrder != null) {
			element.appendChild(this.drawOrder.getElement(xmlDocument));
		}
		if (this.name != null) {
			element.appendChild(this.name.getElement(xmlDocument));
		}
		if (this.opacity != null) {
			element.appendChild(this.opacity.getElement(xmlDocument));
		}
		if (this.rotation != null) {
			element.appendChild(this.rotation.getElement(xmlDocument));
		}
		if (this.texMat != null) {
			element.appendChild(this.texMat.getElement(xmlDocument));
		}
		if (this.visibility != null) {
			element.appendChild(this.visibility.getElement(xmlDocument));
		}

		return element;
	}
}
