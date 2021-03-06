package com.erbis.java.courses.document.printer;

import com.erbis.java.courses.algorithms.structure.Queue;
import com.erbis.java.courses.algorithms.structure.impl.QueueImpl;
import com.erbis.java.courses.document.Document;
import com.erbis.java.courses.document.RandomDocumentFactory;

/**
 * Console document printer implementation.
 * @author dkruglikov
 */
public class ConsoleDocumentPrinter implements DocumentPrinter {
	
	private static final byte COUNT_DOCUMENTS = 8;
	
	/**
	 * Demo main method.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		RandomDocumentFactory factory = new RandomDocumentFactory();
		Queue<Document> queue = new QueueImpl<>();
		for (byte i = 0; i < COUNT_DOCUMENTS; i++) {
			queue.add(factory.create());
		}
		new ConsoleDocumentPrinter().print(queue);
	}

	@Override
	public void print(Queue<Document> queue) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	private void print(Document document) {
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
