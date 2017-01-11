package com.erbis.java.cources.olga.lesson10.HW;

public class Toy {
	private int sizeSm;
	private String colour;
	private String madeIn;
	
	public int getSizeSm() {
		return sizeSm;
	}

	public String getColour() {
		return colour;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public Toy(int sizeSm, String c, String m) {
		this.sizeSm = sizeSm;
		colour = c;
		madeIn = m;
//		System.out.println("There is a Toy with size "+s+" sm, "+c+" colour, made in "+m);
	}

	public Toy(int s, String c) {
		sizeSm = s;
		colour = c;
	}

	public void printInfoToy() {
		//Toy
		double sizeSm=1;//in maim it will be 1, not 10 and 12
		System.out.println(sizeSm);
		System.out.println(colour);
		System.out.println(madeIn);
	}
}