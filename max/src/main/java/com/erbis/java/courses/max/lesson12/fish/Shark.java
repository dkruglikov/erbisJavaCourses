package com.erbis.java.courses.max.lesson12.fish;

public class Shark extends Fish {
    private final String name;
    public String name2;

    public Shark(double age, double weight, String name) {
        super(age, weight);
        this.name=name;
    }

    @Override
    protected void move(double distance) {
        System.out.println("I'm shark");
    }

//    public void setName (String name) {
//        this.name=name;
//    }

    public String getName(String name) {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + getAge() + "\nWeight: " + getWeight();
    }

}
