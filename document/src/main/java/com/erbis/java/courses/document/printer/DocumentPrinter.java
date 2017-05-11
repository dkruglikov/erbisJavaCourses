package com.erbis.java.courses.document.printer;

import com.erbis.java.courses.algorithms.structure.EmptyQueueException;
import com.erbis.java.courses.algorithms.structure.Queue;

/**
 * Document printer basic contract.
 * @author dkruglikov
 */
public interface DocumentPrinter {
	
	/**
	 * Prints queue of <code>{@link com.erbis.java.courses.document.Document}</code>s.
	 * Queue may be empty after this method call.
	 * @param queue documents to print
	 * @throws EmptyQueueException 
	 */
	void print(Queue queue) throws EmptyQueueException;
}
