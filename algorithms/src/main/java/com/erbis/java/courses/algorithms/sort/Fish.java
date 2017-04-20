package com.erbis.java.courses.algorithms.sort;

public class Fish {
    private String name;
    private int age = 2;
    private int weight;

    public Fish(int weight2) {
        System.out.println(age);
        this.weight = weight2;
        System.out.println(weight);
    }

    public Fish(int weight2, String name) {
        this.weight = weight2;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String printFishFields() {
        return "Age is:" + age + "\nWeight is: " + weight;
    }
}
