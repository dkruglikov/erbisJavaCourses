package com.erbis.java.cources.olga.lesson4;

public final class MyThirdHW {
	private static final int NUMBER4 = 50;
	private static final int NUMBER3 = 20;
	private static final int NUMBER2 = 45;
	private static final int NUMBER1 = 10;
	private static final double DOUBLE_CONST = 588787.65464;
	private static final float FLOAT_CONST = 10.1F;
	private static final int LONG_CONST = 456666;
	private static final int INT_CONST = 55;
	private MyThirdHW() {
	}
	public static void main(String[] args) {

		int i = INT_CONST;
		char c = 'е';
		long l = LONG_CONST;
		float f = FLOAT_CONST;
		double d = DOUBLE_CONST;
		boolean a = (NUMBER1 * 2) == NUMBER3;
		boolean b = (NUMBER2 * 2) == NUMBER4;
		boolean g = (i * l) == NUMBER3;

		System.out.println(c < f);
		System.out.println(i > l);
		System.out.println(a || b);
		System.out.println(g ^ a);
		System.out.println(b && g);
	}
}
