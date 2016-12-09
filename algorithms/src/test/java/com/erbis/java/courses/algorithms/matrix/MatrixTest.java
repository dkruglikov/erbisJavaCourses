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
	
	@Test
	public void testCreate0() {
		double[] array = {5, -8.8, 10, 12};
		int width = 0;
		int height = 0;
		Assert.assertArrayEquals(new double[0][0], Matrix.create(array, width, height));
	}
	
	@Test
	public void testCreate0Width() {
		double[] array = {5, -8.8, 10, 12};
		int width = 0;
		int height = 4;
		Assert.assertArrayEquals(new double[0][4], Matrix.create(array, width, height));
	}
	
	@Test
	public void testCreate0Height() {
		double[] array = {5, -8.8, 10, 12};
		int width = 2;
		int height = 0;
		Assert.assertArrayEquals(new double[2][0], Matrix.create(array, width, height));
	}
	
	@Test
	public void testCreate1To1() {
		double[] array = {5, -8.8, 10, 12};
		int width = 1;
		int height = 1;
		Assert.assertArrayEquals(new double[][]{{5}}, Matrix.create(array, width, height));
	}
	
	@Test
	public void testCreate1HeightLess() {
		double[] array = {5, -8.8, 10, 12};
		int width = 2;
		int height = 1;
		Assert.assertArrayEquals(new double[][]{{5, -8.8}}, Matrix.create(array, width, height));
	}
	
	@Test
	public void testCreate1HeightSame() {
		double[] array = {5, -8.8, 10, 12};
		int width = 4;
		int height = 1;
		Assert.assertArrayEquals(new double[][]{{5, -8.8, 10, 12}}, Matrix.create(array, width, height));
	}
	
	@Test
	public void testCreate1HeightMore() {
		double[] array = {5, -8.8, 10, 12};
		int width = 6;
		int height = 1;
		Assert.assertArrayEquals(new double[][]{{5, -8.8, 10, 12, 0, 0}}, Matrix.create(array, width, height));
	}
	
	@Test
	public void testCreate1WidthLess() {
		double[] array = {5, -8.8, 10, 12};
		int width = 1;
		int height = 3;
		Assert.assertArrayEquals(new double[][]{{5}, {-8.8}, {10}}, Matrix.create(array, width, height));
	}
	
	@Test
	public void testCreate1WidthSame() {
		double[] array = {5, -8.8, 10, 12};
		int width = 1;
		int height = 4;
		Assert.assertArrayEquals(new double[][]{{5}, {-8.8}, {10}, {12}}, Matrix.create(array, width, height));
	}
	
	@Test
	public void testCreate1WidthMore() {
		double[] array = {5, -8.8, 10, 12};
		int width = 1;
		int height = 5;
		Assert.assertArrayEquals(new double[][]{{5}, {-8.8}, {10}, {12}, {0}}, Matrix.create(array, width, height));
	}
}
