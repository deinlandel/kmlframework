package org.boehn.kmlframework.todo.examples;

import java.io.IOException;

import org.boehn.kmlframework.KmlDocument;
import org.boehn.kmlframework.KmlException;
import org.boehn.kmlframework.todo.MapObject;
import org.boehn.kmlframework.todo.ModelObjectFactory;
import org.boehn.kmlframework.todo.coordinates.CartesianCoordinate;
import org.boehn.kmlframework.todo.coordinates.EarthCoordinate;

public class ModelObjectFactoryExample {
	
	public static void main(String[] args) throws KmlException, IOException {
		
		try {
			
			// We create a model
			KmlDocument model = new KmlDocument();
			
			// We create a ModelObjectFactory from a symbol file
			ModelObjectFactory modelObjectFactory = new ModelObjectFactory("resources/symbols/symbols.xml");
			
			// We create a boat object
			MapObject boat = modelObjectFactory.createMapObject("boat");
			boat.setLocation(new EarthCoordinate(59.8959, 10.6406));
			// We define the size of the boat
			boat.setScale(new CartesianCoordinate(30, 150, 30));
			// We define the direction of the boat. 0 is North
			boat.setRotation(Math.toRadians(45d));
			// We define the gps position in the boat (according to the 3D model of the boat
			boat.setLocalReferenceCoordinate(new CartesianCoordinate(2, 13, 0));
			
			// We add the object to the model
			//model.add(boat);
			
			// We generate the kml file
			//model.write("boat.kml");
			
			System.out.println("The kml file was generated.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
