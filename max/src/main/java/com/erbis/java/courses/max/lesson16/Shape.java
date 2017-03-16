package com.erbis.java.courses.max.lesson16;

public interface Shape {

    String DEF_STYLE = "String";

    public boolean contains(double x, double y);

    public String getBorderStyle();

    public void setBorderStyle(String borderStyle);
}
