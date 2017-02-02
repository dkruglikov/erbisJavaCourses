package com.erbis.java.courses.max.lesson12.main;

import com.erbis.java.courses.max.lesson12.Animal;
import com.erbis.java.courses.max.lesson12.bird.Bird;

public class Main {
    public static void main(String[] argv) {
//        testOverride();
        testConstructors();
    }

    private static void testOverride() {
        Animal animal = new Animal();
//        animal.move(27);
        System.out.println(animal.sounds());
        Bird bird = new Bird();
        bird.fly(370);
        bird.move(371);
        System.out.println(bird);
        System.out.println();
        System.out.println(animal);
        System.out.println(bird);
        System.out.println("\n__________________");
    }

    private static void testConstructors() {
        Bird bird = new Bird();
    }
}
