package org.boehn.gef.servlet;

import org.apache.log4j.Logger;
import org.boehn.gef.BoundingBox;
import org.boehn.gef.ViewPosition;
import org.boehn.gef.coordinates.CartesianCoordinate;
import org.boehn.gef.coordinates.EarthCoordinate;

public class Observer {

	private BoundingBox boundingBox;
	private ViewPosition viewPosition;
	private CartesianCoordinate observerCoordinate;
	
	private static Logger log = Logger.getLogger(Observer.class);
	
	public Observer() {}
	
	public Observer(BoundingBox boundingBox, ViewPosition viewPosition) {
		this.boundingBox = boundingBox;
		this.viewPosition = viewPosition;
	}

	public Boolean isVisibleToObserver(EarthCoordinate earthCoordinate) {
		if (boundingBox != null) {
			return boundingBox.isInsideBoundingBox(earthCoordinate);
		} else {
			return null;
		}
	}
	
	public Double distanceTo(EarthCoordinate earthCoordinate) {
		if (earthCoordinate != null) {
			return distanceTo(earthCoordinate.toCartesianCoordinate());
		} else {
			return null;
		}
	}
	
	public Double distanceTo(CartesianCoordinate cartesianCoordinate) {
		if (cartesianCoordinate != null) {
			return getObserverCoordinate().distanceTo(cartesianCoordinate);
		} else {
			return null;
		}
	}
	
	public CartesianCoordinate getObserverCoordinate() {
		if (observerCoordinate == null) {
			
			if (viewPosition != null && viewPosition.getRange() != null && viewPosition.getTilt() != null && viewPosition.getHeading() != null) {
				// We make the vector starting in 0,0,0 and going straig up with the length = lookAtRange
				observerCoordinate = new CartesianCoordinate(0, 0, viewPosition.getRange());
				
				// We rotate the vector around the Z axis to get the correct tilt
				observerCoordinate.rotateAroundZAxis(viewPosition.getTilt());
				
				// We rotate the vector around the Y axis to get the correct heading
				observerCoordinate.rotateAroundYAxis(viewPosition.getHeading());
				
				// Now we have our vector finish in the local coordinate system. Now we have to place it out on the earth
				
				// First we have to rotate our local coordinate system to the surface of the earth
				observerCoordinate.rotateAroundZAxis(Math.toRadians(viewPosition.getLatitude()));
				observerCoordinate.rotateAroundYAxis(Math.toRadians(viewPosition.getLongitude()));
				
				// Now our vector has the correct length and direction. We only have to place it out at the lookAt coordinate
				observerCoordinate.add(new EarthCoordinate(viewPosition.getLatitude(), viewPosition.getLongitude()).toCartesianCoordinate());
			} else {
				log.warn("The observer coordinate is being requested, but the observer has not defined sufficient data for calculating this.");
			}
		}
		return observerCoordinate;
	}
	
	public BoundingBox getBoundingBox() {
		return boundingBox;
	}

	public void setBoundingBox(BoundingBox boundingBox) {
		this.boundingBox = boundingBox;
	}

	public void setViewPosition(ViewPosition viewPosition) {
		this.viewPosition = viewPosition;
		observerCoordinate = null;
	}

	public ViewPosition getViewPosition() {
		return viewPosition;
	}
	
}