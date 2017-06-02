package com.erbis.java.courses.document;

import java.util.Objects;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * Document domain object class.
 */
public class Document {
	
	private final String title;
	private final String author;
	private final short pageCount;
	private final long creationTimestamp;
	private Type type;
	
	public enum Type {
		Mathematics,
		Sport
	}

	/**
	 * Creates document with specified parameters.
	 * @param title title
	 * @param author author
	 * @param pageCount page count
	 * @param creationTimestamp creation timestamp in milliseconds
	 * @see #Document(java.lang.String, java.lang.String, short, long, java.lang.String)
	 */
	public Document(String title, String author, short pageCount, long creationTimestamp) {
		if (title == null || author == null) {
			throw new NullPointerException();
		}
		if (title.equals("") || author.equals("") || pageCount <= 0) {
			throw new IllegalArgumentException();
		}
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
		this.creationTimestamp = creationTimestamp;
	}

	/**
	 * Creates document with specified parameters.
	 * @param title title
	 * @param author author
	 * @param pageCount page count
	 * @param creationTimestamp creation timestamp in milliseconds
	 * @param type type
	 * @see #Document(java.lang.String, java.lang.String, short, long)
	 */
	public Document(String title, String author, short pageCount, long creationTimestamp, String type) {
		this(title, author, pageCount, creationTimestamp);		
		this.type = Type.valueOf(type);
	}

	//CHECKSTYLE:OFF
	@Override
	@SuppressFBWarnings("HE_EQUALS_USE_HASHCODE")
	public boolean equals(Object obj) {
	//CHECKSTYLE:ON
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() == obj.getClass()) {
			Document other = (Document) obj;
			return Objects.equals(title, other.title) && Objects.equals(author, other.author)
					&& pageCount == other.pageCount;
		}
		return false;
	}
	
	/**
	 * Returns document title.
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Returns document author.
	 * @return author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Returns document page count.
	 * @return page count
	 */
	public short getPageCount() {
		return pageCount;
	}

	/**
	 * Returns document creation timestamp in milliseconds.
	 * @return creation timestamp
	 */
	public long getCreationTimestamp() {
		return creationTimestamp;
	}

	/**
	 * Returns document type.
	 * @return type
	 * @see #setType(String)
	 */
	public Type getType() {
		return type;
	}

	/**
	 * Sets document type.
	 * @param type type
	 * @see #getType()
	 */
	public void setType(Type type) {
		this.type = type;
	}
}
