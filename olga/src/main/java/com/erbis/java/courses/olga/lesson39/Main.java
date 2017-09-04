package com.erbis.java.courses.olga.lesson39;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Collection<String> set = new TreeSet<>(/*String.CASE_INSENSITIVE_ORDER*/);
		set.add("Str1");
		set.add("Str1");
		set.add("Str2");
		set.add("ZZZZZJUTFHGF");
		set.add("str223567642454asfgadfhagjssdfhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhk");
		for (String s : set) {
		System.out.println(s);
		}
	}

}
