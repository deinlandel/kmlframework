package org.boehn.gef.modelgenerated;

import java.util.Collection;

public class ScreenOverlay {

	private String id;
	private Collection<Icon> icons;
	private DrawOrder drawOrder;
	private Name name;
	private Opacity opacity;
	private OverlayXY overlayXY;
	private Rotation rotation;
	private RotationXY rotationXY;
	private ScreenXY screenXY;
	private Size size;
	private TexMat texMat;
	private Visibility visibility;

	public ScreenOverlay() {
	}

	public ScreenOverlay(String id, Collection<Icon> icons, DrawOrder drawOrder, Name name, Opacity opacity, OverlayXY overlayXY, Rotation rotation, RotationXY rotationXY, ScreenXY screenXY, Size size, TexMat texMat, Visibility visibility) {
		this.id = id;
		this.icons = icons;
		this.drawOrder = drawOrder;
		this.name = name;
		this.opacity = opacity;
		this.overlayXY = overlayXY;
		this.rotation = rotation;
		this.rotationXY = rotationXY;
		this.screenXY = screenXY;
		this.size = size;
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

	public OverlayXY getOverlayXY() {
		return this.overlayXY;
	}

	public void setOverlayXY(OverlayXY overlayXY) {
		this.overlayXY = overlayXY;
	}

	public Rotation getRotation() {
		return this.rotation;
	}

	public void setRotation(Rotation rotation) {
		this.rotation = rotation;
	}

	public RotationXY getRotationXY() {
		return this.rotationXY;
	}

	public void setRotationXY(RotationXY rotationXY) {
		this.rotationXY = rotationXY;
	}

	public ScreenXY getScreenXY() {
		return this.screenXY;
	}

	public void setScreenXY(ScreenXY screenXY) {
		this.screenXY = screenXY;
	}

	public Size getSize() {
		return this.size;
	}

	public void setSize(Size size) {
		this.size = size;
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
		org.w3c.dom.Element element = xmlDocument.createElement("ScreenOverlay");
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
		if (this.drawOrder != null) {
			element.appendChild(this.drawOrder.getElement(xmlDocument));
		}
		if (this.name != null) {
			element.appendChild(this.name.getElement(xmlDocument));
		}
		if (this.opacity != null) {
			element.appendChild(this.opacity.getElement(xmlDocument));
		}
		if (this.overlayXY != null) {
			element.appendChild(this.overlayXY.getElement(xmlDocument));
		}
		if (this.rotation != null) {
			element.appendChild(this.rotation.getElement(xmlDocument));
		}
		if (this.rotationXY != null) {
			element.appendChild(this.rotationXY.getElement(xmlDocument));
		}
		if (this.screenXY != null) {
			element.appendChild(this.screenXY.getElement(xmlDocument));
		}
		if (this.size != null) {
			element.appendChild(this.size.getElement(xmlDocument));
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
