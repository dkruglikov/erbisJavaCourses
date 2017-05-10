package com.erbis.java.cources.yana.lesson27;

public enum Flush {
    PIKE("Пика"),
    CLUBS("Трефа"),
    DIAMOND("Бубна"),
    HEART("Черва");

    private final String screenName;

    Flush(String screenName) {
        this.screenName = screenName;
    }

    public String getScreenName() {
        return screenName;
    }

    @Override
    public String toString() {
        return screenName.toLowerCase();
    }

    public static Flush fromScreenName(String screenName) {
        if (screenName.equals(PIKE.getScreenName())) {
            return PIKE;
        } else if (screenName.equals(CLUBS.getScreenName())) {
            return CLUBS;
        } else if (screenName.equals(DIAMOND.getScreenName())) {
            return DIAMOND;
        } else if (screenName.equals(HEART.getScreenName())) {
            return HEART;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
