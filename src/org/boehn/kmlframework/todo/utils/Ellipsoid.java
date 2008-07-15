package org.boehn.kmlframework.todo.utils;

public class Ellipsoid {
	
	private static double K1;
	private static double K2;
	private static double Eps2;
		
	static {
		Init();
	}
	
	public static void Init(double a, double f) {
		CreateConstants(a, f);
	}
	
	public static void Init() {
		CreateConstants(6378137, 298.257223563); // default to wgs 84
	}
	
	public static double foo() {
		return 1d;
	}
	
	protected static void CreateConstants(double a, double f) {		
		double fInverted = 1 / f;
		Eps2 = (fInverted) * (2d - fInverted);
		K1 = Math.toRadians(a * (1d - Eps2));
		K2 = Math.toRadians(a);
	}
	
	/**
	 * Convert meter to longitude at ref latitude
	 */
	public static final double meterToLongitude(double latitude) {
		return 1.0 / longitudeToMeter(latitude);
	}
	
	/**
	 * Convert meter to latitude at ref latitude
	 */
	public static final double meterToLatitude(double latitude) {
		return 1.0 / latitudeToMeter(latitude);
	}
	
	/**
	 * Convert longitude to meter at ref latitude
	 */
	public static final double longitudeToMeter(double latitude) {
		return (Math.cos(Math.toRadians(latitude)) * K2) / Math.sqrt(getDiv0(latitude));
	}
	
	/**
	 * Convert latitude to meter at ref latitude
	 */
	public static final double latitudeToMeter(double latitude) {
		return (K1 / Math.sqrt(Math.pow(getDiv0(latitude), 3)));
	}
	
	private static final double getDiv0(double latitude) {
		return 1.0 - Eps2 * Math.pow(Math.sin(Math.toRadians(latitude)), 2);
	}
	
}