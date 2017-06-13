package com.erbis.java.courses.document.printer;

import com.erbis.java.courses.document.Document;
import com.erbis.java.courses.document.QueueDocument;
import com.erbis.java.courses.document.RandomDocumentFactory;

/**
 * Console document printer implementation.
 * @author dkruglikov
 */
public class ConsoleDocumentPrinter<T extends Document> implements DocumentPrinter<T> {
	
	private static final byte COUNT_DOCUMENTS = 8;
	
	/**
	 * Demo main method.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		RandomDocumentFactory factory = new RandomDocumentFactory();
		QueueDocument<Document> queue = new QueueDocument<>();
		for (byte i = 0; i < COUNT_DOCUMENTS; i++) {
			queue.add(factory.create());
		}
		new ConsoleDocumentPrinter<Document>().print(queue);
	}

	@Override
	public void print(QueueDocument<T> queue) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public void print(Document document) {
		System.out.print("Title: ");
		System.out.print(document.getTitle());
		System.out.print("\tAuthor: ");
		System.out.print(document.getAuthor());
		System.out.print("\tType: ");
		System.out.print(document.getType());
		System.out.print("\tPages: ");
		System.out.println(document.getPageCount());
	}	
}
