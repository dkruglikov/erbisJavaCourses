package com.erbis.java.cources.olga.lesson27;

import java.util.Arrays;

public final class Main {
	
	private Main() {
	}

	public static void main(String[] args) {
		Card c = new Card();
		c.setFlush(Flush.HEART);
		System.out.println(c);
		System.out.println(Arrays.toString(Flush.values()));
		
		Flush f = Flush.valueOf("PIKE");
		System.out.println(f);
		Flush f1 = Flush.fromScreenName("Пика");
		System.out.println(f1.name());
	}
}
