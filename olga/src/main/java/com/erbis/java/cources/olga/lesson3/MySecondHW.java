package com.erbis.java.cources.olga.lesson3;

public final class MySecondHW {
	private static final double DOUBLE_CONST = 456.789;
	private static final float FLOAT_CONST = 5.5F;
	private static final int LONG_CONST = 123;
	private static final int INT_CONST = 3;
	private MySecondHW() {
	}
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		int i = INT_CONST;
		char c = 'g';
		long l = LONG_CONST;
		float f = FLOAT_CONST;
		double d = DOUBLE_CONST;

		System.out.println(b + s);
		System.out.println(i - c);
		System.out.println(l / f);
		System.out.println(f * d);
		System.out.println(d % s);
	}
}
