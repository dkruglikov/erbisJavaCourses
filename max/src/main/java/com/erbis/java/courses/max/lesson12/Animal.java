package com.erbis.java.courses.max.lesson12;

public class Animal {
    private double age;
    private double weight;
    protected String testField = "Animal";

    public Animal() {
        System.out.println("Animal::new");
    }

    public String sounds() {
        return "";
    }

    protected void move(double distance) {
        System.out.println("Moving " + distance + " meters.");
    }

    @Override
    public String toString() {
        return "Age:" + age + "\n" + "Weight: " + weight;
        }

    protected double getAge() {
        return age;
    }

    protected double getWeight() {
        return weight;
    }

}
