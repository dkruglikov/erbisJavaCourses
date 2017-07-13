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
		if (obj == null) {
			return false;
		}
		if (this.getClass() == obj.getClass()) {
			String objName = ((Fruit) obj).getName();
			if (name == null && objName == null) {
				return true;
			}
			if (name == null || objName == null) {
				return false; 
			}
			return this.name.equals(objName);
		}
		return false; 
	}
}
