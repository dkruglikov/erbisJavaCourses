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

    public void setReadableArticleName(String readableArticleName) {
        this.readableArticleName = readableArticleName;
    }

    @Override
    public String toString() {
        return readableArticleName;
    }
}
