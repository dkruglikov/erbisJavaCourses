package com.erbis.java.cources.olga.lesson10;

public class Person {
	int age;
	String name;
	String birthPlace;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	
	public void printInfo() {
		System.out.println(getAge());
		System.out.println(this.getName());
		System.out.println(birthPlace);
	}
}
