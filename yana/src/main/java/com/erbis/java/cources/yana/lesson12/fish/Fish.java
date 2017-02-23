package com.erbis.java.cources.yana.lesson12.fish;

import com.erbis.java.cources.yana.lesson12.Animal;

public class Fish extends Animal {
	private String sound;
	
	public Fish(int age, double weight) {
		super(age,weight);
	}
	
	@Override
	public String sound() {
		return sound;
	}
}
