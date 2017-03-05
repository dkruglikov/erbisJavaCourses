package com.erbis.java.cources.yana.lesson16;

public class Triangle 
extends Bordered
implements Shape, Colored {
	
	private String borderStyle;
	
	private double[][] point = new double[3][2];
	
	private int colour; 
	
//	@Override
//	public String getBorderStyle() {
//		return borderStyle;
//	}
	
//	@Override
//	public void setBorderStyle(String borderStyle) {
//		this.borderStyle = borderStyle;
//	}
	
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
