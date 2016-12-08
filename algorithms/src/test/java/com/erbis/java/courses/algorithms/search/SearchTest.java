package com.erbis.java.courses.algorithms.search;

import org.junit.Assert;
import org.junit.Test;

public class SearchTest {
	
	private static final double DOUBLE_ASSERT_DELTA = 1e-8;
	@Test
	public void testSearchBytesOnlyOk() {
		byte[] testArray = {Byte.MAX_VALUE};
		Assert.assertEquals(0, Search.search(testArray, Byte.MAX_VALUE));
	}
	
	@Test
	public void testSearchBytesOnlyNotFound() {
		byte[] testArray = {Byte.MIN_VALUE};
		Assert.assertEquals(Search.RESULT_ELEMENT_NOT_FOUND, Search.search(testArray, (byte) 0));
	}
	
	@Test
	public void testSearchBytesTwoOkFirst() {
		byte[] testArray = {Byte.MIN_VALUE, Byte.MAX_VALUE};
		Assert.assertEquals(0, Search.search(testArray, Byte.MIN_VALUE));
	}
	
	@Test
	public void testSearchBytesTwoOkLast() {
		byte[] testArray = {Byte.MAX_VALUE, Byte.MIN_VALUE};
		Assert.assertEquals(1, Search.search(testArray, Byte.MIN_VALUE));
	}
	
	@Test
	public void testSearchBytesTwoOkBoth() {
		byte[] testArray = {Byte.MAX_VALUE, Byte.MAX_VALUE};
		Assert.assertEquals(0, Search.search(testArray, Byte.MAX_VALUE));
	}
	
	@Test
	public void testSearchBytesTwoNotFound() {
		byte[] testArray = {Byte.MAX_VALUE, Byte.MIN_VALUE};
		Assert.assertEquals(Search.RESULT_ELEMENT_NOT_FOUND, Search.search(testArray, (byte) 0));
	}
	
	@Test
	public void testSearchBytesThreeOkFirst() {
		byte[] testArray = {0, Byte.MAX_VALUE, Byte.MIN_VALUE};
		Assert.assertEquals(0, Search.search(testArray, (byte) 0));
	}
	
	@Test
	public void testSearchBytesThreeOkMiddle() {
		byte[] testArray = {Byte.MIN_VALUE, Byte.MAX_VALUE, 0};
		Assert.assertEquals(1, Search.search(testArray, Byte.MAX_VALUE));
	}
	
	@Test
	public void testSearchBytesThreeOkLast() {
		byte[] testArray = {Byte.MAX_VALUE, 0, Byte.MIN_VALUE};
		Assert.assertEquals(2, Search.search(testArray, Byte.MIN_VALUE));
	}
	
	@Test
	public void testSearchBytesThreeOkAll() {
		byte[] testArray = {0, 0, 0};
		Assert.assertEquals(0, Search.search(testArray, (byte) 0));
	}
	
	@Test
	public void testSearchBytesThreeNotFound() {
		byte[] testArray = {0, Byte.MIN_VALUE, 0};
		Assert.assertEquals(Search.RESULT_ELEMENT_NOT_FOUND, Search.search(testArray, (byte) 17));
	}
	
	@Test
	public void testSearchBytesSeveralOkFirst() {
		byte[] testArray = {Byte.MIN_VALUE, 0, 10, Byte.MAX_VALUE};
		Assert.assertEquals(0, Search.search(testArray, Byte.MIN_VALUE));
	}
	
	@Test
	public void testSearchBytesSeveralOkMiddle() {
		byte[] testArray = {12, 0, Byte.MAX_VALUE, Byte.MIN_VALUE};
		Assert.assertEquals(2, Search.search(testArray, Byte.MAX_VALUE));
	}
	
	@Test
	public void testSearchBytesSeveralOkLast() {
		byte[] testArray = {Byte.MAX_VALUE, Byte.MAX_VALUE, Byte.MIN_VALUE, 0};
		Assert.assertEquals(3, Search.search(testArray, (byte) 0));
	}
	
	@Test
	public void testSearchBytesSeveralNotFound() {
		byte[] testArray = {Byte.MAX_VALUE, 32, 100, 0};
		Assert.assertEquals(Search.RESULT_ELEMENT_NOT_FOUND, Search.search(testArray, Byte.MIN_VALUE));
	}
	
	@Test
	public void testSearchShortsOnlyOk() {
		short[] testArray = {Short.MAX_VALUE};
		Assert.assertEquals(0, Search.search(testArray, Short.MAX_VALUE));
	}
	
	@Test
	public void testSearchShortsOnlyNotFound() {
		short[] testArray = {Short.MIN_VALUE};
		Assert.assertEquals(Search.RESULT_ELEMENT_NOT_FOUND, Search.search(testArray, (short) 0));
	}
	
	@Test
	public void testSearchShortsTwoOkFirst() {
		short[] testArray = {Short.MIN_VALUE, Short.MAX_VALUE};
		Assert.assertEquals(0, Search.search(testArray, Short.MIN_VALUE));
	}
	
	@Test
	public void testSearchShortsTwoOkLast() {
		short[] testArray = {127, Short.MIN_VALUE};
		Assert.assertEquals(1, Search.search(testArray, Short.MIN_VALUE));
	}
	
	@Test
	public void testSearchShortsTwoOkBoth() {
		short[] testArray = {Short.MAX_VALUE, Short.MAX_VALUE};
		Assert.assertEquals(0, Search.search(testArray, Short.MAX_VALUE));
	}
	
	@Test
	public void testSearchShortsTwoNotFound() {
		short[] testArray = {Short.MAX_VALUE, Short.MIN_VALUE};
		Assert.assertEquals(Search.RESULT_ELEMENT_NOT_FOUND, Search.search(testArray, (short) 0));
	}
	
	@Test
	public void testSearchShortsThreeOkFirst() {
		short[] testArray = {0, Short.MAX_VALUE, Short.MIN_VALUE};
		Assert.assertEquals(0, Search.search(testArray, (short) 0));
	}
	
	@Test
	public void testSearchShortsThreeOkMiddle() {
		short[] testArray = {Short.MIN_VALUE, Short.MAX_VALUE, 0};
		Assert.assertEquals(1, Search.search(testArray, Short.MAX_VALUE));
	}
	
	@Test
	public void testSearchShortsThreeOkLast() {
		short[] testArray = {Short.MAX_VALUE, 0, Short.MIN_VALUE};
		Assert.assertEquals(2, Search.search(testArray, Short.MIN_VALUE));
	}
	
	@Test
	public void testSearchShortsThreeOkAll() {
		short[] testArray = {1, 1, 1};
		Assert.assertEquals(0, Search.search(testArray, (short) 1));
	}
	
	@Test
	public void testSearchShortsThreeNotFound() {
		short[] testArray = {-1, Short.MIN_VALUE, -1};
		Assert.assertEquals(Search.RESULT_ELEMENT_NOT_FOUND, Search.search(testArray, (short) 17));
	}
	
	@Test
	public void testSearchShortsSeveralOkFirst() {
		short[] testArray = {-1, 0, 10, Short.MAX_VALUE};
		Assert.assertEquals(0, Search.search(testArray, (short) -1));
	}
	
	@Test
	public void testSearchShortsSeveralOkMiddle() {
		short[] testArray = {-1, 0, 1, -128};
		Assert.assertEquals(2, Search.search(testArray, (short) 1));
	}
	
	@Test
	public void testSearchShortsSeveralOkLast() {
		short[] testArray = {Short.MAX_VALUE, Short.MAX_VALUE, Short.MIN_VALUE, 0};
		Assert.assertEquals(3, Search.search(testArray, (short) 0));
	}
	
	@Test
	public void testSearchShortsSeveralNotFound() {
		short[] testArray = {127, 32, 100, 0};
		Assert.assertEquals(Search.RESULT_ELEMENT_NOT_FOUND, Search.search(testArray, (short) -128));
	}
	
	@Test
	public void testSearchIntsOnlyOk() {
		int[] testArray = {Integer.MAX_VALUE};
		Assert.assertEquals(0, Search.search(testArray, Integer.MAX_VALUE));
	}
	
	@Test
	public void testSearchIntsOnlyNotFound() {
		int[] testArray = {Integer.MIN_VALUE};
		Assert.assertEquals(Search.RESULT_ELEMENT_NOT_FOUND, Search.search(testArray, 0));
	}
	
	@Test
	public void testSearchIntsTwoOkFirst() {
		int[] testArray = {Integer.MIN_VALUE, Integer.MAX_VALUE};
		Assert.assertEquals(0, Search.search(testArray, Integer.MIN_VALUE));
	}
	
	@Test
	public void testSearchIntsTwoOkLast() {
		int[] testArray = {127, Integer.MIN_VALUE};
		Assert.assertEquals(1, Search.search(testArray, Integer.MIN_VALUE));
	}
	
	@Test
	public void testSearchIntsTwoOkBoth() {
		int[] testArray = {Integer.MAX_VALUE, Integer.MAX_VALUE};
		Assert.assertEquals(0, Search.search(testArray, Integer.MAX_VALUE));
	}
	
	@Test
	public void testSearchIntsTwoNotFound() {
		int[] testArray = {Integer.MAX_VALUE, Integer.MIN_VALUE};
		Assert.assertEquals(Search.RESULT_ELEMENT_NOT_FOUND, Search.search(testArray, 0));
	}
	
	@Test
	public void testSearchIntsThreeOkFirst() {
		int[] testArray = {0, Integer.MAX_VALUE, Integer.MIN_VALUE};
		Assert.assertEquals(0, Search.search(testArray, 0));
	}
	
	@Test
	public void testSearchIntsThreeOkMiddle() {
		int[] testArray = {Integer.MIN_VALUE, Integer.MAX_VALUE, 0};
		Assert.assertEquals(1, Search.search(testArray, Integer.MAX_VALUE));
	}
	
	@Test
	public void testSearchIntsThreeOkLast() {
		int[] testArray = {Integer.MAX_VALUE, 0, Integer.MIN_VALUE};
		Assert.assertEquals(2, Search.search(testArray, Integer.MIN_VALUE));
	}
	
	@Test
	public void testSearchIntsThreeOkAll() {
		int[] testArray = {1, 1, 1};
		Assert.assertEquals(0, Search.search(testArray, 1));
	}
	
	@Test
	public void testSearchIntsThreeNotFound() {
		int[] testArray = {-1, Integer.MIN_VALUE, -1};
		Assert.assertEquals(Search.RESULT_ELEMENT_NOT_FOUND, Search.search(testArray, 17));
	}
	
	@Test
	public void testSearchIntsSeveralOkFirst() {
		int[] testArray = {-1, 0, 10, Integer.MAX_VALUE};
		Assert.assertEquals(0, Search.search(testArray, -1));
	}
	
	@Test
	public void testSearchIntsSeveralOkMiddle() {
		int[] testArray = {-1, 0, 1, -128};
		Assert.assertEquals(2, Search.search(testArray, 1));
	}
	
	@Test
	public void testSearchIntsSeveralOkLast() {
		int[] testArray = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
		Assert.assertEquals(3, Search.search(testArray, 0));
	}
	
	@Test
	public void testSearchIntsSeveralNotFound() {
		int[] testArray = {127, 32, 100, 0};
		Assert.assertEquals(Search.RESULT_ELEMENT_NOT_FOUND, Search.search(testArray, -128));
	}
	
	@Test
	public void testSearchLongsOnlyOk() {
		long[] testArray = {Long.MAX_VALUE};
		Assert.assertEquals(0, Search.search(testArray, Long.MAX_VALUE));
	}
	
	@Test
	public void testSearchLongsOnlyNotFound() {
		long[] testArray = {Long.MIN_VALUE};
		Assert.assertEquals(Search.RESULT_ELEMENT_NOT_FOUND, Search.search(testArray, 0));
	}
	
	@Test
	public void testSearchLongsTwoOkFirst() {
		long[] testArray = {Long.MIN_VALUE, Long.MAX_VALUE};
		Assert.assertEquals(0, Search.search(testArray, Long.MIN_VALUE));
	}
	
	@Test
	public void testSearchLongsTwoOkLast() {
		long[] testArray = {127, Long.MIN_VALUE};
		Assert.assertEquals(1, Search.search(testArray, Long.MIN_VALUE));
	}
	
	@Test
	public void testSearchLongsTwoOkBoth() {
		long[] testArray = {Long.MAX_VALUE, Long.MAX_VALUE};
		Assert.assertEquals(0, Search.search(testArray, Long.MAX_VALUE));
	}
	
	@Test
	public void testSearchLongsTwoNotFound() {
		long[] testArray = {Long.MAX_VALUE, Long.MIN_VALUE};
		Assert.assertEquals(Search.RESULT_ELEMENT_NOT_FOUND, Search.search(testArray, 0));
	}
	
	@Test
	public void testSearchLongsThreeOkFirst() {
		long[] testArray = {0, Long.MAX_VALUE, Long.MIN_VALUE};
		Assert.assertEquals(0, Search.search(testArray, 0));
	}
	
	@Test
	public void testSearchLongsThreeOkMiddle() {
		long[] testArray = {Long.MIN_VALUE, Long.MAX_VALUE, 0};
		Assert.assertEquals(1, Search.search(testArray, Long.MAX_VALUE));
	}
	
	@Test
	public void testSearchLongsThreeOkLast() {
		long[] testArray = {Long.MAX_VALUE, 0, Long.MIN_VALUE};
		Assert.assertEquals(2, Search.search(testArray, Long.MIN_VALUE));
	}
	
	@Test
	public void testSearchLongsThreeOkAll() {
		long[] testArray = {1, 1, 1};
		Assert.assertEquals(0, Search.search(testArray, 1));
	}
	
	@Test
	public void testSearchLongsThreeNotFound() {
		long[] testArray = {-1, Long.MIN_VALUE, -1};
		Assert.assertEquals(Search.RESULT_ELEMENT_NOT_FOUND, Search.search(testArray, 17));
	}
	
	@Test
	public void testSearchLongsSeveralOkFirst() {
		long[] testArray = {-1, 0, 10, Long.MAX_VALUE};
		Assert.assertEquals(0, Search.search(testArray, -1));
	}
	
	@Test
	public void testSearchLongsSeveralOkMiddle() {
		long[] testArray = {-1, 0, 1, -128};
		Assert.assertEquals(2, Search.search(testArray, 1));
	}
	
	@Test
	public void testSearchLongsSeveralOkLast() {
		long[] testArray = {Long.MAX_VALUE, Long.MAX_VALUE, Long.MIN_VALUE, 0};
		Assert.assertEquals(3, Search.search(testArray, 0));
	}
	
	@Test
	public void testSearchLongsSeveralNotFound() {
		long[] testArray = {127, 32, 100, 0};
		Assert.assertEquals(Search.RESULT_ELEMENT_NOT_FOUND, Search.search(testArray, -128));
	}
	
	@Test
	public void testMinBytesOnly() {
		byte[] testArray = {Byte.MAX_VALUE};
		Assert.assertEquals(Byte.MAX_VALUE, Search.min(testArray));
	}
	
	@Test
	public void testMinBytesTwo() {
		byte[] testArray = {Byte.MAX_VALUE, Byte.MIN_VALUE};
		Assert.assertEquals(Byte.MIN_VALUE, Search.min(testArray));
	}
	
	@Test
	public void testMinBytesTwoEqual() {
		byte[] testArray = {Byte.MAX_VALUE, Byte.MAX_VALUE};
		Assert.assertEquals(Byte.MAX_VALUE, Search.min(testArray));
	}
	
	@Test
	public void testMinBytesThree() {
		byte[] testArray = {0, -1, 0};
		Assert.assertEquals(-1, Search.min(testArray));
	}
	
	@Test
	public void testMinBytesThreeEqual() {
		byte[] testArray = {1, 1, 1};
		Assert.assertEquals(1, Search.min(testArray));
	}
	
	@Test
	public void testMinShortsOnly() {
		short[] testArray = {Short.MAX_VALUE};
		Assert.assertEquals(Short.MAX_VALUE, Search.min(testArray));
	}
	
	@Test
	public void testMinShortsTwo() {
		short[] testArray = {0, -1};
		Assert.assertEquals(-1, Search.min(testArray));
	}
	
	@Test
	public void testMinShortsTwoEqual() {
		short[] testArray = {Short.MAX_VALUE, Short.MAX_VALUE};
		Assert.assertEquals(Short.MAX_VALUE, Search.min(testArray));
	}
	
	@Test
	public void testMinShortsThree() {
		short[] testArray = {Short.MAX_VALUE, -1, 0};
		Assert.assertEquals(-1, Search.min(testArray));
	}
	
	@Test
	public void testMinShortsThreeEqual() {
		short[] testArray = {Short.MIN_VALUE, Short.MIN_VALUE, Short.MIN_VALUE};
		Assert.assertEquals(Short.MIN_VALUE, Search.min(testArray));
	}
	
	@Test
	public void testMinIntsOnly() {
		int[] testArray = {-1};
		Assert.assertEquals(-1, Search.min(testArray));
	}
	
	@Test
	public void testMinIntsTwo() {
		int[] testArray = {0, Integer.MAX_VALUE};
		Assert.assertEquals(0, Search.min(testArray));
	}
	
	@Test
	public void testMinIntsTwoEqual() {
		int[] testArray = {1, 1};
		Assert.assertEquals(1, Search.min(testArray));
	}
	
	@Test
	public void testMinIntsThree() {
		int[] testArray = {Integer.MAX_VALUE, -1, Integer.MIN_VALUE};
		Assert.assertEquals(Integer.MIN_VALUE, Search.min(testArray));
	}
	
	@Test
	public void testMinIntsThreeEqual() {
		int[] testArray = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
		Assert.assertEquals(Integer.MIN_VALUE, Search.min(testArray));
	}
	
	@Test
	public void testMinLongsOnly() {
		long[] testArray = {0};
		Assert.assertEquals(0, Search.min(testArray));
	}
	
	@Test
	public void testMinLongsTwo() {
		long[] testArray = {-1, Long.MIN_VALUE};
		Assert.assertEquals(Long.MIN_VALUE, Search.min(testArray));
	}
	
	@Test
	public void testMinLongsTwoEqual() {
		long[] testArray = {Long.MAX_VALUE, Long.MAX_VALUE};
		Assert.assertEquals(Long.MAX_VALUE, Search.min(testArray));
	}
	
	@Test
	public void testMinLongsThree() {
		long[] testArray = {-1, -1, Long.MIN_VALUE};
		Assert.assertEquals(Long.MIN_VALUE, Search.min(testArray));
	}
	
	@Test
	public void testMinLongsThreeEqual() {
		long[] testArray = {0, 0, 0};
		Assert.assertEquals(0, Search.min(testArray));
	}
	
	@Test
	public void testMaxBytesOnly() {
		byte[] testArray = {Byte.MAX_VALUE};
		Assert.assertEquals(Byte.MAX_VALUE, Search.max(testArray));
	}
	
	@Test
	public void testMaxBytesTwo() {
		byte[] testArray = {Byte.MAX_VALUE, Byte.MIN_VALUE};
		Assert.assertEquals(Byte.MAX_VALUE, Search.max(testArray));
	}
	
	@Test
	public void testMaxBytesTwoEqual() {
		byte[] testArray = {Byte.MAX_VALUE, Byte.MAX_VALUE};
		Assert.assertEquals(Byte.MAX_VALUE, Search.max(testArray));
	}
	
	@Test
	public void testMaxBytesThree() {
		byte[] testArray = {0, -1, 0};
		Assert.assertEquals(0, Search.max(testArray));
	}
	
	@Test
	public void testMaxBytesThreeEqual() {
		byte[] testArray = {1, 1, 1};
		Assert.assertEquals(1, Search.max(testArray));
	}
	
	@Test
	public void testMaxShortsOnly() {
		short[] testArray = {Short.MAX_VALUE};
		Assert.assertEquals(Short.MAX_VALUE, Search.max(testArray));
	}
	
	@Test
	public void testMaxShortsTwo() {
		short[] testArray = {0, -1};
		Assert.assertEquals(0, Search.max(testArray));
	}
	
	@Test
	public void testMaxShortsTwoEqual() {
		short[] testArray = {Short.MAX_VALUE, Short.MAX_VALUE};
		Assert.assertEquals(Short.MAX_VALUE, Search.max(testArray));
	}
	
	@Test
	public void testMaxShortsThree() {
		short[] testArray = {Short.MAX_VALUE, -1, 0};
		Assert.assertEquals(Short.MAX_VALUE, Search.max(testArray));
	}
	
	@Test
	public void testMaxShortsThreeEqual() {
		short[] testArray = {Short.MIN_VALUE, Short.MIN_VALUE, Short.MIN_VALUE};
		Assert.assertEquals(Short.MIN_VALUE, Search.max(testArray));
	}
	
	@Test
	public void testMaxIntsOnly() {
		int[] testArray = {-1};
		Assert.assertEquals(-1, Search.max(testArray));
	}
	
	@Test
	public void testMaxIntsTwo() {
		int[] testArray = {0, Integer.MAX_VALUE};
		Assert.assertEquals(Integer.MAX_VALUE, Search.max(testArray));
	}
	
	@Test
	public void testMaxIntsTwoEqual() {
		int[] testArray = {1, 1};
		Assert.assertEquals(1, Search.max(testArray));
	}
	
	@Test
	public void testMaxIntsThree() {
		int[] testArray = {Integer.MAX_VALUE, -1, Integer.MIN_VALUE};
		Assert.assertEquals(Integer.MAX_VALUE, Search.max(testArray));
	}
	
	@Test
	public void testMaxIntsThreeEqual() {
		int[] testArray = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
		Assert.assertEquals(Integer.MIN_VALUE, Search.max(testArray));
	}
	
	@Test
	public void testMaxLongsOnly() {
		long[] testArray = {0};
		Assert.assertEquals(0, Search.max(testArray));
	}
	
	@Test
	public void testMaxLongsTwo() {
		long[] testArray = {-1, Long.MIN_VALUE};
		Assert.assertEquals(-1, Search.max(testArray));
	}
	
	@Test
	public void testMaxLongsTwoEqual() {
		long[] testArray = {Long.MAX_VALUE, Long.MAX_VALUE};
		Assert.assertEquals(Long.MAX_VALUE, Search.max(testArray));
	}
	
	@Test
	public void testMaxLongsThree() {
		long[] testArray = {-1, -1, Long.MIN_VALUE};
		Assert.assertEquals(-1, Search.max(testArray));
	}
	
	@Test
	public void testMaxLongsThreeEqual() {
		long[] testArray = {0, 0, 0};
		Assert.assertEquals(0, Search.max(testArray));
	}
	
	@Test
	public void testAvgBytesOneZero() {
		byte[] testArray = {0};
		Assert.assertEquals(0, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgBytesOnePositive() {
		byte[] testArray = {Byte.MAX_VALUE};
		Assert.assertEquals(Byte.MAX_VALUE, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgBytesOneNegative() {
		byte[] testArray = {Byte.MIN_VALUE};
		Assert.assertEquals(Byte.MIN_VALUE, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgBytesTwoEqual() {
		byte[] testArray = {0, 0};
		Assert.assertEquals(0, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgBytesTwoZeroNegative() {
		byte[] testArray = {0, -1};
		Assert.assertEquals(-0.5, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgBytesTwoZeroPositive() {
		byte[] testArray = {0, 1};
		Assert.assertEquals(0.5, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgBytesThreeEqual() {
		byte[] testArray = {0, 0, 0};
		Assert.assertEquals(0, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgBytesThree() {
		byte[] testArray = {Byte.MAX_VALUE, 0, Byte.MIN_VALUE};
		Assert.assertEquals(-1 / 3.0, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgBytesFour() {
		byte[] testArray = {8, 0, -6, -4};
		Assert.assertEquals(-0.25, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgShortsOneZero() {
		short[] testArray = {0};
		Assert.assertEquals(0, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgShortsOnePositive() {
		short[] testArray = {Short.MAX_VALUE};
		Assert.assertEquals(Short.MAX_VALUE, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgShortsOneNegative() {
		short[] testArray = {Short.MIN_VALUE};
		Assert.assertEquals(Short.MIN_VALUE, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgShortsTwoEqual() {
		short[] testArray = {Short.MIN_VALUE, Short.MIN_VALUE};
		Assert.assertEquals(Short.MIN_VALUE, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgShortsTwoZeroNegative() {
		short[] testArray = {0, -1};
		Assert.assertEquals(-0.5, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgShortsTwoZeroPositive() {
		short[] testArray = {0, 1};
		Assert.assertEquals(0.5, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgShortsThreeEqual() {
		short[] testArray = {Short.MAX_VALUE, Short.MAX_VALUE, Short.MAX_VALUE};
		Assert.assertEquals(Short.MAX_VALUE, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgShortsThree() {
		short[] testArray = {Short.MAX_VALUE, 0, Short.MIN_VALUE};
		Assert.assertEquals(-1 / 3.0, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgShortsFour() {
		short[] testArray = {800, 0, -60, -40};
		Assert.assertEquals(175, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgIntsOneZero() {
		int[] testArray = {0};
		Assert.assertEquals(0, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgIntsOnePositive() {
		int[] testArray = {Integer.MAX_VALUE};
		Assert.assertEquals(Integer.MAX_VALUE, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgIntsOneNegative() {
		int[] testArray = {Integer.MIN_VALUE};
		Assert.assertEquals(Integer.MIN_VALUE, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgIntsTwoEqual() {
		int[] testArray = {Integer.MIN_VALUE, Integer.MIN_VALUE};
		Assert.assertEquals(Integer.MIN_VALUE, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgIntsTwoZeroNegative() {
		int[] testArray = {0, -1};
		Assert.assertEquals(-0.5, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgIntsTwoZeroPositive() {
		int[] testArray = {0, 1};
		Assert.assertEquals(0.5, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgIntsThreeEqual() {
		int[] testArray = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
		Assert.assertEquals(Integer.MIN_VALUE, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgIntsThree() {
		int[] testArray = {Integer.MAX_VALUE, 1, Integer.MIN_VALUE};
		Assert.assertEquals(0, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgIntsFour() {
		int[] testArray = {256, 128, -512, 64};
		Assert.assertEquals(-16, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgLongsOneZero() {
		long[] testArray = {0};
		Assert.assertEquals(0, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgLongsOnePositive() {
		long[] testArray = {Long.MAX_VALUE};
		Assert.assertEquals(Long.MAX_VALUE, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgLongsOneNegative() {
		long[] testArray = {Long.MIN_VALUE};
		Assert.assertEquals(Long.MIN_VALUE, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgLongsTwoEqual() {
		long[] testArray = {Long.MAX_VALUE, Long.MAX_VALUE};
		Assert.assertEquals(Long.MAX_VALUE, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgLongsTwoZeroNegative() {
		long[] testArray = {0, -1};
		Assert.assertEquals(-0.5, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgLongsTwoZeroPositive() {
		long[] testArray = {0, 1};
		Assert.assertEquals(0.5, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgLongsThreeEqual() {
		long[] testArray = {Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE};
		Assert.assertEquals(Long.MAX_VALUE, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgLongsThree() {
		long[] testArray = {Long.MAX_VALUE, 100, Long.MIN_VALUE};
		Assert.assertEquals(33, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgLongsFour() {
		long[] testArray = {256, 128, -512, 64};
		Assert.assertEquals(-16, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgFloatsOneZero() {
		float[] testArray = {0};
		Assert.assertEquals(0, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgFloatsOnePositive() {
		float[] testArray = {1};
		Assert.assertEquals(1, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgFloatsOneNegative() {
		float[] testArray = {-1};
		Assert.assertEquals(-1, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgFloatsTwoEqual() {
		float[] testArray = {8.8F, 8.8F};
		Assert.assertEquals(8.8, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgFloatsTwoZeroNegative() {
		float[] testArray = {0, -5.5F};
		Assert.assertEquals(-2.75, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgFloatsTwoZeroPositive() {
		float[] testArray = {0, 1.5F};
		Assert.assertEquals(0.75, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgFloatsThreeEqual() {
		float[] testArray = {128.08F, 128.08F, 128.08F};
		Assert.assertEquals(128.08F, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgFloatsThree() {
		float[] testArray = {-100.9F, 100, 99.9F};
		Assert.assertEquals(33, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgFloatsFour() {
		float[] testArray = {256.8F, 128.1F, -512.5F, 64.2F};
		Assert.assertEquals(-15.85, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgDoublesOneZero() {
		double[] testArray = {0};
		Assert.assertEquals(0, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgDoublesOnePositive() {
		double[] testArray = {1};
		Assert.assertEquals(1, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgDoublesOneNegative() {
		double[] testArray = {-1};
		Assert.assertEquals(-1, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgDoublesTwoEqual() {
		double[] testArray = {888.8, 888.8};
		Assert.assertEquals(888.8, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgDoublesTwoZeroNegative() {
		double[] testArray = {0, -5.502};
		Assert.assertEquals(-2.751, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgDoublesTwoZeroPositive() {
		double[] testArray = {0, 1.5};
		Assert.assertEquals(0.75, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgDoublesThreeEqual() {
		double[] testArray = {128.0808, 128.0808, 128.0808};
		Assert.assertEquals(128.0808, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgDoublesThree() {
		double[] testArray = {-111.93, 100, 99.9};
		Assert.assertEquals(29.323333333, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
	
	@Test
	public void testAvgDoublesFour() {
		double[] testArray = {256.8, 128.1128, -512.512, 640.288};
		Assert.assertEquals(512.6888, Search.avg(testArray), DOUBLE_ASSERT_DELTA);
	}
}
