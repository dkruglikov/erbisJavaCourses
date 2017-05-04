package com.erbis.java.cources.aleksandra.lesson27;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card = new Card();
		card.setFlush(Flush.DIAMOND);
		System.out.println(card);
		System.out.println(Arrays.toString(Flush.values()));
		Flush f = Flush.valueOf("PIKE");
		String m = Flush.fromScreenName("черва");
		System.out.println(f);
		System.out.println(m);
	}
}
