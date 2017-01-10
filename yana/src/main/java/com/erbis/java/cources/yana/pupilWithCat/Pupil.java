package com.erbis.java.cources.yana.pupilWithCat;

public class Pupil {
	private Cat cat = new Cat();
	private String name = "Vasya";
	private int age = 9;

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
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
	
	public void printInfo() {
		System.out.println("Pupil Info:");
		System.out.println("Name : " + getName());
		System.out.println("Age: " + age);
		System.out.println(" ");
		cat.printInfo();
	}

}
