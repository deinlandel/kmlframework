package org.boehn.gef.modelgenerated;

public class ScreenXY {

	private String id;
	private String x;
	private String y;
	private XunitsOptions xunits;
	private YunitsOptions yunits;

	public enum XunitsOptions { pixels, insetPixels, fraction }
	public enum YunitsOptions { pixels, insetPixels, fraction }

	public ScreenXY() {
	}

	public ScreenXY(String id, String x, String y, XunitsOptions xunits, YunitsOptions yunits) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.xunits = xunits;
		this.yunits = yunits;
	}

	public String getId() {
		return this.id;
	}

	public void SetId(String id) {
		this.id = id;
	}

	public String getX() {
		return this.x;
	}

	public void SetX(String x) {
		this.x = x;
	}

	public String getY() {
		return this.y;
	}

	public void SetY(String y) {
		this.y = y;
	}

	public XunitsOptions getXunits() {
		return this.xunits;
	}

	public void SetXunits(XunitsOptions xunits) {
		this.xunits = xunits;
	}

	public YunitsOptions getYunits() {
		return this.yunits;
	}

	public void SetYunits(YunitsOptions yunits) {
		this.yunits = yunits;
	}

	public org.w3c.dom.Element getElement(org.w3c.dom.Document xmlDocument) {
		org.w3c.dom.Element element = xmlDocument.createElement("screenXY");
		if (this.id != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("id");
			attribute.appendChild(xmlDocument.createTextNode(this.id.toString()));
			element.appendChild(attribute);
		}
		if (this.x != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("x");
			attribute.appendChild(xmlDocument.createTextNode(this.x.toString()));
			element.appendChild(attribute);
		}
		if (this.y != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("y");
			attribute.appendChild(xmlDocument.createTextNode(this.y.toString()));
			element.appendChild(attribute);
		}
		if (this.xunits != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("xunits");
			attribute.appendChild(xmlDocument.createTextNode(this.xunits.toString()));
			element.appendChild(attribute);
		}
		if (this.yunits != null) {
			org.w3c.dom.Attr attribute = xmlDocument.createAttribute("yunits");
			attribute.appendChild(xmlDocument.createTextNode(this.yunits.toString()));
			element.appendChild(attribute);
		}

		return element;
	}
}
