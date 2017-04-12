package com.erbis.java.courses.document.printer;

import com.erbis.java.courses.algorithms.structure.Queue;
import com.erbis.java.courses.algorithms.structure.impl.QueueImpl;
import com.erbis.java.courses.document.Document;
import com.erbis.java.courses.document.RandomDocumentFactory;

/**
 * Console document printer implementation.
 * 
 * @author dkruglikov
 */
public class ConsoleDocumentPrinter implements DocumentPrinter {

	private static final byte COUNT_DOCUMENTS = 8;

	/**
	 * Demo main method.
	 * 
	 * @param args
	 *            command line arguments
	 */
	public static void main(String[] args) {
//		testContains();
		RandomDocumentFactory factory = new RandomDocumentFactory();
		Queue queue = new QueueImpl();
		for (byte i = 0; i < COUNT_DOCUMENTS; i++) {
			queue.add(factory.create());
		}
		new ConsoleDocumentPrinter().print(queue);
	}

//	private static void testContains() {
//		Queue q = new QueueImpl();
//		Document doc = new Document("Jack", null, (short) 30, 0);
//		q.add(doc);
//		Document testDoc = new Document("Jack", null, (short) 30, 0);
//		// Document testDoc = doc;
//
//		// if (q.contains(testDoc)) {
//		// System.out.println("Contains");
//		// } else {
//		// System.out.println("Not contains");
//		// }
//		System.out.println(q.contains(testDoc) ? "Contains" : "Not contains");
//		System.out.println(q.contains("Jack") ? "Contains" : "Not contains");
//	}

	@Override
	public void print(Queue queue) {
		Object object = queue.poll();
		while (object != null) {
			if (object instanceof Document) {
				print((Document) object);
			} else {
				System.out.println(object);
			}
			object = queue.poll();
		}
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
