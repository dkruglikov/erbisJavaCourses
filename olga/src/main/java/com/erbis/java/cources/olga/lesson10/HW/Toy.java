package com.erbis.java.cources.olga.lesson10.HW;

public class Toy {
	private int sizeSm;
	private String colour;
	private String madeIn;
	
	
	public int getSizeSm() {
		return sizeSm;
	}

	public void setSizeSm(int sizeSm) {
		this.sizeSm = sizeSm;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	
	public Toy(int sizeSm, String c, String m) {
		this.sizeSm = sizeSm;
		colour = c;
		madeIn = m;
	}

	public Toy(int s, String c) {
		sizeSm = s;
		colour = c;
	}
	
	
	public void printInfoToy() {
//		double sizeSm=1;//in maim it will be 1, not 10 and 12
		System.out.println("The cat has a toy whis size " + sizeSm + " sm, and " + colour + " colour, made in " + madeIn + ".");
	}
}