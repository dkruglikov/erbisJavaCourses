package com.erbis.java.courses.algorithms.structure.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.erbis.java.courses.algorithms.structure.Queue;

public class QueueImplTest {
	
	private Queue queue;
	
	@Before
	public void init() {
		queue = new QueueImpl();
	}
	
	@Test
	public void testEmptyInitially() {
		Assert.assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testEmptyOne() {
		queue.add("Foo");
		Assert.assertFalse(queue.isEmpty());
	}
	
	@Test
	public void testEmptyAfterOne() {
		queue.add("Foo");
		queue.poll();
		Assert.assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testSizeInitially() {
		Assert.assertEquals(0, queue.size());
	}
	
	@Test
	public void testSizeOne() {
		queue.add("Foo");
		Assert.assertEquals(1, queue.size());
	}
	
	@Test
	public void testSizeAfterOne() {
		queue.add("Foo");
		queue.poll();
		Assert.assertEquals(0, queue.size());
	}
	
	@Test
	public void testSizeTwo() {
		queue.add("Foo");
		queue.add("Bar");
		Assert.assertEquals(2, queue.size());
	}
	
	@Test
	public void testSizeTwoAfterOne() {
		queue.add("Foo");
		queue.add("Bar");
		queue.poll();
		Assert.assertEquals(1, queue.size());
	}
	
	@Test
	public void testSizeAfterTwo() {
		queue.add("Foo");
		queue.add("Bar");
		queue.poll();
		queue.poll();
		Assert.assertEquals(0, queue.size());
	}
	
	@Test
	public void testPollEmpty() {
		Assert.assertNull(queue.poll());
	}
	
	@Test
	public void testPollEmptyTwice() {
		queue.poll();
		Assert.assertNull(queue.poll());
	}
	
	@Test
	public void testOrder() {
		queue.add("Foo");
		queue.add("Bar");
		queue.add("Baz");
		Assert.assertEquals("Foo", queue.poll());
		Assert.assertEquals("Bar", queue.poll());
		Assert.assertEquals("Baz", queue.poll());
	}
	
	@Test
	public void testPollAfterEmptiness() {
		queue.add("Foo");
		queue.add("Bar");
		queue.add("Baz");
		queue.poll();
		queue.poll();
		queue.poll();
		Assert.assertNull(queue.poll());
	}
	
	@Test
	public void testOrderAndEmptyAfterEmptiness() {
		queue.add("Foo");
		queue.add("Bar");
		queue.add("Baz");
		Assert.assertEquals("Foo", queue.poll());
		Assert.assertEquals("Bar", queue.poll());
		Assert.assertEquals("Baz", queue.poll());
		Assert.assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testOrderAndSizeAfterEmptiness() {
		queue.add("Foo");
		queue.add("Bar");
		queue.add("Baz");
		Assert.assertEquals("Foo", queue.poll());
		Assert.assertEquals("Bar", queue.poll());
		Assert.assertEquals("Baz", queue.poll());
		Assert.assertEquals(0, queue.size());
	}
	
	@Test
	public void testOrderAndPollAfterEmptiness() {
		queue.add("Foo");
		queue.add("Bar");
		queue.add("Baz");
		Assert.assertEquals("Foo", queue.poll());
		Assert.assertEquals("Bar", queue.poll());
		Assert.assertEquals("Baz", queue.poll());
		Assert.assertNull(queue.poll());
	}
}
