package com.erbis.java.cources.yana.lesson28;

public class Dog {
    private double age;
    private String name;

    public double getAge() {
        return age;
    }

    public void setAge(double age) throws AgeException {
        if (age <= 0) {
            throw new AgeException("Age is not positive");
        }
        this.age = age; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidNameException {
        if (!Character.isUpperCase(name.charAt(0))) {
            throw new InvalidNameException("Name does not begin from uppercase.");
        }
        this.name = name;
    }
    
    
}
