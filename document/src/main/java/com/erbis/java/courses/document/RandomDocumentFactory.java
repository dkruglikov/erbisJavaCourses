package com.erbis.java.courses.document;

import java.util.Random;

public class RandomDocumentFactory {

    private static final String[] TITLES = {"Algebra", "Algorithms", "Arithmetics", "Astrology", "Astronomy",
            "Ballistics", "Bioengineering", "Biology", "Botany",
            "Cartography", "Cryptology", "Culture"};
    private static final String[] AUTHORS = {"Isaac Nethy", "John Robinson", "Neth Carry", "Olaf Simunsson"};
    private static final String[] TYPES = {"Mathematics", "Others", "Philosophy", "Sport"};
    private Random random = new Random();

    public Document create() {
        String title = TITLES[random.nextInt(TITLES.length)];
        String author = AUTHORS[random.nextInt(AUTHORS.length)];
        short pageCount = (short) random.nextInt(Short.MAX_VALUE + 1);
        long creationTimestamp = System.currentTimeMillis();
        String type = TYPES[random.nextInt(TYPES.length)];
        Document document = new Document(title, author, pageCount, creationTimestamp, type);
        return document;
    }
}
