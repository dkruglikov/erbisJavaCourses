package com.erbis.java.cources.olga.lesson12.bird;

import com.erbis.java.cources.olga.lesson12.Animal;

public class Bird extends Animal {
	boolean flying = true;
	double wingWidth = 0.3;
	
	public void fly(double distance){
		System.out.println("Moving " + distance + " meters.");
	}
	
	public void move(String location) {//overload
		System.out.println("Flying to" + location);
	}

	@Override
	public String getInfo() {
		return "Age:" + getAge() + "\n" + "Weight:" + getWeight() + "\n" + flying + "\n" + wingWidth;
	}
	
	
}
