package com.erbis.java.cources.olga.lesson12;

public class Animal {
	private int age = 5;
	private double weight = 10;
	
	public String sound(){
		return "";
	}
	
	public void move(double distance){
		System.out.println("Moving " + distance + " meters.");
	}

	public String getInfo(){
		return "Age:" + age + "\n" + "Weight:" + weight;
	}

	protected int getAge() {
		return age;
	}

	protected double getWeight() {
		return weight;
	}
	
}
