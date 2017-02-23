package com.erbis.java.cources.yana.lesson12;

import com.erbis.java.cources.yana.lesson12.bird.Bird;

public class Main {
	public static void main(String[] args) {
//		testOverride();
		testConstructors();
	}
	
	private static void testConstructors(){
		Bird bird = new Bird();
	}
	
	private static void testOverride() {
		Animal animal = new Animal(18, 23.2);
		animal.move(2);
		System.out.println(animal.sounds());

		System.out.println();

		Bird bird = new Bird();
		bird.fly(200);
		bird.move(200);

		System.out.println(animal);
		System.out.println(bird);

		bird.printTestField();
	}

}
