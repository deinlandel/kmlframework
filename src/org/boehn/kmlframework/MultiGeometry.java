package org.boehn.kmlframework;

import java.util.List;

public class MultiGeometry extends Geometry {

	private List<Geometry> geometries;
	
	public List<Geometry> getGeometries() {
		return geometries;
	}

	public void setGeometries(List<Geometry> geometries) {
		this.geometries = geometries;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<MultiGeometry" + getIdAndTargetIdFormatted() + ">", 1);
		if (geometries != null) {
			for (Geometry geometry : geometries) {
				geometry.write(kmlDocument);
			}
		}
		kmlDocument.println(-1, "</MultiGeometry>");
	}
}