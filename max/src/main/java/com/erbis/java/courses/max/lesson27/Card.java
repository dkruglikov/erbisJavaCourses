package com.erbis.java.courses.max.lesson27;

public class Card {

    private Flush flush;

    public void setFlush(Flush flush) {
        this.flush = flush;
    }

    public Flush getFlush() {
        return flush;
    }

    @Override
    public String toString() {
        return "Card: flush = " + getFlush() + ", fOrdinal = " + getFlush().ordinal() + ", fName = " + getFlush().name()
                + ", translate: " + getFlush().getScreenName();
    }
}
