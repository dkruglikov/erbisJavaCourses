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
		// Pupil
		System.out.print("Pupil " + name + ", ");
		System.out.print(age + " years old, ");
		System.out.println("was born in " + birthPlace);

		for (int i = 0; i < ownCats.length; i++) {
			// Cat
			System.out.println(name + " has a cat " + ownCats[i].getName());
			System.out.println("It is " + ownCats[i].getAge() + " years old");
			String breed = ownCats[i].getBreed();
			if (breed != null) {
				System.out.println("And it is " + breed);
			} else {
				System.out.println("And it is not purebred");
			}

			// Toy
			Toy ownToy = ownCats[i].getOwnToy();
			if (ownToy != null) {
				System.out.println("The cat has a toy whis size " + ownToy.getSizeSm() + " sm, and " + ownToy.getColour() + "colour, made in " + ownToy.getMadeIn());
			} else {
				System.out.println("Cat has now toy");
			}
		}

	}

}
