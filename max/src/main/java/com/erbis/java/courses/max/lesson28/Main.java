package com.erbis.java.courses.max.lesson28;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        try {
            dog.setAge(-5);
            dog.setName("Puppy");
            System.out.println(dog.getAge());
        } catch (AgeException | InvalidNameException e) {
            throw new IllegalArgumentException(e);
        } finally {
            System.out.println("Some final action");
        }
    }
}
