package com.erbis.java.courses.document;

import java.lang.reflect.Method;
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
	
	@Test(expected = NullPointerException.class)
	public void testEqualsTrueNullProperties() {
		Document doc0 = new Document(null, null, (short) 100, 0);
		Document doc1 = new Document(null, null, (short) 100, 1);
		Assert.assertTrue(doc0.equals(doc1));
		Assert.assertTrue(doc1.equals(doc0));
	}
	
	@Test(expected = NullPointerException.class)
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
	
	@Test(expected = NullPointerException.class)
	public void testEqualsFalseNullPropertiesDiffPageCount() {
		Document doc0 = new Document(null, null, (short) 100, 0);
		Document doc1 = new Document(null, null, (short) 10, 0);
		Assert.assertFalse(doc0.equals(doc1));
		Assert.assertFalse(doc1.equals(doc0));
	}
	
	@Test
	public void testDocumentTypeTypeName() throws NoSuchMethodException {
		Method method = Document.class.getDeclaredMethod("getType", new Class<?>[0]);
		Class<?> returnType = method.getReturnType();
		Assert.assertEquals("Document type package is not same as document package", Document.class.getPackage(), returnType.getPackage());
		Assert.assertEquals("Document type name is not \"Type\"", "Type", returnType.getSimpleName());
	}
	
	@Test
	public void testDocumentTypeType() throws NoSuchMethodException {
		Method method = Document.class.getDeclaredMethod("getType", new Class<?>[0]);
		Class<?> returnType = method.getReturnType();
		Assert.assertTrue("Document type is not enum", returnType.isEnum());
	}
}
