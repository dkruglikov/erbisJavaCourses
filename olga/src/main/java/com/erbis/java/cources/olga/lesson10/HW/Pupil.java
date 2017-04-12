package com.erbis.java.cources.olga.lesson10.HW;

public class Pupil {
	private int age;
	private String name;
	private String birthPlace;
	private Cat[] ownCats;

	public Pupil(int age, String name, String birthPlace) {
		this.age = age;
		this.name = name;
		this.birthPlace = birthPlace;
	}

	public void setOwnCats(Cat[] ownCats) {
		this.ownCats = ownCats;
	}

	public void printInfoPupil() {
	System.out.println("Pupil " + name + ", " + age + " years old, " + "was born in " + birthPlace + ". ");
		for (int i = 0; i < ownCats.length; i++) {
			System.out.print(name + " has a cat ");
			ownCats[i].printInfoCat();
		}
	}

}
