package com.erbis.java.cources.olga.lesson10.HW;

public class MainForToyCatPupil {

	public static void main(String[] args) {
		Toy t = new Toy(12, "green", "China");
		Toy t2 =new Toy(10,"red");
		
		Cat c = new Cat(7, "Vasja");
		c.setOwnToy(t);
		c.setAge(8);
		c.setBreed("Pers");
		c.setName("Mars");
		Cat c2 = new Cat(5, "Bars");
		
		Pupil p = new Pupil(11, "Olga", "Dnipro");
		p.setOwnCats(new Cat[] {c, c2});
		
		p.printInfoPupil();
	}

}