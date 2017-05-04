package com.erbis.java.cources.aleksandra.lesson28;

public class Dog {
	private String name;
	private double age;
	
	public double getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws NameException {
		this.name = name;
		char firstCharacter = name.charAt(0);
		if (Character.isLowerCase(firstCharacter)) {
			throw new NameException("Name from lower case");
		}
	}

	public void setAge(double age) throws AgeException {
		this.age = age;
		if (age<=0){
		throw new AgeException("Age not positive");	
		//throw new IllegalArgumentException("Age not positive");
		}
	}
}
