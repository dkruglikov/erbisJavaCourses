package com.erbis.java.cources.aleksandra.lesson27;

public class Card {
 private Flush flush;
 
 public Flush getFlush() {
	return flush;
 }
 void setFlush(Flush flush){
	 this.flush = flush;
 } 
@Override
 public String toString(){
	return "Card:flush=" + getFlush() + 
			", fOrdinal=" + getFlush().ordinal() +
			", fName=" + getFlush().name() +
			", sreenName=" + getFlush().getScreenName();
}
}
