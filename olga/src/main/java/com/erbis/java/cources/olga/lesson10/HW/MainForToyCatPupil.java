package com.erbis.java.cources.olga.lesson10.HW;

public final class MainForToyCatPupil {
	private static final int PUPIL_AGE = 11;
	private static final int CAT2_AGE = 5;
	private static final int CAT_AGE2 = 8;
	private static final int CAT_AGE = 7;
	private static final int SIZE_T2 = 10;
	private static final int SIZE_T = 12;
	private MainForToyCatPupil() {
	}
	public static void main(String[] args) {
		Toy t = new Toy(SIZE_T, "green", "China");
//		Toy t2 = new Toy(SIZE_T2, "red");
		
		Cat c = new Cat(CAT_AGE, "Vasja");
		c.setOwnToy(t);
		c.setAge(CAT_AGE2);
		c.setBreed("Pers");
		c.setName("Mars");
		Cat c2 = new Cat(CAT2_AGE, "Bars");
		
		Pupil p = new Pupil(PUPIL_AGE, "Olga", "Dnipro");
		p.setOwnCats(new Cat[] {c, c2});
		
		p.printInfoPupil();
	}

}