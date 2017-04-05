package com.erbis.java.cources.olga.lesson12.fish;

public class Shark extends Fish {
	
	private final String name;
	
	public String getName() {
		return name;
	}

	
	public Shark (int age, double weight, String name){
		super(age, weight);
		this.name = name;
	}
	
	@Override
	protected void move(double distance){
		System.out.println("I'am shark");
	}
	
	@Override
	public String toString(){
		return "Name:" + name + "\n" + super.toString() ;
	}
}

