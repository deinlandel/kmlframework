package org.boehn.kmlframework;

public class Placemark extends Feature {

	private Geometry geometry;
	
	public Placemark() {}
	
	public Placemark(String name) {
		setName(name);
	}
	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	public void write(KmlDocument kmlDocument) throws KmlException {
		kmlDocument.println("<Placemark" + getIdAndTargetIdFormatted() + ">", 1);
		writeInner(kmlDocument);
		if (geometry != null) {
			geometry.write(kmlDocument);
		}
		kmlDocument.println(-1, "</Placemark>");
	}
	
	public void setLocation(double longitude, double latitude) {
		setGeometry(new Point(longitude, latitude));
	}
	
}
