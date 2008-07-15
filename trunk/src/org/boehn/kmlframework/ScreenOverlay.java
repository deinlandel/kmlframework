package org.boehn.kmlframework;

public class ScreenOverlay extends Overlay {

	private Double overlayX;
	private Double overlayY;
	private UnitEnum overlayXunits;
	private UnitEnum overlayYunits;
	private Double screenX;
	private Double screenY;
	private UnitEnum screenXunits;
	private UnitEnum screenYunits;
	private Double rotationX;
	private Double rotationY;
	private UnitEnum rotationXunits;
	private UnitEnum rotationYunits;
	private Double sizeX;
	private Double sizeY;
	private UnitEnum sizeXunits;
	private UnitEnum sizeYunits;
	private Double rotation;
	
	public Double getOverlayX() {
		return overlayX;
	}

	public void setOverlayX(Double overlayX) {
		this.overlayX = overlayX;
	}

	public Double getOverlayY() {
		return overlayY;
	}

	public void setOverlayY(Double overlayY) {
		this.overlayY = overlayY;
	}

	public UnitEnum getOverlayXunits() {
		return overlayXunits;
	}

	public void setOverlayXunits(UnitEnum overlayXunits) {
		this.overlayXunits = overlayXunits;
	}

	public UnitEnum getOverlayYunits() {
		return overlayYunits;
	}

	public void setOverlayYunits(UnitEnum overlayYunits) {
		this.overlayYunits = overlayYunits;
	}

	public Double getScreenX() {
		return screenX;
	}

	public void setScreenX(Double screenX) {
		this.screenX = screenX;
	}

	public Double getScreenY() {
		return screenY;
	}

	public void setScreenY(Double screenY) {
		this.screenY = screenY;
	}

	public UnitEnum getScreenXunits() {
		return screenXunits;
	}

	public void setScreenXunits(UnitEnum screenXunits) {
		this.screenXunits = screenXunits;
	}

	public UnitEnum getScreenYunits() {
		return screenYunits;
	}

	public void setScreenYunits(UnitEnum screenYunits) {
		this.screenYunits = screenYunits;
	}

	public Double getRotationX() {
		return rotationX;
	}

	public void setRotationX(Double rotationX) {
		this.rotationX = rotationX;
	}

	public Double getRotationY() {
		return rotationY;
	}

	public void setRotationY(Double rotationY) {
		this.rotationY = rotationY;
	}

	public UnitEnum getRotationXunits() {
		return rotationXunits;
	}

	public void setRotationXunits(UnitEnum rotationXunits) {
		this.rotationXunits = rotationXunits;
	}

	public UnitEnum getRotationYunits() {
		return rotationYunits;
	}

	public void setRotationYunits(UnitEnum rotationYunits) {
		this.rotationYunits = rotationYunits;
	}

	public Double getSizeX() {
		return sizeX;
	}

	public void setSizeX(Double sizeX) {
		this.sizeX = sizeX;
	}

	public Double getSizeY() {
		return sizeY;
	}

	public void setSizeY(Double sizeY) {
		this.sizeY = sizeY;
	}

	public UnitEnum getSizeXunits() {
		return sizeXunits;
	}

	public void setSizeXunits(UnitEnum sizeXunits) {
		this.sizeXunits = sizeXunits;
	}

	public UnitEnum getSizeYunits() {
		return sizeYunits;
	}

	public void setSizeYunits(UnitEnum sizeYunits) {
		this.sizeYunits = sizeYunits;
	}

	public Double getRotation() {
		return rotation;
	}

	public void setRotation(Double rotation) {
		this.rotation = rotation;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<ScreenOverlay" + getIdAndTargetIdFormatted() + ">", 1);
		super.writeInner(kmlDocument);
		if (overlayX != null || overlayY != null || overlayXunits != null || overlayYunits != null) {
			kmlDocument.println("<overlayXY" + (overlayX != null ? " x=\"" + overlayX + "\"" : "") + (overlayY != null ? " y=\"" + overlayY + "\"" : "") + (overlayXunits != null ? " xunits=\"" + overlayXunits + "\"" : "") + (overlayYunits != null ? " yunits=\"" + overlayYunits + "\"" : "") + "/>");
		}
		if (screenX != null || screenY != null || screenXunits != null || screenYunits != null) {
			kmlDocument.println("<screenXY" + (screenX != null ? " x=\"" + screenX + "\"" : "") + (screenY != null ? " y=\"" + screenY + "\"" : "") + (screenXunits != null ? " xunits=\"" + screenXunits + "\"" : "") + (screenYunits != null ? " yunits=\"" + screenYunits + "\"" : "") + "/>");
		}
		if (rotationX != null || rotationY != null || rotationXunits != null || rotationYunits != null) {
			kmlDocument.println("<rotationXY" + (rotationX != null ? " x=\"" + rotationX + "\"" : "") + (rotationY != null ? " y=\"" + rotationY + "\"" : "") + (rotationXunits != null ? " xunits=\"" + rotationXunits + "\"" : "") + (rotationYunits != null ? " yunits=\"" + rotationYunits + "\"" : "") + "/>");
		}
		if (sizeX != null || sizeY != null || sizeXunits != null || sizeYunits != null) {
			kmlDocument.println("<sizeXY" + (sizeX != null ? " x=\"" + sizeX + "\"" : "") + (sizeY != null ? " y=\"" + sizeY + "\"" : "") + (sizeXunits != null ? " xunits=\"" + sizeXunits + "\"" : "") + (sizeYunits != null ? " yunits=\"" + sizeYunits + "\"" : "") + "/>");
		}
		if (rotation != null) {
			kmlDocument.println("<rotation>" + rotation + "</rotation>"); 
		}
		kmlDocument.println(-1, "</ScreenOverlay>");
	}

}