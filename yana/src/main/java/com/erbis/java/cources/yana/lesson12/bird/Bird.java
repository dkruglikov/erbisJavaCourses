package com.erbis.java.cources.yana.lesson12.bird;

import com.erbis.java.cources.yana.lesson12.Animal;

public class Bird extends Animal {
	private boolean flying = true;
	private double wingsWidth = 12.5;
	protected String testField  = "Bird";
	
	public Bird(){
		System.out.println("Bird :: new");
	}
	
	public void printTestField(){ // this.testField
		System.out.println(testField);
		System.out.println(super.testField);
	}
	
	public void fly (double distance) {
		System.out.println("Flying " + distance + " meters.");
	}
	
	@Override
	public void move(double distance) {
		System.out.println("Flying to " + distance);
	}

	public void move(String location) {
		System.out.println("Flying to " + location);
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Flying: " + flying + "\n" + "Wings weight: " + wingsWidth;
	}
	

}