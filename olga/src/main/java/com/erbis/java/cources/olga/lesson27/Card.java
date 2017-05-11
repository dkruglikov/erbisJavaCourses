package com.erbis.java.cources.olga.lesson27;

public class Card {
	private Flush flush;
	
	void setFlush(Flush flush) {
		this.flush = flush;
	}

	public Flush getFlush() {
		return flush;
	}
	
	@Override
	public String toString() {
		return "Card: flush=" + getFlush()
		+ ", fOrdinal=" + getFlush().ordinal() 
		+ ", fName=" + getFlush().getScreenName();
	}
	
}
