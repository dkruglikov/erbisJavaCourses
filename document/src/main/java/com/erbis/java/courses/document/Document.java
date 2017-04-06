package com.erbis.java.courses.document;

import javax.print.Doc;

/**
 * Document domain object class.
 */
public class Document {

	private final String title;
	private final String author;
	private final short pageCount;
	private final long creationTimestamp;
	private String type;

	/**
	 * Creates document with specified parameters.
	 * @param title title
	 * @param author author
	 * @param pageCount page count
	 * @param creationTimestamp creation timestamp in milliseconds
	 * @see #Document(java.lang.String, java.lang.String, short, long, java.lang.String)
	 */
	public Document(String title, String author, short pageCount, long creationTimestamp) {
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
		this.type = type;
	}

	//CHECKSTYLE:OFF
	@Override
	public boolean equals (Object object) {
	//CHECKSTYLE:ON
		if(this == object) {
			return true;
		}
		if (this == null) {
			return false;
		}
		if(object instanceof Document) {
			Document other = (Document) object;
			if ((author == null)&&(((Document) object).author == null)) {
				return true;
			}
			if ((title == null)&&(((Document) object).title == null)) {
				return true;
			}
			if ((author != null) && (title != null) && (pageCount != 0)) {
				return (author.equals((other.author))
						& title.equals((other.title))
						& pageCount == other.pageCount);
			} else {
				return false;
			}
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
	public String getType() {
		return type;
	}

	/**
	 * Sets document type.
	 * @param type type
	 * @see #getType()
	 */
	public void setType(String type) {
		this.type = type;
	}
}
