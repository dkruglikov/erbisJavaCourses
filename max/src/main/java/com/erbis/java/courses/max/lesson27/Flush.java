package com.erbis.java.courses.max.lesson27;

public enum Flush {
    PIKE("Пика"),
    CLUBS("Треф"),
    DIAMOND("Бубна"),
    HEART("Чирва");
    private final String screenName;

    Flush(String screenName) {
        this.screenName = screenName;
    }

    @Override
    public String toString() {
        return getScreenName();
    }

    public String getScreenName() {
        return screenName;
    }
}
