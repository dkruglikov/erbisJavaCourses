package com.erbis.java.cources.olga.lesson16;

public class Triangle 
extends Bordered
implements Shape, Colored {
	private String borderStyle;

	@Override
	public boolean contains(double x, double y) {
		return false;
	}

//	@Override
//	public String getBorderStyle() {
//		return borderStyle;
//	}
//
//	@Override
//	public void setBorderStyle(String borderStyle) {	
//		this.borderStyle = borderStyle;
//	}

	@Override
	public int getRGB() {
		return 0;
	}
	
	
	
}
