package com.erbis.java.courses.document.printer;

import com.erbis.java.courses.algorithms.structure.EmptyQueueException;
import com.erbis.java.courses.algorithms.structure.Queue;
import com.erbis.java.courses.document.Document;

/**
 * Document printer basic contract.
 * @author dkruglikov
 */
public interface DocumentPrinter<E extends Document> {
	
	/**
	 * Prints queue of <code>{@link com.erbis.java.courses.document.Document}</code>s.
	 * Queue may be empty after this method call.
	 * @param queue documents to print
	 * @throws EmptyQueueException 
	 */
	void print(Queue<E> queue) throws EmptyQueueException;
}
