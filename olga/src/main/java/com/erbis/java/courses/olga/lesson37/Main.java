package com.erbis.java.courses.olga.lesson37;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		System.out.println(map.get("key1"));
		System.out.println(map.get("key2"));
		System.out.println(map.get("key3"));
		map.put(null, "value4");
		System.out.println(map.get(null));
		System.out.println(map.put("key2", "value5"));// value2
		System.out.println(map.get("key2"));

		Map<Student, String> map2 = new HashMap<>();
		map2.put(new Student("Ivan"), "Student1");
		map2.put(new Student("Olga"), "Student2");
		System.out.println(map2.get(new Student("Ivan")));
		System.out.println(map2.get(new Student("Olga")));

		// lesson38
		SortedMap<String, String> sortedmap = new TreeMap<>();
		if (sortedmap.isEmpty()) {
			System.out.println("Map is empty");
		} else
			System.out.println(sortedmap.firstKey());

		sortedmap.put("keyS1", "valueS1");
		sortedmap.put("keyS2", "valueS2");
		sortedmap.put("keyS3", "valueS2");
		SortedMap<String, String> headMap = sortedmap.headMap("keyS2");// не выделился новый участок памяти
		System.out.println(headMap.size());
		headMap.clear();
		System.out.println(sortedmap.size());// 2

	}

}
