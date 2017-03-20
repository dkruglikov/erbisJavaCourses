package com.erbis.java.courses.document;

public class Document {
    private final String title;
    private final String author;
    private String type;

    private final short pageCount;
    private final long creationTimestamp;

    public Document(String title, String author, short pageCount, long creationTimestamp, String type) {
        this(title, author, pageCount, creationTimestamp);
        setType(type);
    }

    public Document(String title, String author, short pageCount, long creationTimestamp) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.creationTimestamp = creationTimestamp;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public short getPageCount() {
        return pageCount;
    }

    public long getCreationTimestamp() {
        return creationTimestamp;
    }
}
