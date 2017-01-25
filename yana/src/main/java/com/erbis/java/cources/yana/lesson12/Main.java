package com.erbis.java.cources.yana.lesson12;

import com.erbis.java.cources.yana.lesson12.bird.Bird;

public class Main {
	public static void main (String[] args) {
		Animal animal = new Animal();
		animal.move(2);
		System.out.println(animal.sounds());
		System.out.println(animal.getInfo() + "\n");
		
		Bird bird = new Bird();
		bird.fly(200);
		System.out.println(bird.getInfo());
		
	}

}
