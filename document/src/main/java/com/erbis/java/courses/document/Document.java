package com.erbis.java.courses.document;

public class Document {
	
	private final String title;
	private final String author;
	private final short pageCount;
	private final long creationTimestamp;
	private String type;

	public Document(String title, String author, short pageCount, long creationTimestamp) {
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
		this.creationTimestamp = creationTimestamp;
	}

	public Document(String title, String author, short pageCount, long creationTimestamp, String type) {
		this(title, author, pageCount, creationTimestamp);
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public short getPageCount() {
		return pageCount;
	}

	public long getCreationTimestamp() {
		return creationTimestamp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
