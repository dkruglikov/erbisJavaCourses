package com.erbis.java.cources.olga.lesson10.HW;

public class Cat {
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public Toy getOwnToy() {
		return ownToy;
	}


	public void setOwnToy(Toy ownToy) {
		this.ownToy = ownToy;
	}


	private int age;
	private String name;
	private String breed;
	private Toy ownToy;
	
	public Cat(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	
	public void printInfoCat() {
		//Toy
		System.out.println(ownToy.getSizeSm());
		System.out.println(ownToy.getColour());
		System.out.println(ownToy.getMadeIn());
		//Cat
		System.out.println(age);
		System.out.println(name);
		System.out.println(breed);
	}
}
