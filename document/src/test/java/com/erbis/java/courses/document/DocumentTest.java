package com.erbis.java.courses.document;

import org.junit.Assert;
import org.junit.Test;

public class DocumentTest {
	
	@Test
	public void testEqualsSelf() {
		Document doc = new Document("The oldman and the sea", "Ernest Hemingway", (short) 100, 0);
		Assert.assertTrue(doc.equals(doc));
	}
	
	@Test
	public void testEqualsNull() {
		Document doc = new Document("The oldman and the sea", "Ernest Hemingway", (short) 100, 0);
		Assert.assertFalse(doc.equals(null));
	}
	
	@Test
	public void testEqualsTrue() {
		Document doc0 = new Document("The oldman and the sea", "Ernest Hemingway", (short) 100, 0);
		Document doc1 = new Document("The oldman and the sea", "Ernest Hemingway", (short) 100, 0);
		Assert.assertTrue(doc0.equals(doc1));
		Assert.assertTrue(doc1.equals(doc0));
	}
	
	@Test
	public void testEqualsTrueDiffTimestamps() {
		Document doc0 = new Document("The oldman and the sea", "Ernest Hemingway", (short) 100, 0, "Mathematics");
		Document doc1 = new Document("The oldman and the sea", "Ernest Hemingway", (short) 100, 1, "Sport");
		Assert.assertTrue(doc0.equals(doc1));
		Assert.assertTrue(doc1.equals(doc0));
	}
	
	@Test
	public void testEqualsTrueNullProperties() {
		Document doc0 = new Document(null, null, (short) 100, 0);
		Document doc1 = new Document(null, null, (short) 100, 1);
		Assert.assertTrue(doc0.equals(doc1));
		Assert.assertTrue(doc1.equals(doc0));
	}
	
	@Test
	public void testEqualsTrueNullPropertiesDiffTimestamp() {
		Document doc0 = new Document(null, null, (short) 100, 0, "Sport");
		Document doc1 = new Document(null, null, (short) 100, 1, "Mathematics");
		Assert.assertTrue(doc0.equals(doc1));
		Assert.assertTrue(doc1.equals(doc0));
	}
	
	@Test
	public void testEqualsFalse() {
		Document doc0 = new Document("The oldman and the sea", "Ernest Hemingway", (short) 100, 0);
		Document doc1 = new Document("THe oldman and the sea", "Ernest Hemingway", (short) 100, 0);
		Assert.assertFalse(doc0.equals(doc1));
		Assert.assertFalse(doc1.equals(doc0));
	}
	
	@Test
	public void testEqualsFalseNullProperties() {
		Document doc0 = new Document("The oldman and the sea", "Ernest Hemingway", (short) 100, 0);
		Document doc1 = new Document(null, "Ernest Hemingway", (short) 100, 0);
		Assert.assertFalse(doc0.equals(doc1));
		Assert.assertFalse(doc1.equals(doc0));
	}
}