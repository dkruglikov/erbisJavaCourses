package com.erbis.java.courses.max.lesson16;

import java.awt.*;
import java.util.SplittableRandom;

public class Triangle extends Bordered implements Shape, Colored {

    private String borderStyle;
    public double x[];
    public double y[];
    public double z[];

    private int color;

    public Triangle (int color, String borderStyle) {
        this.color=color;
        this.borderStyle=super.getBorderStyle();
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
