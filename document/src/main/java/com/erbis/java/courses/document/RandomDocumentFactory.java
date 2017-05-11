package com.erbis.java.courses.document;

import java.util.Random;

/**
 * Document factory that creates random <code>{@link Document}</code> using predefined set of parameters
 * (like title, author etc.)
 * @author dkruglikov
 */
public class RandomDocumentFactory {
	
	private static final String[] TITLES = {"Algebra", "Algorithms", "Arithmetics", "Astrology", "Astronomy",
									"Ballistics", "Bioengineering", "Biology", "Botany",
									"Cartography", "Cryptology", "Culture"};
	private static final String[] AUTHORS = {"Isaac Nethy", "John Robinson", "Neth Carry", "Olaf Simunsson"};
	private static final Type[] TYPES = Type.values();
	private final Random random = new Random();
	
	/**
	 * Creates new random document.
	 * @return document
	 */
	public Document create() {
		String title = TITLES[random.nextInt(TITLES.length)];
		String author = AUTHORS[random.nextInt(AUTHORS.length)];
		short pageCount = (short) random.nextInt(Short.MAX_VALUE + 1);
		long creationTimestamp = System.currentTimeMillis();
		Type type = TYPES[random.nextInt(TYPES.length)];
		return new Document(title, author, pageCount, creationTimestamp, type);
	}
}
