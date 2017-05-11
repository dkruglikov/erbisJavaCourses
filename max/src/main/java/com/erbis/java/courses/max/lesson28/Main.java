package com.erbis.java.courses.max.lesson28;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        try {
            dog.setAge(-5);
        } catch (AgeException e) {
            System.out.println();
        }
    }
}
