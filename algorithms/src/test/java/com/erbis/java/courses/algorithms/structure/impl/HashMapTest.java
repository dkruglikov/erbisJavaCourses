package com.erbis.java.courses.algorithms.structure.impl;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class HashMapTest {

	private static final int NUMBER_OF_ELEMENTS = 2<<12;
	
	@Test
	public void testGet() {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("test_key", "test_ value");
		assertEquals("test_ value", hm.get("test_key"));
	}

	@Test 
	@Ignore
	public void testGetMany() {
		HashMap<String, String> hm = new HashMap<>();
		for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
			hm.put("test_key" + i, "test_ value" + i);
		}
		for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
		assertEquals("test_ value" + i, hm.get("test_key" + i));
		}
	}

	@Test
	@Ignore
	public void testPutBySameKey() {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("test_key", "test_ value");
		hm.put("test_key", "test_ value2");
		assertEquals("test_ value2", hm.get("test_key"));
	}

}
