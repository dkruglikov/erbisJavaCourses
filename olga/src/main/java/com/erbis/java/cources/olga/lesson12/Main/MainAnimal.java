package com.erbis.java.cources.olga.lesson12.Main;

import com.erbis.java.cources.olga.lesson12.Animal;
import com.erbis.java.cources.olga.lesson12.bird.Bird;
import com.erbis.java.cources.olga.lesson12.fish.Fish;
import com.erbis.java.cources.olga.lesson12.fish.Shark;

public final class MainAnimal {
	private static final double WING_WIDTH_BIRD2 = 1.3;
	private static final double WEIGHT_BIRD2 = 3.2;
	private static final int AGE_BIRD2 = 5;
	private static final int DISTANCE4 = 3;
	private static final int DISTANCE3 = 3;
	private static final double WING_WIDTH_BIRD1 = 5.1;
	private static final double WEIGHT_BIRD1 = 1.2;
	private static final int AGE_BIRD1 = 6;
	private static final double WING_WIDTH_BIRD = 4.5;
	private static final double WEIGHT_BIRD = 11.3;
	private static final int AGE_BIRD = 4;
	private static final int DISTANCE2 = 15;
	private static final int DISTANCE1 = 15;
	private static final double WEIGHT_FISH = 6.2;
	private static final int AGE_FISH = 4;
	private static final int AGE_SHARK = 4;
	private static final int WEIGHT_SHARK = 5;
	private static final int ANIMAL_WEIGHT = 15;
	private static final int ANIMAL_AGE = 3;

	private MainAnimal() {
	}

	public static void main(String[] args) {
//		testOverride();
//		testConstructors();
//		testPolymorph();
		testFinal();
	}

	private static void testOverride() {
		Animal animal = new Animal(ANIMAL_AGE, ANIMAL_WEIGHT) {

			@Override
			public String sound() {
				return null;
			}
		};
//		animal.move(15);
		System.out.println(animal.sound());
		
		Bird bird = new Bird(AGE_BIRD, WEIGHT_BIRD, true, WING_WIDTH_BIRD);
		bird.fly(DISTANCE3);
		bird.move(DISTANCE4);
		System.out.println(bird.sound());
        //System.out.println(animal.getAge());//main and animal in different packages
		
		System.out.println(animal);
		System.out.println(bird);
		
		bird.printTestField();
	}

	private static void testConstructors() {
		Bird bird1 = new Bird(AGE_BIRD1, WEIGHT_BIRD1, false, WING_WIDTH_BIRD1);
	}
	
	private static void testPolymorph() {
		Animal animal0 = new Bird(AGE_BIRD2, WEIGHT_BIRD2, true, WING_WIDTH_BIRD2);
		System.out.println(animal0); //aminal0.toString()
		System.out.println(animal0.sound());
		
		Bird bird0 = (Bird) animal0;
		bird0.move(DISTANCE2);
		((Bird) animal0).move(DISTANCE1);
		
		if (animal0 instanceof Fish) {
			Fish fish0 = (Fish) animal0;
		} else {
			System.out.println("animal is not a fish!");
		}
		
//		Fish fish0 = (Fish) animal0;//Fish is not Bird
//		fish0.sound();
		
		Animal animal1 = new Fish(AGE_FISH, WEIGHT_FISH);
		System.out.println(animal1);
		System.out.println(animal1.sound());
		
//		Object o1 = animal1;
//		String s1 = (String) o1;
//		String s1 = (String) ((Object)animal1); 
	}
	
	private static void testFinal() {
		Shark shark = new Shark(AGE_SHARK, WEIGHT_SHARK, "Vanessa");
		System.out.println(shark); //println visivaet u objekta toString
//		System.out.println(shark.toString());//takaja ge strochka
//		int x;
////		System.out.println(x);
//		x = 10;
//		x = 0;
	}
}
