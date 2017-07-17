package com.erbis.java.courses.document;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

public class ElectronicDocument extends Document {

	private String format;
	
	public ElectronicDocument(String title, String author, short pageCount, long creationTimestamp) {
		super(title, author, pageCount, creationTimestamp);
	}

	public ElectronicDocument(String title, String author, short pageCount, 
	        long creationTimestamp, Type type) {
		super(title, author, pageCount, creationTimestamp, type);
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
	
	//CHECKSTYLE:OFF
    @Override
    @SuppressFBWarnings("HE_EQUALS_USE_HASHCODE")
    public boolean equals(Object obj) {
    //CHECKSTYLE:ON
        return super.equals(obj);
    }
	
}
