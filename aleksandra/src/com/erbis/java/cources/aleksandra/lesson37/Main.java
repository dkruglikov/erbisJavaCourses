package com.erbis.java.cources.aleksandra.lesson37;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("n1", "asa");
		map.put("n2", "asa2");
		map.put("n3", null);
		System.out.println(map.get("n1"));
		System.out.println(map.get("n3"));
		System.out.println(map.get("n4"));
		
		Map<Student, String> map1 = new HashMap<>();
		map1.put(new Student("Sasha"), "Kolesnikova");
		System.out.println(map1.get(new Student("Sasha")));
	}
}
