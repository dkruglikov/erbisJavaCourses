package com.erbis.java.cources.yana.pupilWithCat;

public class Pupil {
	private Cat cat = new Cat("Myrzik", 3, "black");
	private String name;
	private int age;

	public Pupil(String name, int age) {
		this.name = name;
		this.age = age;
	}

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
