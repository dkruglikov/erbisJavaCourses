package com.erbis.java.courses.max.lesson16;

public class Circle extends Bordered implements Colored, Shape {
    private String borderStyle;
    private double x[];
    private double y[];
    private int color;

    public Circle(int color, String borderStyle) {
        this.color = color;
        this.borderStyle = super.getBorderStyle();
    }

    @Override
    public void setRGB(int color) {
        this.color = color;
    }

    @Override
    public int getRGB(int color) {
        return color;
    }

    @Override
    public boolean contains(double x, double y) {
        return false;
    }

    @Override
    public String getBorderStyle() {
        return borderStyle;
    }

    @Override
    public void setBorderStyle(String borderStyle) {
        this.borderStyle = borderStyle;
    }


}
