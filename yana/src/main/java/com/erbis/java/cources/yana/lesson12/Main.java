package com.erbis.java.cources.yana.lesson12;

import com.erbis.java.cources.yana.lesson12.Animal;
import com.erbis.java.cources.yana.lesson12.bird.Bird;
import com.erbis.java.cources.yana.lesson12.fish.Fish;
import com.erbis.java.cources.yana.lesson12.fish.Shark;

public class Main {

	public static void main(String[] args) {
		testOverride();
		testConstructors();
		testPolymorph();
		testFinal();
	}

	private static void testOverride() {
		Animal animal = new Animal(3, 15) {
			@Override
			public String sound() {
				return null;
			}
		};
		// animal.move(15);
		System.out.println(animal.sound());

		Bird bird = new Bird(4, 11.3, true, 4.5, "Coo - coo");
		bird.fly(3);
		bird.move(3);
		System.out.println(bird.sound());
		// System.out.println(animal.getAge());// main and animal in different
		// packages

		System.out.println(animal);
		System.out.println(bird);

		bird.printTestField();
	}

	private static void testConstructors() {
		Bird bird_1 = new Bird(6, 1.2, false, 5.1, "Car - car");
	}

	private static void testPolymorph() {
		Animal animal0 = new Bird(5, 3.2, true, 1.3, "Oo - oo");
		System.out.println(animal0);// aminal0.toString()
		System.out.println(animal0.sound());

		Bird bird0 = (Bird) animal0;// typecast
		bird0.move(15);
		((Bird) animal0).move(15);
		
		if (animal0 instanceof Fish) {
			Fish fish0 = (Fish) animal0;          
		} else {
			System.out.println("animal is not a fish!");
		}

		// Fish fish0 = (Fish) animal0;//Fish is not Bird
		// fish0.sound();

		Animal animal1 = new Fish(4, 6.2);
		System.out.println(animal1);
		System.out.println(animal1.sound());

		// Object o1 = animal1;
		// String s1 = (String) o1;
		// String s1 = (String) ((Object)animal1);
	}

	private static void testFinal() {
		Shark shark = new Shark(4, 5, "Vanessa");
		System.out.println(shark);
		// System.out.println(shark.toString());
		int x;
		// System.out.println (woman) ;
		x = 10;
		x = 0;
	}
}