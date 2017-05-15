package com.erbis.java.courses.document;

public enum Type {
    SPORT("Sport"),
    MATHEMATICS("Mathematics"),
    PHILOSOPHY("Philosophy"),
    OTHER("Others");
    private String readableArticleName;

    Type(String type) {
        this.readableArticleName = type;
    }

    public String getReadableArticleName() {
        return readableArticleName;
    }
}
