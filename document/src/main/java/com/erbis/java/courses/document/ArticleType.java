package com.erbis.java.courses.document;

public enum ArticleType {
    SPORT("Sport"),
    MATHEMATICS("Mathematics"),
    PHILOSOPHY("Philosophy"),
    OTHER("Others");
    private String readableArticleName;

    ArticleType(String type) {
        this.readableArticleName = type;
    }

    public String getReadableArticleName() {
        return readableArticleName;
    }
}
