package com.erbis.java.cources.yana.lesson16;

public interface Shape {
	String DEF_STYLE = "SOLID";
	boolean contains(double x, double y);
	String getBorderStyle();
	void setBorderStyle(String borderStyle);
}
