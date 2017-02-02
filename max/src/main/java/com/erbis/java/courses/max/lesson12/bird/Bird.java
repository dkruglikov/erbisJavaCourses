package com.erbis.java.courses.max.lesson12.bird;

import com.erbis.java.courses.max.lesson12.Animal;

public class Bird extends Animal {
    protected String testField = "Bird";
    private boolean flying = true;
    private double wingsWidth = 1.5;

    public Bird(){
        System.out.println("Bird::new");
    }

    public void fly(double distance) {
        System.out.println("Flying: " + distance + " meters.");
    }

    @Override
    public void move(double distance) {
        System.out.println("Flying " + distance + " meters.");
    }

    public void move(String location) {
        System.out.println("Flying to " + location);
    }

    @Override
    public String toString() {
        return super.toString() + "\nFlying: " + flying + "\nWings width: " + wingsWidth;
    }

    public void printTestField() {
        System.out.println(testField); // this.testField
        System.out.println(super.testField);
    }
}
