package com.erbis.java.cources.olga.lesson16;

public interface Shape {
	String defStyle="SOLID";
	
	boolean contains(double x, double y);
	String getBorderStyle();
	void setBorderStyle(String borderStyle);
}
