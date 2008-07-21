package org.boehn.kmlframework.kml;

public class Delete extends UpdateElement {

	public Delete() {}
	
	public Delete(KmlObject kmlObject) {
		setKmlObject(kmlObject);
	}
	
	public void write(Kml kml) throws KmlException {
		kml.println("<Delete>", 1);
		getKmlObject().writeDelete(kml);
		kml.println(-1, "</Delete>");
	}
}
