package com.erbis.java.cources.olga.lesson12;

public abstract class Animal {
	private int age;
	private double weight;
	protected String testField="animal";
	
	
	public Animal(int age, double weight) {
		this();
		this.age = age;
		this.weight = weight;
		System.out.println("Animal::new(int, double)");
	}

	private Animal() {
		System.out.println("Animal::new");
	}
	
	public abstract String sound();
	
	protected void move(double distance){
		System.out.println("Moving " + distance + " meters.");
	}

	@Override
	public String toString(){
		return "Age:" + age + "\n" + "Weight:" + weight;
	}

	protected int getAge() {
		return age;
	}

	protected double getWeight() {
		return weight;
	}
}
