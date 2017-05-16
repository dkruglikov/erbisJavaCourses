package com.erbis.java.courses.document;

public class ElectronicDocument extends Document {

	private String format;
	
	public ElectronicDocument(String title, String author, short pageCount, long creationTimestamp) {
		super(title, author, pageCount, creationTimestamp);
	}

	public ElectronicDocument(String title, String author, short pageCount, long creationTimestamp, String type) {
		super(title, author, pageCount, creationTimestamp, type);
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
}
