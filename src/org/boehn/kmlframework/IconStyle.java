package org.boehn.kmlframework;

public class IconStyle extends ColorStyle {

	private Double scale;
	private Double heading;
	private String iconHref;
	private Double hotSpotX;
	private Double hotSpotY;
	private UnitEnum hotSpotXunits;
	private UnitEnum hotSpotYunits;
	
	public Double getScale() {
		return scale;
	}

	public void setScale(Double scale) {
		this.scale = scale;
	}

	public Double getHeading() {
		return heading;
	}

	public void setHeading(Double heading) {
		this.heading = heading;
	}

	public String getIconHref() {
		return iconHref;
	}

	public void setIconHref(String iconHref) {
		this.iconHref = iconHref;
	}

	public Double getHotSpotX() {
		return hotSpotX;
	}

	public void setHotSpotX(Double hotSpotX) {
		this.hotSpotX = hotSpotX;
	}

	public Double getHotSpotY() {
		return hotSpotY;
	}

	public void setHotSpotY(Double hotSpotY) {
		this.hotSpotY = hotSpotY;
	}

	public UnitEnum getHotSpotXunits() {
		return hotSpotXunits;
	}

	public void setHotSpotXunits(UnitEnum hotSpotXunits) {
		this.hotSpotXunits = hotSpotXunits;
	}

	public UnitEnum getHotSpotYunits() {
		return hotSpotYunits;
	}

	public void setHotSpotYunits(UnitEnum hotSpotYunits) {
		this.hotSpotYunits = hotSpotYunits;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<IconStyle" + getIdAndTargetIdFormatted() + ">", 1);
		super.writeInner(kmlDocument);
		if (scale != null) {
			kmlDocument.println("<scale>" + scale + "</scale>");
		}
		if (heading != null) {
			kmlDocument.println("<heading>" + heading + "</heading>");
		}
		if (iconHref != null) {
			kmlDocument.println("<Icon>", 1);
			kmlDocument.println("<href>" + iconHref + "</href>");
			kmlDocument.println(-1, "</Icon>");
		}
		if (hotSpotX != null || hotSpotY != null || hotSpotXunits != null || hotSpotYunits != null) {
			kmlDocument.println("<hotSpot" + (hotSpotX != null ? " x=\"" + hotSpotX + "\"" : "") + (hotSpotY != null ? " y=\"" + hotSpotY + "\"" : "") + (hotSpotXunits != null ? " xunits=\"" + hotSpotXunits + "\"" : "") + (hotSpotYunits != null ? " yunits=\"" + hotSpotYunits + "\"" : "") + "/>");
		}
		kmlDocument.println(-1, "</IconStyle>");
	}
}