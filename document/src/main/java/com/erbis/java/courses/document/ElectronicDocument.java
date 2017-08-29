package com.erbis.java.courses.document;

import java.util.Objects;

public class ElectronicDocument extends Document {

	private String format;

	public ElectronicDocument(String title, String author, short pageCount, long creationTimestamp) {
		super(title, author, pageCount, creationTimestamp);
	}

	public ElectronicDocument(String title, 
							  String author, short pageCount, long creationTimestamp, Type type) {
		super(title, author, pageCount, creationTimestamp, type);
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}


	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!this.getClass().equals(obj.getClass())) {
			return false;
		}
			ElectronicDocument other = (ElectronicDocument) obj;
			return Objects.equals(format, other.format); 
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getAuthor()) 
				+ Objects.hashCode(getTitle()) 
				+ Objects.hashCode(getPageCount())
				+ Objects.hashCode(format);
	}
	
}
