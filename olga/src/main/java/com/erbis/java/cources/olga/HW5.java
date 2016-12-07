package com.erbis.java.cources.olga;

public class HW5 {
	public static void main(String[] args) {
		byte[] arr1 = { 2, 9, 5, 8 };
		byte Value1 = 8;
		System.out.print("Index of value = ");
		System.out.println(HW5.search(arr1, Value1));
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
