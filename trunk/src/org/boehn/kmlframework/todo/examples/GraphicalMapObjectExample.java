package org.boehn.kmlframework.todo.examples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.boehn.kmlframework.KmlDocument;
import org.boehn.kmlframework.KmlException;
import org.boehn.kmlframework.todo.GraphicalModel;
import org.boehn.kmlframework.todo.MapObject;
import org.boehn.kmlframework.todo.MapObjectClass;
import org.boehn.kmlframework.todo.Polygon;
import org.boehn.kmlframework.todo.coordinates.CartesianCoordinate;
import org.boehn.kmlframework.todo.coordinates.Coordinate;
import org.boehn.kmlframework.todo.coordinates.EarthCoordinate;
import org.boehn.kmlframework.todo.coordinates.TimeAndPlace;

public class GraphicalMapObjectExample {

	public static void main(String[] args) throws KmlException, IOException {
		
		// We create a model
		KmlDocument model = new KmlDocument();
		
		// We define a MapObjectClass for a boat
		MapObjectClass boatClass = new MapObjectClass("boat");
		GraphicalModel boatModel = new GraphicalModel();
		List<Coordinate> coordinates = new ArrayList<Coordinate>();
		coordinates.add(new CartesianCoordinate(0, 0, 1));
		coordinates.add(new CartesianCoordinate(1, 0, 1));
		coordinates.add(new CartesianCoordinate(1, 0.7, 1));
		coordinates.add(new CartesianCoordinate(0.5, 1, 1));
		coordinates.add(new CartesianCoordinate(0, 0.7, 1));
		coordinates.add(new CartesianCoordinate(0, 0, 1));
		Polygon polygon = new Polygon(coordinates);
		boatModel.addGraphicalModelElement(polygon);
		boatClass.addModel(boatModel);
		
		// We create a boat object
		MapObject boat = new MapObject("Titanic II");
		boat.setLocation(new EarthCoordinate(59.8959, 10.6406));
		boat.setMapObjectClass(boatClass);
		// We define the size of the boat
		boat.setScale(new CartesianCoordinate(30, 150, 30));
		// We define the direction of the boat. 0 is North
		boat.setRotation(Math.toRadians(45d));
		// We define the gps position in the boat (according to the 3D model of the boat
		boat.setLocalReferenceCoordinate(new CartesianCoordinate(2, 13, 0));
		
		// We define how the boat has been moving the last period of time. This will draw a tail after the boat
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.add(Calendar.MINUTE, -15);
		boat.addMovement(new TimeAndPlace(new EarthCoordinate(59.895018, 10.638732), calendar.getTime()));
		calendar.add(Calendar.MINUTE, -15);
		boat.addMovement(new TimeAndPlace(new EarthCoordinate(59.892980, 10.638991), calendar.getTime()));
		calendar.add(Calendar.MINUTE, -15);
		boat.addMovement(new TimeAndPlace(new EarthCoordinate(59.891171, 10.640006), calendar.getTime()));
		calendar.add(Calendar.MINUTE, -15);
		boat.addMovement(new TimeAndPlace(new EarthCoordinate(59.890575, 10.645234), calendar.getTime()));
		calendar.add(Calendar.MINUTE, -15);
		boat.addMovement(new TimeAndPlace(new EarthCoordinate(59.889318, 10.644650), calendar.getTime()));
		
		// We add the object to the model
		//model.add(boat);
		
		// In order to make the kml more human readable we may activate indenting
		model.XML_INDENT = true;
		
		// We generate the kml file
		//model.write("boat.kml");
		
		System.out.println("The kml file was generated.");
	}

}
