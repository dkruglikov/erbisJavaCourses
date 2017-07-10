package com.erbis.java.cources.aleksandra.lesson35;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getAge() - s2.getAge();
	}
}
