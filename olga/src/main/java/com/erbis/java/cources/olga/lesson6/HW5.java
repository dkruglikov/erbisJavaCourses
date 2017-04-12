package com.erbis.java.cources.olga.lesson6;

public final class HW5 {
	private static final int NUMBER4 = 8;
	private static final int NUMBER3 = 8;
	private static final int NUMBER2 = 5;
	private static final int NUMBER1 = 9;

	private HW5() {
	}
	public static void main(String[] args) {
		byte[] arr1 = {2, NUMBER1, NUMBER2, NUMBER3};
		byte value1 = NUMBER4;
		System.out.print("Index of value = ");
		System.out.println(HW5.search(arr1, value1));
		System.out.print("Min value = ");
		System.out.println(HW5.min(arr1));
		System.out.print("Max value = ");
		System.out.println(HW5.max(arr1));
		System.out.print("Avarage value = ");
		System.out.println(HW5.avg(arr1));
	}

	public static int search(byte[] arrSrch, byte search) {
		for (int i = 0; i < arrSrch.length; i++) {
			if (arrSrch[i] == search) {
				return i;
			}
		}
		return -1;
	}

	public static byte min(byte[] arrMin) {
		byte minByte = arrMin[0];
		for (int i = 1; i < arrMin.length; i++) {
			if (minByte > arrMin[i]) {
				minByte = arrMin[i];
			}
		}
		return minByte;
	}

	public static byte max(byte[] arrMax) {
		byte maxByte = arrMax[0];
		for (int i = 1; i < arrMax.length; i++) {
			if (maxByte < arrMax[i]) {
				maxByte = arrMax[i];
			}
		}
		return maxByte;
	}

	public static double avg(byte[] arrAvg) {
		long summ = 0;
		double avgByte = 0;
		for (int i = 0; i < arrAvg.length; i++) {
			summ += arrAvg[i];
		}
		avgByte = summ / arrAvg.length;
		return avgByte;
	}
}
