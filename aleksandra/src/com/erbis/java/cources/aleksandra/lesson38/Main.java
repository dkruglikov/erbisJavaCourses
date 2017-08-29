package com.erbis.java.cources.aleksandra.lesson38;

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
		  SortedMap<String, String> headMap = sortedmap.headMap("keyS2");// не выделился новый участок памяти
		  System.out.println(headMap.size());
		  headMap.clear();
		  System.out.println(sortedmap.size());// 2
	}

}
