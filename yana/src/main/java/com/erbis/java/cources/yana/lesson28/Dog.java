package com.erbis.java.cources.yana.lesson28;

public class Dog {
    private double age;
    private String name;

    public double getAge() {
        try {
            return age;
        } finally {
            System.out.println("getAge called");
        }
    }

    public void setAge(double age) throws AgeException {
        try {if (age <= 0) {
            throw new AgeException("Age is not positive");
        }
        this.age = age;
        } finally {
            System.out.println("setAge called");
        }
        
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
