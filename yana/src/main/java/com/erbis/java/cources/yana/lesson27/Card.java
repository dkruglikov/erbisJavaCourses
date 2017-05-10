package com.erbis.java.cources.yana.lesson27;

import java.util.Arrays;

public class Card {
    private Flush flush;

    public Flush getFlush() {
        return flush;
    }

    public void setFlush(Flush flush) {
        this.flush = flush;
    }
    
    @Override
    public String toString() {
        return "Card: flush = " + getFlush() + 
                "; fOrdinal = " + getFlush().ordinal() + 
                "; fName = " + getFlush().getScreenName();
    }
    
    public static void main(String[] args) {
        Card card1 = new Card();
        card1.setFlush(Flush.PIKE);
        System.out.println(card1);
        System.out.println(Arrays.toString(Flush.values()));
        Flush f = Flush.valueOf("PIKE");
        System.out.println(f);
        System.out.println(Flush.fromScreenName("Черва").name());
    }

}
