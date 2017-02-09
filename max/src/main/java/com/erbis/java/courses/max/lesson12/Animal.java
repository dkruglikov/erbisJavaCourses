package com.erbis.java.courses.max.lesson12;

public abstract class Animal extends Sound {
    private double age;
    private double weight;
    protected String testField = "Animal";

    public Animal(double age, double weight) {
        this();
        this.age = age;
        this.weight=weight;
        System.out.println("Animal::new(int, double)");
    }

    private Animal(){
        System.out.println("Animal::new");
    }

    public abstract String sounds();

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
