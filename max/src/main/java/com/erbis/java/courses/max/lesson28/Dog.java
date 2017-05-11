package com.erbis.java.courses.max.lesson28;

import com.sun.org.apache.bcel.internal.classfile.Unknown;

public class Dog {
    private double age;
    private String name;

    public void setAge(double age) throws AgeException {
        if (age <= 0) {
            throw new AgeException("Age is not positive");
        }
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setName(String name) throws InvalidNameException {
        if (name==null) {
            throw new InvalidNameException("Name is empty");
        }
        if (Character.isUpperCase(name.charAt(0))) {
            this.name=name;
        } else {
            throw new InvalidNameException("Name starts with lowercase");
        }
    }
}
