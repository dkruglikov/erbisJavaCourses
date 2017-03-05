package com.erbis.java.cources.yana.lesson16;

public class Rectangle 
extends Bordered
implements Shape, Colored {
	
	private String borderStyle;
	
	private double[][] point = new double[4][2];
	
	private int colour;
	
	@Override
	public boolean contains (double x, double y) {
		return false;
	}
	
	@Override
	public int getRGB(int colour) {
		return 0;
	}

	@Override
	public int setRGB(int colour) {
		return 0;
	}

}
