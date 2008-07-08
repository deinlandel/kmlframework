package org.boehn.gef.overlays;

import org.boehn.gef.ModelException;
import org.boehn.gef.Model;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Icon {

	private String url;
	private Integer x;
	private Integer y;
	private Integer width;
	private Integer height;
	
	public Icon() {}
	
	public Icon(String url) {
		this.url = url;
	}
	
	public Icon(String url, Integer x, Integer y, Integer width, Integer height) {
		this.url = url;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public void addKml(Element parentElement, Model model, Document xmlDocument) throws ModelException {
		Element iconElement = xmlDocument.createElement("Icon");

		if (url != null) {
			Element urlElement = xmlDocument.createElement("href");
			urlElement.appendChild(xmlDocument.createTextNode(url));
			iconElement.appendChild(urlElement);
		}
		
		if (x != null) {
			Element xElement = xmlDocument.createElement("x");
			xElement.appendChild(xmlDocument.createTextNode(x.toString()));
			iconElement.appendChild(xElement);
		}
		
		if (y != null) {
			Element yElement = xmlDocument.createElement("y");
			yElement.appendChild(xmlDocument.createTextNode(y.toString()));
			iconElement.appendChild(yElement);
		}
		
		if (width != null) {
			Element widthElement = xmlDocument.createElement("w");
			widthElement.appendChild(xmlDocument.createTextNode(width.toString()));
			iconElement.appendChild(widthElement);
		}
		
		if (height != null) {
			Element heightElement = xmlDocument.createElement("h");
			heightElement.appendChild(xmlDocument.createTextNode(height.toString()));
			iconElement.appendChild(heightElement);
		}
		
		parentElement.appendChild(iconElement);
	}
	
}
