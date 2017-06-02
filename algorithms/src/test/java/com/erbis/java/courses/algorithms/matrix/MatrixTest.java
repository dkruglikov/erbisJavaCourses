package com.erbis.java.courses.algorithms.matrix;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class MatrixTest {
	
	private static final double DOUBLE_ASSERT_DELTA = 1e-5;
	
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
		Assert.assertArrayEquals(new double[4][0], Matrix.create(array, width, height));
	}
	
	@Test
	public void testCreate0Height() {
		double[] array = {5, -8.8, 10, 12};
		int width = 2;
		int height = 0;
		Assert.assertArrayEquals(new double[0][2], Matrix.create(array, width, height));
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
	
	@Test
	public void testCreateSame() {
		double[] array = {5, -8.8, 10, 12, -0.25, 1.2};
		int width = 2;
		int height = 3;
		Assert.assertArrayEquals(new double[][]{{5, -8.8}, {10, 12}, {-0.25, 1.2}}, Matrix.create(array, width, height));
	}
	
	@Test
	public void testCreateMore() {
		double[] array = {5, -8.8, 10, 12, -0.25, 1.2};
		int width = 3;
		int height = 3;
		Assert.assertArrayEquals(new double[][]{{5, -8.8, 10}, {12, -0.25, 1.2}, {0, 0, 0}}, Matrix.create(array, width, height));
	}
	
	@Test
	public void testSumEmpty() {
		double[][] matrix = {{}};
		Assert.assertEquals(0, Matrix.sum(matrix), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testSumOne() {
		double[][] matrix = {{-3.3}};
		Assert.assertEquals(-3.3, Matrix.sum(matrix), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testSum() {
		double[][] matrix = {{3.3, 4.2, -3},
			{-2, -0.5, 6.1},
			{9}};
		Assert.assertEquals(17.1, Matrix.sum(matrix), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testSumAbsEmpty() {
		double[][] matrix = {{}};
		Assert.assertEquals(0, Matrix.sumAbs(matrix), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testSumAbsOne() {
		double[][] matrix = {{-3.3}};
		Assert.assertEquals(3.3, Matrix.sumAbs(matrix), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testSumAbs() {
		double[][] matrix = {{3.3, 4.2, -3},
			{-2, -0.5, 6.1},
			{-9}};
		Assert.assertEquals(28.1, Matrix.sumAbs(matrix), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testMainDiagonalSum0() {
		double[][] matrix = {{}};
		Assert.assertEquals(0, Matrix.mainDiagonalSum(matrix), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testMainDiagonalSum1() {
		double[][] matrix = {{-2.2}};
		Assert.assertEquals(-2.2, Matrix.mainDiagonalSum(matrix), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testMainDiagonalSum1Width() {
		double[][] matrix = {{-2.25}, {0}, {3.1}};
		Assert.assertEquals(-2.25, Matrix.mainDiagonalSum(matrix), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testMainDiagonalSum1Height() {
		double[][] matrix = {{-1.25, 3.1}};
		Assert.assertEquals(-1.25, Matrix.mainDiagonalSum(matrix), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testMainDiagonalSquare() {
		double[][] matrix = {{-1.25, 3.1, 0.1}, {2.1, 3, -2.1}, {-0.1, 0.9, -0.25}};
		Assert.assertEquals(1.5, Matrix.mainDiagonalSum(matrix), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testMainDiagonalWide() {
		double[][] matrix = {{-1.25, 3.1, 0.1, 12}, {2.1, 3, -2.1, 5}, {-0.1, -0.25}};
		Assert.assertEquals(1.75, Matrix.mainDiagonalSum(matrix), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testMainDiagonalTall() {
		double[][] matrix = {{-1.25, 3.1, 0.1, 12}, {2.1, 3, -2.1, 5}, {-0.1, -0.25}, {3}, {1, 2, 3, 4, 5, 6}, {-0.5, 5, 8}};
		Assert.assertEquals(6.75, Matrix.mainDiagonalSum(matrix), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testMax1() {
		double[][] matrix = {{-2.2}};
		Assert.assertEquals(-2.2, Matrix.max(matrix), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testMax1Width() {
		double[][] matrix = {{-2.25}, {0}, {3.1}};
		Assert.assertEquals(3.1, Matrix.max(matrix), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testMax1Height() {
		double[][] matrix = {{-1.25, 13.1}};
		Assert.assertEquals(13.1, Matrix.max(matrix), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testMaxSquare() {
		double[][] matrix = {{-1.25, 3.1, 0.1}, {2.1, 3, -2.1}, {-0.1, 0.9, -0.25}};
		Assert.assertEquals(3.1, Matrix.max(matrix), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testMaxWide() {
		double[][] matrix = {{-1.25, 3.1, 0.1, 12}, {2.1, 3.4, -2.1, 5}, {-0.1, -0.25}};
		Assert.assertEquals(12, Matrix.max(matrix), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testMaxTall() {
		double[][] matrix = {{-1.25, 3.1, 0.1, 12}, {2.1, 3, -2.1, 5}, {-0.1, -0.25}, {3}, {1, 2, 3, 4, 5, 6}, {-0.5, 5, 8}};
		Assert.assertEquals(12, Matrix.max(matrix), DOUBLE_ASSERT_DELTA);
	}
}
