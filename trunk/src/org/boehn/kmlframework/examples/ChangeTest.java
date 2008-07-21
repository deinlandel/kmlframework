package org.boehn.kmlframework.examples;

import java.io.IOException;

import org.boehn.kmlframework.kml.Document;
import org.boehn.kmlframework.kml.Kml;
import org.boehn.kmlframework.kml.KmlException;
import org.boehn.kmlframework.kml.NetworkLink;
import org.boehn.kmlframework.kml.Placemark;

public class ChangeTest {

	public static void main(String[] args) throws KmlException, IOException {
		
		// We create a new KML Document
		Kml kml = new Kml();
		
		NetworkLink networkLink = new NetworkLink();
		
		// We create a Placemark for the Department of Informatics at the university of Oslo
		Placemark ifi = new Placemark("Department of Informatics");
		ifi.setDescription("Web: http://www.ifi.uio.no<br/>Phone: +47 22852410");
		ifi.setLocation(10.717344, 59.943355);
		
		// We add a document to the kml
		Document document = new Document();
		kml.setFeature(document);
		
		// We add the placemark to the Document
		document.addFeature(ifi);
		
		// We generate the kml file
		kml.createKml("Ifi.kml");
		
		Kml kml2 = new Kml();
		
		
		
		// We are done
		System.out.println("The kml file was generated.");
	}

}
