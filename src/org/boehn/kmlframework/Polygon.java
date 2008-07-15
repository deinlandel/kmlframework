package org.boehn.kmlframework;

import java.util.List;

public class Polygon extends Geometry {

	private Boolean extrude;
	private Boolean tessellate;
	private AltitudeModeEnum altitudeMode;
	private LinearRing outerBoundary;
	private List<LinearRing> innerBoundaries;
	
	public Boolean getExtrude() {
		return extrude;
	}

	public void setExtrude(Boolean extrude) {
		this.extrude = extrude;
	}

	public Boolean getTessellate() {
		return tessellate;
	}

	public void setTessellate(Boolean tessellate) {
		this.tessellate = tessellate;
	}

	public AltitudeModeEnum getAltitudeMode() {
		return altitudeMode;
	}

	public void setAltitudeMode(AltitudeModeEnum altitudeMode) {
		this.altitudeMode = altitudeMode;
	}

	public LinearRing getOuterBoundary() {
		return outerBoundary;
	}

	public void setOuterBoundary(LinearRing outerBoundary) {
		this.outerBoundary = outerBoundary;
	}

	public List<LinearRing> getInnerBoundaries() {
		return innerBoundaries;
	}

	public void setInnerBoundaries(List<LinearRing> innerBoundaries) {
		this.innerBoundaries = innerBoundaries;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		// We validate the data
		if (outerBoundary == null) {
			throw new KmlException("An outerBoundary is required in a Polygon");
		}
		
		kmlDocument.println("<Polygon" + getIdAndTargetIdFormatted() + ">", 1);
		if (extrude != null) {
			kmlDocument.println("<extrude>" + booleanToInt(extrude) + "</extrude>");
		}
		if (tessellate!= null) {
			kmlDocument.println("<tessellate>" + booleanToInt(tessellate) + "</tessellate>");
		}
		if (altitudeMode!= null) {
			kmlDocument.println("<altitudeMode>" + altitudeMode + "</altitudeMode>");
		}
		
		kmlDocument.println("<outerBoundaryIs>", 1);
		outerBoundary.write(kmlDocument);
		kmlDocument.println(-1, "</outerBoundaryIs>");
		
		if (innerBoundaries != null) {
			for (LinearRing innerBounadry : innerBoundaries) {
				kmlDocument.println("<innerBoundaryIs>", 1);
				innerBounadry.write(kmlDocument);
				kmlDocument.println(-1, "</innerBoundaryIs>");
			}
		}
		kmlDocument.println(-1, "</Polygon>");
	}
}