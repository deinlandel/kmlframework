package org.boehn.kmlframework.examples;

import java.io.IOException;

import org.boehn.kmlframework.KmlDocument;
import org.boehn.kmlframework.KmlException;
import org.boehn.kmlframework.Placemark;

public class SimpleExample {

	public static void main(String[] args) throws KmlException, IOException {
		
		// We create a new KMLL Document
		KmlDocument kmlDocument = new KmlDocument();
		
		// We create a Placemark for the Department of Informatics at the university of Oslo
		Placemark ifi = new Placemark("Department of Informatics");
		ifi.setDescription("Web: http://www.ifi.uio.no<br/>Phone: +47 22852410");
		ifi.setLocation(59.943355, 10.717344);
		
		// We add the placemark to the KML Document
		kmlDocument.add(ifi);
		
		// We generate the kml file
		kmlDocument.createKml("Ifi.kml");
		
		// We are done
		System.out.println("The kml file was generated.");
	}

}
