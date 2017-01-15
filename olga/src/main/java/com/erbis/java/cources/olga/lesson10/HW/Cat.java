package com.erbis.java.cources.olga.lesson10.HW;

public class Cat {

	private int age;
	private String name;
	private String breed;
	private Toy ownToy;

	public Cat(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

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

	public void printInfoCat() {
		System.out.print(name + ". It is " + age + " years old. ");
		if (breed != null) {
			System.out.println("And it is " + breed + ".");
		} else {
			System.out.println("And it is not purebred.");
		}
		if (ownToy != null) {
			ownToy.printInfoToy();
		} else {
			System.out.println("Cat has no toy.");
		}

	}
}
