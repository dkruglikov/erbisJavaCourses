package com.erbis.java.cources.yana.lesson12.bird;

import com.erbis.java.cources.yana.lesson12.Animal;

public class Bird extends Animal {
	private boolean flying = true;
	private double wingsWidth = 12.5;
	protected String testField  = "Bird";
	private boolean isFlying;
	private String sound;
	
//	public Bird() {
//		System.out.println("Bird :: new");
//		super (15, 9.9);
//	}
	
	public Bird(int age, double weight, boolean isFlying, double wingsWidth, String sound) {
		super(age, weight);
		this.isFlying = isFlying;
		this.wingsWidth = wingsWidth;
		this.sound = sound;
	}
	
	public void printTestField() { // this.testField
		System.out.println(testField);
		System.out.println(super.testField);
	}
	
	public void fly(double distance) {
		System.out.println("Flying " + distance + " meters.");
	}
	
	@Override
	public void move(double distance) {
		fly(distance);
	}

	public void move(String location) {
		System.out.println("Flying to " + location);
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Flying: " + flying + "\n" + "Wings weight: " + wingsWidth;
	}
	
	@Override
	public String sound() {
		return sound;
	}
}