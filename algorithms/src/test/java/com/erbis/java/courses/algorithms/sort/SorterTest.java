package com.erbis.java.courses.algorithms.sort;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;
import java.util.Random;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SorterTest {
	
	private static final String RESOURCE_NAME = "/testClass.properties";
	private static final String PROP_NAME_CLASS  = "class";
	private static final int RND_ARRAY_SIZE = 50000;
	private static InsertionSorter sorter;
	
	@BeforeClass
	public static void setUp() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Properties properties = new Properties();
		try (InputStream propertiesStream = SorterTest.class.getResourceAsStream(RESOURCE_NAME)) {
			properties.load(propertiesStream);
		}
		String className = properties.getProperty(PROP_NAME_CLASS);
		sorter = (InsertionSorter) Class.forName(className).newInstance();
	}
	
	@Test
	public void testRandomArray() {
		Random random = new Random();
		int[] array = random.ints(RND_ARRAY_SIZE).toArray();
		System.out.println(Arrays.toString(array));
		SortStat sortstat = sorter.sort(array);
		System.out.println(Arrays.toString(array));
		Assert.assertTrue(isSorted(array));
		System.out.println(sortstat.toString());
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
