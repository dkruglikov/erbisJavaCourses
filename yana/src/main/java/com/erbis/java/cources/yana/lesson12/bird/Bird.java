package com.erbis.java.cources.yana.lesson12.bird;

import com.erbis.java.cources.yana.lesson12.Animal;

public class Bird extends Animal {
	private boolean flying = true;
	private double wingsWidth = 12.5;
	
	public void fly (double distance) {
		System.out.println("Flying " + distance + " meters.");
	}
	
	public void move(String location) {
		System.out.println("Flying to " + location);
	}

	@Override
	public String getInfo() {
		return "\n" + "Age: " + getAge() + "\n" + "Weight: " + wingsWidth + "\n" + "Flying: " + flying + "\n" + "Wings weight: " + wingsWidth;
	}
	

}