package com.erbis.java.cources.aleksandra.lesson38;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		  SortedMap<String, String> sortedmap = new TreeMap<>();
		  if (sortedmap.isEmpty()) {
		   System.out.println("Map is empty");
		  } else
		   System.out.println(sortedmap.firstKey());

		  sortedmap.put("keyS1", "valueS1");
		  sortedmap.put("keyS2", "valueS2");
		  sortedmap.put("keyS3", "valueS2");
		  sortedmap.put("33", "valueS3");
		  SortedMap<String, String> headMap = sortedmap.headMap("keyS2");// не выделился новый участок памяти
		  System.out.println(headMap.size());
		  headMap.clear();
		  System.out.println(sortedmap.size());// 2
		  Set<Map.Entry<String, String>> set = new HashSet<>();
		  set = sortedmap.entrySet();
		  for (Map.Entry<String, String> sortedMap2 : set) {
			System.out.println("Key: " + sortedMap2.getKey()+ ", value: " + sortedMap2.getValue());
		}
	}

}
