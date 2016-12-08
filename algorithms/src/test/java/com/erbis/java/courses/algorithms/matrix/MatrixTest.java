package com.erbis.java.courses.algorithms.matrix;

import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {
	
	@Test(expected = NegativeArraySizeException.class)
	public void testCreateNegativeWidth() {
		double[] array = {0, 9, -5.5, -5};
		int width = -1;
		int height = 1;
		Matrix.create(array, width, height);
	}
	
	@Test(expected = NegativeArraySizeException.class)
	public void testCreateNegativeHeight() {
		double[] array = {};
		int width = 2;
		int height = -2;
		Matrix.create(array, width, height);
	}
	
	@Test(expected = NegativeArraySizeException.class)
	public void testCreate0() {
		double[] array = {5, -8.8, 10, 12};
		int width = 0;
		int height = 0;
		Assert.assertArrayEquals(new double[0][0], Matrix.create(array, width, height));
	}
	
	@Test(expected = NegativeArraySizeException.class)
	public void testCreate0Width() {
		double[] array = {5, -8.8, 10, 12};
		int width = 0;
		int height = 0;
		Assert.assertArrayEquals(new double[0][0], Matrix.create(array, width, height));
	}
}
