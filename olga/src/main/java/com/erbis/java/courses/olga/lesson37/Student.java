package com.erbis.java.courses.olga.lesson37;

import java.util.Objects;

public class Student {
	private final String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (this == o) {
			return true;
		}
		if (!this.getClass().equals(o.getClass())) {
			return false;
		}
		Student otherStudent = (Student) o;
		return Objects.equals(this.getName(), otherStudent.getName());
	}
}
