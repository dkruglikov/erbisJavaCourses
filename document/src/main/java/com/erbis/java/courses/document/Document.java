package com.erbis.java.courses.document;

public class Document {
    
    private final String title;
    private final String author;
    private String type;
    private final short pageCount;
    private final long creationTimeStamp;
    
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
    
    public long getCreationTimeStamp() {
        return creationTimeStamp;
    }
    
    private Document(String title, String author, short pageCount, long creationTimeStamp) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.creationTimeStamp = creationTimeStamp;
    }
    
    public Document(String title, String author, String type, short pageCount, long creationTimeStamp) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.pageCount = pageCount;
        this.creationTimeStamp = creationTimeStamp;
    }
}
