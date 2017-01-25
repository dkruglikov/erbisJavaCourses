package com.erbis.java.cources.olga.lesson12.Main;

import com.erbis.java.cources.olga.lesson12.Animal;
import com.erbis.java.cources.olga.lesson12.bird.Bird;

public class MainAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.move(15);
		System.out.println(animal.sound());
		System.out.println(animal.getInfo());
		
		Bird bird = new Bird();
		bird.fly(3);
		System.out.println(bird.sound());
		System.out.println(bird.getInfo());
        //System.out.println(animal.getAge());//main and animal in different packages
	}

}
