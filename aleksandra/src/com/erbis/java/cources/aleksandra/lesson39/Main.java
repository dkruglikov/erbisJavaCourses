package com.erbis.java.cources.aleksandra.lesson39;

import java.util.Collection;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Collection<String> set = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		set.add("ZZZZ");
		set.add("sasha");
		set.add("sasha");
		set.add("olga");
		set.add("max");
		set.add("AAAA");
		set.add("BBBBB");
		set.add("CCCC");
		System.out.println(set.size());
		for (String string : set) {
			System.out.println(string);
		}
	}
}
