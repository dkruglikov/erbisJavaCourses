package com.erbis.java.cources.yana.pupilWithCat;

public class Main {
	public static void main (String[] args) {
		Pupil p = new Pupil("Vasya", 13);
		Pupil p1 = new Pupil("Kolya", 20);
		Pupil p2 = new Pupil("Petya", 16);
		Cat p1Cat = new Cat("Bucks", 1, "Grey");
		Cat p2Cat = new Cat("Pushok", 2, "Wite");
		Toy p2Toy = new Toy("Ball", "Small", "Red");
		p1.setCat(p1Cat);
		p2.setCat(p2Cat);
		p2Cat.setToy(p2Toy);
		p.printInfo();
		p1.printInfo();
		p2.printInfo();
	}
}
