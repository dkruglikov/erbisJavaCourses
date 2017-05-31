package com.erbis.java.courses.document.printer;

import com.erbis.java.courses.algorithms.structure.EmptyQueueException;
import com.erbis.java.courses.algorithms.structure.Queue;
import com.erbis.java.courses.algorithms.structure.impl.QueueImpl;
import com.erbis.java.courses.document.Document;
import com.erbis.java.courses.document.RandomDocumentFactory;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * Console document printer implementation.
 * @author dkruglikov
 */
public class ConsoleDocumentPrinter implements DocumentPrinter {
	
	private static final byte COUNT_DOCUMENTS = 8;
	
	/**
	 * Demo main method.
	 * @param args command line arguments
	 * @throws EmptyQueueException 
	 */
	public static void main(String[] args) throws EmptyQueueException {
	    testContains();
		RandomDocumentFactory factory = new RandomDocumentFactory();
		Queue<Document> queue = new QueueImpl<>();
		for (byte i = 0; i < COUNT_DOCUMENTS; i++) {
			queue.add(factory.create());
		}
		new ConsoleDocumentPrinter().print(queue);
	}
	// CHECKSTYLE:OFF
    @SuppressFBWarnings("NP_NULL_PARAM_DEREF_NONVIRTUAL")
	private static void testContains() {
	    Queue q = new QueueImpl(); 
	    Document doc = new Document("Jack", null, (short) 30, 0);
	    q.add(doc);
//	    Document testDoc = new Document("Jack", null, (short) 30, 0);
	    System.out.println(q.contains("Jack") ? "Contains" : "Not contains");
	}
	//CHECKSTYLE:ON

	@Override
	public void print(Queue<Document> queue) throws EmptyQueueException {
	    while (queue.size() > 0) {
	        print(queue.poll());
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
