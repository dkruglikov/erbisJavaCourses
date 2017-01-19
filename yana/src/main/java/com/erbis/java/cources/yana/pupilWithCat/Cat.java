package com.erbis.java.cources.yana.pupilWithCat;

public class Cat {
	private Toy toy = new Toy("Ball", "small", "yellow");
	private String name;
	private int age;
	private String colour;
	
	public Cat(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;
	}

	public Toy getToy() {
		return toy;
	}

	public void setToy(Toy toy) {
		this.toy = toy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void printInfo() {
		System.out.println("Cat Info:");
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Colour: " + colour);
		System.out.println(" ");
		toy.printInfo();
	}

}
