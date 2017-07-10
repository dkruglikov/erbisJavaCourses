package com.erbis.java.courses.document;

import org.junit.Test;

import com.erbis.java.courses.algorithms.structure.EmptyQueueException;
import com.erbis.java.courses.algorithms.structure.Queue;
import com.erbis.java.courses.algorithms.structure.impl.QueueImpl;

public class DocumentWildcardTestOlga {

	@Test 
	public void testDocumentQueue() {
		Queue<? extends Document> d = new QueueImpl<Document>();
		d = new QueueImpl<ElectronicDocument>();

		Queue<ElectronicDocument> d1 = new QueueImpl<ElectronicDocument>();
		
		Queue<Document> d2 = new QueueImpl<Document>();
		
		printAuthors(d);
		printAuthors(d1);
		printAuthors(d2);
	}
	
	public void printAuthors(Queue<? extends Document> documentsList) {
		while (true) {
			try {
				System.out.println(documentsList.poll().getAuthor());	
			} catch (EmptyQueueException ex) {
				return;
			}
			
		}
	}
}
