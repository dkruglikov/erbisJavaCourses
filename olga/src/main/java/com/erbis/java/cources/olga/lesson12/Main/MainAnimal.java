package com.erbis.java.cources.olga.lesson12.Main;

import com.erbis.java.cources.olga.lesson12.Animal;
import com.erbis.java.cources.olga.lesson12.bird.Bird;

public class MainAnimal {

	public static void main(String[] args) {
//		testOverride();
		testConstructors();
	}

	private static void testOverride() {
		Animal animal = new Animal(3,15) {

			@Override
			public String sound() {
				return null;
			}} ;
		animal.move(15);
		System.out.println(animal.sound());
		
		Bird bird = new Bird(4,11.3,true,4.5);
		bird.fly(3);
		bird.move(3);
		System.out.println(bird.sound());
        //System.out.println(animal.getAge());//main and animal in different packages
		
		System.out.println(animal);
		System.out.println(bird);
		
		bird.printTestField();
	}

	private static void testConstructors(){
		Bird bird_1 = new Bird(6,1.2,false,5.1);
	}
}
