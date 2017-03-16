package com.erbis.java.courses.max.lesson16;

public class Point {

    private double x;
    private double y;
    private double[] coordinates;

    public double getX(double x) {
        return x;
    }

    public double getY(double y) {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setCoordinatas(double x, double y) {
        double[] array = {x, y};
        this.coordinates = array;
    }
}
