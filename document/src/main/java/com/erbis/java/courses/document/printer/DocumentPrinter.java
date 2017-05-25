package com.erbis.java.courses.document.printer;

import com.erbis.java.courses.document.Document;
import com.erbis.java.courses.document.QueueDocument;

/**
 * Document printer basic contract.
 * @author dkruglikov
 */
public interface DocumentPrinter {
	
	/**
	 * Prints queue of <code>{@link com.erbis.java.courses.document.Document}</code>s.
	 * Queue may be empty after this method call.
	 * @param queue documents/ to print
	 */
	void print(QueueDocument<? extends Document> queue);
}
