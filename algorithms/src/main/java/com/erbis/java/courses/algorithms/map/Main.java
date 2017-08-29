package com.erbis.java.courses.algorithms.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.text.RandomStringGenerator;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

public final class Main {
	private static final int COUNT = 10000;
	private static final int LENGTH = 100;
	
	private Main() { }

	public static void main(String[] args) {
		Map<String, String> sortedmap = new TreeMap<>();
		Map<String, String> hashmap = new HashMap<>();

		timeAnalysis(sortedmap);
		timeAnalysis(hashmap);	
	}

	@SuppressFBWarnings("RV_RETURN_VALUE_IGNORED_NO_SIDE_EFFECT")
	private static void timeAnalysis(Map<String, String> map) {
		String randomLetters = "empty";
		RandomStringGenerator generator = new RandomStringGenerator.Builder().build();
		System.out.println("PUT/GET FROM " + map.getClass());
		Long timeBefore = System.currentTimeMillis();
		map.put(randomLetters, randomLetters);
		for (int i = 0; i < COUNT; i++) {
			randomLetters = generator.generate(LENGTH);
			map.put(randomLetters, randomLetters);
		}
		Long timeAfter = System.currentTimeMillis();
		System.out.println("Time for put " + COUNT + " elements: " + (timeAfter - timeBefore) + "ms");
		timeBefore = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			map.get(randomLetters);
		}
		timeAfter = System.currentTimeMillis();
		System.out.println("Time for get "  + COUNT + " elements: " + (timeAfter - timeBefore) + "ms");		
		System.out.println();		
	}
}