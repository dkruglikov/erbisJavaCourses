package com.erbis.java.cources.olga.lesson12.bird;

import com.erbis.java.cources.olga.lesson12.Animal;

public class Bird extends Animal {
	private static final double DEFAULT_WING_WIDTH = 0.3;
	private boolean flying = true;
	private double wingWidth = DEFAULT_WING_WIDTH;
	private String testField = "bird";
	
//	public Bird() {
//		super(15, 9.9);// vizov construktora roditelskogo klassa s parametrami
//		System.out.println("Bird::new");
//	}
	
	public Bird(int age, double weight, boolean flying, double wingWidth) {
		super(age, weight);
		this.setFlying(flying);
		this.setWingWidth(wingWidth);
	}

	public void fly(double distance) {
		System.out.println("Moving " + distance + " meters.");
	}

		
	@Override
	public String sound() {
		return "Hello!";
	}

	@Override
	public void move(double distance) {
		System.out.println("Flying " + distance + " meters.");
		}


	public void move(String location) { //overload
		System.out.println("Flying to" + location);
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + isFlying() + "\n" + getWingWidth();
	}
	
	public void printTestField() {
		System.out.println(getTestField()); //this.testField
		System.out.println(super.getTestField());
	}

	public boolean isFlying() {
		return flying;
	}

	public void setFlying(boolean flying) {
		this.flying = flying;
	}

	public double getWingWidth() {
		return wingWidth;
	}

	public void setWingWidth(double wingWidth) {
		this.wingWidth = wingWidth;
	}

	public String getTestField() {
		return testField;
	}

	public void setTestField(String testField) {
		this.testField = testField;
	}
}
