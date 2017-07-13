package com.erbis.java.cources.aleksandra.lesson36;

public class Fruit {
	private final String name;
	
	public Fruit(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {	
		if (this.getClass() == obj.getClass()) {
			return this.name.equals(((Fruit) obj).getName());
		}
		return false;
	}
}
