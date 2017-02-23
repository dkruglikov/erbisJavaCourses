package com.erbis.java.cources.yana.lesson12.fish;

public class Shark extends Fish {
	
	private String name;

	public Shark(int age, double weight, String name) {
		super(age, weight);
		this.name = name;
	}
	
	@Override
	public void move(double distance) {
		System.out.println("Swimming " + distance + " meters.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + name;
	}
	
}
