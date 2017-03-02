package com.erbis.java.courses.algorithms.sort;

public class Fish {
    private String name;
    private final int age = 2;
    private int weight;

    public Fish(int weight2) {
        System.out.println(weight);
        System.out.println(age);
        this.weight = weight2;
        System.out.println(weight);
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
