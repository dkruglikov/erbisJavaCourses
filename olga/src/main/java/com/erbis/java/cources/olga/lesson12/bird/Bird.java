package com.erbis.java.cources.olga.lesson12.bird;

import com.erbis.java.cources.olga.lesson12.Animal;

public class Bird extends Animal {
	boolean flying = true;
	double wingWidth = 0.3;
	protected String testField="bird";
	
//	public Bird() {
//		super(15, 9.9);// vizov construktora roditelskogo klassa s parametrami
//		System.out.println("Bird::new");
//	}
	
	public Bird(int age, double weight, boolean flying, double wingWidth) {
		super(age, weight);
		this.flying = flying;
		this.wingWidth = wingWidth;
	}

	public void fly(double distance){
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


	public void move(String location) {//overload
		System.out.println("Flying to" + location);
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + flying + "\n" + wingWidth;
	}
	
	public void printTestField(){
		System.out.println(testField);//this.testField
		System.out.println(super.testField);
	}
}
