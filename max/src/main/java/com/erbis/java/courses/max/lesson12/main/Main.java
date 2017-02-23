package com.erbis.java.courses.max.lesson12.main;

import com.erbis.java.courses.max.lesson12.Animal;
import com.erbis.java.courses.max.lesson12.bird.Bird;
import com.erbis.java.courses.max.lesson12.fish.Fish;
import com.erbis.java.courses.max.lesson12.fish.Shark;

public class Main {
    public static void main(String[] argv) {
//        testOverride();
//        testConstructors();
//        testSounds();
//        testPolymorph();
        testFinalShark();
    }

    private static void testOverride() {
        Animal animal = new Animal(15, 9.9) {
            @Override
            public String sounds() {
                return null;
            }
        };
        System.out.println(animal.sounds());
        Bird bird = new Bird(15, 55, true, 11);
        bird.fly(370);
        bird.move(371);
        System.out.println(bird);
        System.out.println();
        System.out.println(animal);
        System.out.println(bird);
        System.out.println("\n__________________");
    }

    private static void testSounds() {
        Animal animal = new Animal(5, 13) {
            @Override
            public String sounds() {
                return null;
            }
        };
        System.out.println(animal.sounds());
        System.out.println(animal.catSounds());
        System.out.println(animal.crowSounds());
        System.out.println(animal.dogSounds());
        }

    private static void testConstructors() {
        Bird bird = new Bird(15, 55, true, 11);
    }

    private static void testPolymorph(){
        Animal animal0 = new Bird(15, 15, true, 15);
        System.out.println(animal0);
        System.out.println("_________________");
        Animal animal1 = new Fish(15, 15);
        System.out.println(animal1);
        System.out.println(animal0.sounds());
        System.out.println(animal1.sounds());

        Bird bird0 = (Bird) animal0;
        bird0.move(15);
//        ((Bird) animal0).move(55);
        if(animal0 instanceof Fish) {
            Fish fish0 = (Fish) animal0;
        } else {
            System.out.println("animal is not a fish");
        }
    }

    private final static void testFinalShark() {
        Shark shark = new Shark(55, 990, "Vanessa");
        System.out.println(shark);
    }
}
