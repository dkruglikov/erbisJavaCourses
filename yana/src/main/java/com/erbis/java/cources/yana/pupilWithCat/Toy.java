package com.erbis.java.cources.yana.pupilWithCat;

public class Toy {
	private String typeOfToy;
	private String size;
	private String colour;
	
	public Toy (String typeOfToy, String size, String colour) {
		this.typeOfToy = typeOfToy;
		this.size = size;
		this.colour = colour;
	}

	public String getName() {
		return typeOfToy;
	}

	public void setName(String typeOfToy) {
		this.typeOfToy = typeOfToy;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void printInfo() {
		System.out.println("Toy Info:");
		System.out.println("Type of toy: " + typeOfToy);
		System.out.println("Size of toy: " + getSize());
		System.out.println("Colour of toy: " + colour);
	}
}
