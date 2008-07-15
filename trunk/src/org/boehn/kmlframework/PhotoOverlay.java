package org.boehn.kmlframework;

public class PhotoOverlay extends Overlay {

	private Double rotation; // TODO check if Double is working fine for kml:angle180
	private Double leftFov;
	private Double rightFov;
	private Double bottomFov;
	private Double topFov;
	private Double near;
	private Integer tileSize;
	private Integer maxWidth;
	private Integer maxHeight;
	private GridOriginEnum gridOrigin;
	private Point point;
	private ShapeEnum shape;
	
	public Double getRotation() {
		return rotation;
	}

	public void setRotation(Double rotation) {
		this.rotation = rotation;
	}

	public Double getLeftFov() {
		return leftFov;
	}

	public void setLeftFov(Double leftFov) {
		this.leftFov = leftFov;
	}

	public Double getRightFov() {
		return rightFov;
	}

	public void setRightFov(Double rightFov) {
		this.rightFov = rightFov;
	}

	public Double getBottomFov() {
		return bottomFov;
	}

	public void setBottomFov(Double bottomFov) {
		this.bottomFov = bottomFov;
	}

	public Double getTopFov() {
		return topFov;
	}

	public void setTopFov(Double topFov) {
		this.topFov = topFov;
	}

	public Double getNear() {
		return near;
	}

	public void setNear(Double near) {
		this.near = near;
	}

	public Integer getTileSize() {
		return tileSize;
	}

	public void setTileSize(Integer tileSize) {
		this.tileSize = tileSize;
	}

	public Integer getMaxWidth() {
		return maxWidth;
	}

	public void setMaxWidth(Integer maxWidth) {
		this.maxWidth = maxWidth;
	}

	public Integer getMaxHeight() {
		return maxHeight;
	}

	public void setMaxHeight(Integer maxHeight) {
		this.maxHeight = maxHeight;
	}

	public GridOriginEnum getGridOrigin() {
		return gridOrigin;
	}

	public void setGridOrigin(GridOriginEnum gridOrigin) {
		this.gridOrigin = gridOrigin;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public ShapeEnum getShape() {
		return shape;
	}

	public void setShape(ShapeEnum shape) {
		this.shape = shape;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<PhotoOverlay" + getIdAndTargetIdFormatted() + ">", 1);
		super.writeInner(kmlDocument);
		if (rotation != null) {
			kmlDocument.println("<rotation>" + rotation + "</rotation>");
		}
		if (leftFov != null || rightFov != null || bottomFov != null || topFov != null || near != null) {
			kmlDocument.println("<ViewVolume>", 1);
			if (leftFov != null) {
				kmlDocument.println("<leftFov>" + leftFov + "</leftFov>");
			}
			if (rightFov != null) {
				kmlDocument.println("<rightFov>" + rightFov + "</rightFov>");
			}
			if (bottomFov != null) {
				kmlDocument.println("<bottomFov>" + bottomFov + "</bottomFov>");
			}
			if (topFov != null) {
				kmlDocument.println("<topFov>" + topFov + "</topFov>");
			}
			if (near != null) {
				kmlDocument.println("<near>" + near + "</near>");
			}
			kmlDocument.println(-1, "</ViewVolume>");
		}
		if (tileSize != null || maxWidth != null || maxHeight != null || gridOrigin != null) {
			kmlDocument.println("<ImagePyramid>", 1);
			if (tileSize != null) {
				kmlDocument.println("<tileSize>" + tileSize + "</tileSize>");
			}
			if (maxWidth != null) {
				kmlDocument.println("<maxWidth>" + maxWidth + "</maxWidth>");
			}
			if (maxHeight != null) {
				kmlDocument.println("<maxHeight>" + maxHeight + "</maxHeight>");
			}
			if (gridOrigin != null) {
				kmlDocument.println("<gridOrigin>" + gridOrigin + "</gridOrigin>");
			}
			kmlDocument.println(-1, "</ImagePyramid>");
			if (point != null) {
				point.write(kmlDocument);
			}
			if (shape != null) {
				kmlDocument.println("<shape>" + shape + "</shape>");
			}
		}
		kmlDocument.println(-1, "</PhotoOverlay>");
	}

}