package org.boehn.kmlframework;

public abstract class Overlay extends Feature {

	private String color; // TODO change to Java color classes + separate transparency?
	private Integer drawOrder;
	private Icon icon;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Integer getDrawOrder() {
		return drawOrder;
	}
	
	public void setDrawOrder(Integer drawOrder) {
		this.drawOrder = drawOrder;
	}
	
	public Icon getIcon() {
		return icon;
	}
	
	public void setIcon(Icon icon) {
		this.icon = icon;
	}
	
	public void writeInner(KmlDocument kmlDocument) throws KmlException {
		super.writeInner(kmlDocument);
		if (color != null) {
			kmlDocument.println("<color>" + color + "</color>");
		}
		if (drawOrder != null) {
			kmlDocument.println("<drawOrder>" + drawOrder + "</drawOrder>");
		}
		if (icon != null) {
			icon.write(kmlDocument);
		}
	}
}