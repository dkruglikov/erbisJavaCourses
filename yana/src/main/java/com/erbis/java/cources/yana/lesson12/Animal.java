package com.erbis.java.cources.yana.lesson12;

public class Animal {
	private int age;
	private double weight;
	protected String testField = "Animal";
	
	public Animal (){
		System.out.println("Animal :: new");
	}
	
	public Animal (int age, double weight){
		this.age = age;
		this.weight = weight;
	}
	
	public static String sounds() {
		return "";
	}
	protected void move(double distance) {
		System.out.println("Moving " + distance + " meters.");
	}
	public String toString() {
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
