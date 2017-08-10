package com.erbis.java.cources.aleksandra.lesson37;

public class Student {
	final String name;
	
	public Student(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (getClass().equals(obj.getClass())){
			return name.equals(((Student) obj).getName());
		}
		return false;
	}		
}
