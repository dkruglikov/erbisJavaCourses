package com.erbis.java.courses.algorithms.sort;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class SorterTest {
	
	private static final String RESOURCE_NAME = "/testClass.properties";
	private static final String PROP_NAME_CLASS  = "class";
	private static final int RND_ARRAY_SIZE = 50;
	private static final int RND_ARRAY_VALUE_MIN = -32;
	private static final int RND_ARRAY_VALUE_MAX = 32;
	private static final int[] EMPTY_ARRAY = {};
	private static Sorter sorter;
	
	@BeforeClass
	public static void setUp() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Properties properties = new Properties();
		try (InputStream propertiesStream = SorterTest.class.getResourceAsStream(RESOURCE_NAME)) {
			properties.load(propertiesStream);
		}
		String className = properties.getProperty(PROP_NAME_CLASS);
		sorter = (Sorter) Class.forName(className).newInstance();
	}
	
	@Test
	public void testEmptyArray() {
		int[] array = EMPTY_ARRAY;
		sorter.sort(array);
		Assert.assertTrue(isSorted(array));
	}
	
	@Test
	public void testOneElementArray() {
		int[] array = new Random().ints(1, RND_ARRAY_VALUE_MIN, RND_ARRAY_VALUE_MAX).toArray();;
		sorter.sort(array);
		Assert.assertTrue(isSorted(array));
	}
	
	public void testTwoElementsArray() {
		int[] array = new Random().ints(2, RND_ARRAY_VALUE_MIN, RND_ARRAY_VALUE_MAX).toArray();;
		sorter.sort(array);
		Assert.assertTrue(isSorted(array));
	}
	
	@Test
	public void testRandomArray() {
		int[] array = new Random().ints(RND_ARRAY_SIZE, RND_ARRAY_VALUE_MIN, RND_ARRAY_VALUE_MAX).toArray();
		sorter.sort(array);
		Assert.assertTrue(isSorted(array));
	}
	
	private boolean isSorted(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
