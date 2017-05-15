package com.erbis.java.cources.olga.lesson28;

public class Dog {
	private double age;
	private String name;

	public double getAge() {
		try {
			return age;
		} finally {
			System.out.println("getAge called");	
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws NameException {
		if (Character.isLowerCase(name.charAt(0))) {
			throw new NameException("Name starts with lower case"); // выполнение метода закончится на throw
		}
		this.name = name;
	}

	public void setAge(double age) throws AgeException {
		try {
		if (age <= 0) {
				throw new AgeException("Age is not positive"); // выполнение метода закончится на throw
			}
		this.age = age;
	} finally {
		System.out.println("setAge called");
	}
	}
}
