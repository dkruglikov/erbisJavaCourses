package com.erbis.java.cources.yana.lesson28;

public class Dog {
    private double age;
    private String name;

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age is not positive");
        }
        this.age = age; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!Character.isUpperCase(name.charAt(0))) {
            throw new IllegalArgumentException("Name does not begin from uppercase.");
        }
        this.name = name;
    }
    
    
}
