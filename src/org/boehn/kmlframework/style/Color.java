package org.boehn.kmlframework.style;

public class Color {

	private int r;
	private int g;
	private int b;
	private int alpha;
	
	public static Color black = new Color(0, 0, 0);
	public static Color blue = new Color(0, 0, 255);
	public static Color cyan = new Color(0, 173, 239);
	public static Color darkGrey = new Color(64, 64, 64);
	public static Color gray = new Color(128, 128, 128);
	public static Color green = new Color(0, 255, 0);
	public static Color lightGray = new Color(191, 191, 191);
	public static Color magenta = new Color(255, 0, 255);
	public static Color orange = new Color(255, 127, 0);
	public static Color pink = new Color(255, 127, 255);
	public static Color red = new Color(255, 0, 0);
	public static Color white = new Color(255, 255, 255);
	public static Color yellow = new Color(255, 255, 0);
	
	public Color() {}
	
	public Color(int red, int green, int blue) {
		this(red, green, blue, 255);
	}
	
	public Color(int red, int green, int blue, int alpha) {
		setRed(red);
		setGreen(green);
		setBlue(blue);
		setAlpha(alpha);
	}

	public int getAlpha() {
		return alpha;
	}

	public void setAlpha(int alpha) {
		verifyValue(alpha);
		this.alpha = alpha;
	}

	public int getBlue() {
		return b;
	}

	public void setBlue(int blue) {
		verifyValue(blue);
		this.b = blue;
	}

	public int getGreen() {
		return g;
	}

	public void setGreen(int green) {
		verifyValue(green);
		this.g = green;
	}

	public int getRed() {
		return r;
	}

	public void setRed(int red) {
		verifyValue(red);
		this.r = red;
	}
	
	public String toHexString() {
		String result = "";
		
		if (alpha < 16) {
			result += "0";
		}
		result += Integer.toHexString(alpha);
		
		if (b < 16) {
			result += "0";
		}
		result += Integer.toHexString(b);
		
		if (g < 16) {
			result += "0";
		}
		result += Integer.toHexString(g);
		
		if (r < 16) {
			result += "0";
		}
		result += Integer.toHexString(r);
		
		return result;
	}
	
	private static void verifyValue(int value) {
		if (value < 0 || value > 255) {
			throw new IllegalArgumentException("Value must be in the range (0 - 255). " + value + " is not valid.");
		}
	}

}
