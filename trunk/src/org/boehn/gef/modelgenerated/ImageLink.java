package org.boehn.gef.modelgenerated;

public class ImageLink {

	private String id;
	private H h;
	private W w;
	private X x;
	private Y y;

	public ImageLink() {
	}

	public ImageLink(String id, H h, W w, X x, Y y) {
		this.id = id;
		this.h = h;
		this.w = w;
		this.x = x;
		this.y = y;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public H getH() {
		return this.h;
	}

	public void setH(H h) {
		this.h = h;
	}

	public W getW() {
		return this.w;
	}

	public void setW(W w) {
		this.w = w;
	}

	public X getX() {
		return this.x;
	}

	public void setX(X x) {
		this.x = x;
	}

	public Y getY() {
		return this.y;
	}

	public void setY(Y y) {
		this.y = y;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("ImageLink");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.h != null) {
			element.appendChild(this.h.getElement(xmlDocument));
		}
		if (this.w != null) {
			element.appendChild(this.w.getElement(xmlDocument));
		}
		if (this.x != null) {
			element.appendChild(this.x.getElement(xmlDocument));
		}
		if (this.y != null) {
			element.appendChild(this.y.getElement(xmlDocument));
		}

		return element;
	}
}
