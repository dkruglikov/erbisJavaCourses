package com.erbis.java.cources.yana.lesson12;

public class Animal {
	private int age = 5;
	private double weight = 12;
	
	public static String sounds() {
		return "";
	}
	public void move(double distance) {
		System.out.println("Moving " + distance + " meters.");
	}
	public String getInfo() {
		return "Age: " + age + "\n" + "Weight: " + weight;
		
	}
	protected int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	protected double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
