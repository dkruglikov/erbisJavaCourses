package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.Queue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
	public void testAddAllSize0To0() {
		Queue queueToAdd = new QueueImpl();
		queue.addAll(queueToAdd);
		Assert.assertEquals(0, queue.size());
	}
	
	@Test
	public void testAddAllSize0To1() {
		queue.add("Foo");
		Queue queueToAdd = new QueueImpl();
		queue.addAll(queueToAdd);
		Assert.assertEquals(1, queue.size());
	}
	
	@Test
	public void testAddAllSize0To2() {
		queue.add("Foo");
		queue.add("Bar");
		Queue queueToAdd = new QueueImpl();
		queue.addAll(queueToAdd);
		Assert.assertEquals(2, queue.size());
	}
	
	@Test
	public void testAddAllSize1To0() {
		Queue queueToAdd = new QueueImpl();
		queueToAdd.add("Foo0");
		queue.addAll(queueToAdd);
		Assert.assertEquals(1, queue.size());
	}
	
	@Test
	public void testAddAllSize1To1() {
		queue.add("Foo");
		Queue queueToAdd = new QueueImpl();
		queueToAdd.add("Foo0");
		queue.addAll(queueToAdd);
		Assert.assertEquals(2, queue.size());
	}
	
	@Test
	public void testAddAllSize1To2() {
		queue.add("Foo");
		queue.add("Bar");
		Queue queueToAdd = new QueueImpl();
		queueToAdd.add("Foo0");
		queue.addAll(queueToAdd);
		Assert.assertEquals(3, queue.size());
	}
	
	@Test
	public void testAddAllSize2To0() {
		Queue queueToAdd = new QueueImpl();
		queueToAdd.add("Foo0");
		queueToAdd.add("Bar0");
		queue.addAll(queueToAdd);
		Assert.assertEquals(2, queue.size());
	}
	
	@Test
	public void testAddAllSize2To1() {
		queue.add("Foo");
		Queue queueToAdd = new QueueImpl();
		queueToAdd.add("Foo0");
		queueToAdd.add("Bar0");
		queue.addAll(queueToAdd);
		Assert.assertEquals(3, queue.size());
	}
	
	
	@Test
	public void testAddAllSize2To2() {
		queue.add("Foo");
		queue.add("Bar");
		Queue queueToAdd = new QueueImpl();
		queueToAdd.add("Foo0");
		queueToAdd.add("Bar0");
		queue.addAll(queueToAdd);
		Assert.assertEquals(4, queue.size());
	}
	
	@Test
	public void testAddAllSize2To2Same() {
		queue.add("Foo");
		queue.add("Bar");
		Queue queueToAdd = new QueueImpl();
		queueToAdd.add("Foo");
		queueToAdd.add("Bar");
		queue.addAll(queueToAdd);
		Assert.assertEquals(4, queue.size());
	}
	
	@Test
	public void testAddAllOrder0To0() {
		Queue queueToAdd = new QueueImpl();
		queue.addAll(queueToAdd);
		Assert.assertNull(queue.poll());
	}
	
	@Test
	public void testAddAllOrder0To1() {
		queue.add("Foo");
		Queue queueToAdd = new QueueImpl();
		queue.addAll(queueToAdd);
		Assert.assertEquals("Foo", queue.poll());
		Assert.assertNull(queue.poll());
	}
	
	@Test
	public void testAddAllOrder0To2() {
		queue.add("Foo");
		queue.add("Bar");
		Queue queueToAdd = new QueueImpl();
		queue.addAll(queueToAdd);
		Assert.assertEquals("Foo", queue.poll());
		Assert.assertEquals("Bar", queue.poll());
		Assert.assertNull(queue.poll());
	}
	
	@Test
	public void testAddAllOrder1To0() {
		Queue queueToAdd = new QueueImpl();
		queueToAdd.add("Foo0");
		queue.addAll(queueToAdd);
		Assert.assertEquals("Foo0", queue.poll());
		Assert.assertNull(queue.poll());
	}
	
	@Test
	public void testAddAllOrder1To1() {
		queue.add("Foo");
		Queue queueToAdd = new QueueImpl();
		queueToAdd.add("Foo0");
		queue.addAll(queueToAdd);
		Assert.assertEquals("Foo", queue.poll());
		Assert.assertEquals("Foo0", queue.poll());
		Assert.assertNull(queue.poll());
	}
	
	@Test
	public void testAddAllOrder1To2() {
		queue.add("Foo");
		queue.add("Bar");
		Queue queueToAdd = new QueueImpl();
		queueToAdd.add("Foo0");
		queue.addAll(queueToAdd);
		Assert.assertEquals("Foo", queue.poll());
		Assert.assertEquals("Bar", queue.poll());
		Assert.assertEquals("Foo0", queue.poll());
		Assert.assertNull(queue.poll());
	}
	
	@Test
	public void testAddAllOrder2To0() {
		Queue queueToAdd = new QueueImpl();
		queueToAdd.add("Foo0");
		queueToAdd.add("Bar0");
		queue.addAll(queueToAdd);
		Assert.assertEquals("Foo0", queue.poll());
		Assert.assertEquals("Bar0", queue.poll());
		Assert.assertNull(queue.poll());
	}
	
	@Test
	public void testAddAllOrder2To1() {
		queue.add("Foo");
		Queue queueToAdd = new QueueImpl();
		queueToAdd.add("Foo0");
		queueToAdd.add("Bar0");
		queue.addAll(queueToAdd);
		Assert.assertEquals("Foo", queue.poll());
		Assert.assertEquals("Foo0", queue.poll());
		Assert.assertEquals("Bar0", queue.poll());
		Assert.assertNull(queue.poll());
	}
	
	
	@Test
	public void testAddAllOrder2To2() {
		queue.add("Foo");
		queue.add("Bar");
		Queue queueToAdd = new QueueImpl();
		queueToAdd.add("Foo0");
		queueToAdd.add("Bar0");
		queue.addAll(queueToAdd);
		Assert.assertEquals("Foo", queue.poll());
		Assert.assertEquals("Bar", queue.poll());
		Assert.assertEquals("Foo0", queue.poll());
		Assert.assertEquals("Bar0", queue.poll());
		Assert.assertNull(queue.poll());
	}
	
	@Test
	public void testAddAllOrder2To2Same() {
		queue.add("Foo");
		queue.add("Bar");
		Queue queueToAdd = new QueueImpl();
		queueToAdd.add("Foo");
		queueToAdd.add("Bar");
		queue.addAll(queueToAdd);
		Assert.assertEquals("Foo", queue.poll());
		Assert.assertEquals("Bar", queue.poll());
		Assert.assertEquals("Foo", queue.poll());
		Assert.assertEquals("Bar", queue.poll());
		Assert.assertNull(queue.poll());
	}
	
	@Test
	public void testAddAllStabilitySize() {
		queue.add("Foo");
		queue.add("Bar");
		Queue queueToAdd = new QueueImpl();
		queueToAdd.add("Foo0");
		queueToAdd.add("Bar0");
		queue.addAll(queueToAdd);
		queueToAdd.add("Baz0");
		Assert.assertEquals(4, queue.size());
	}
	
	@Test
	public void testAddAllStabilityOrder() {
		queue.add("Foo");
		queue.add("Bar");
		Queue queueToAdd = new QueueImpl();
		queueToAdd.add("Foo0");
		queueToAdd.add("Bar0");
		queue.addAll(queueToAdd);
		queueToAdd.add("Baz0");
		Assert.assertEquals("Foo", queue.poll());
		Assert.assertEquals("Bar", queue.poll());
		Assert.assertEquals("Foo0", queue.poll());
		Assert.assertEquals("Bar0", queue.poll());
		Assert.assertNull(queue.poll());
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
	
	@Test
	public void testNotContainsEmpty() {
		Assert.assertFalse(queue.contains("Foo"));
	}
	
	@Test
	public void testContainsOne() {
		queue.add("Foo");
		Assert.assertTrue(queue.contains("Foo"));
	}
	
	@Test
	public void testNotContainsOne() {
		queue.add("Foo");
		Assert.assertFalse(queue.contains("Bar"));
	}
	
	@Test
	public void testContainsTwo0() {
		queue.add("Foo");
		queue.add("Bar");
		Assert.assertTrue(queue.contains("Foo"));
	}
	
	@Test
	public void testContainsTwo1() {
		queue.add("Foo");
		queue.add("Bar");
		Assert.assertTrue(queue.contains("Bar"));
	}
	
	@Test
	public void testContainsTwoSame() {
		queue.add("Foo");
		queue.add("Foo");
		Assert.assertTrue(queue.contains("Foo"));
	}
	
	@Test
	public void testNotContainsTwo() {
		queue.add("Foo");
		queue.add("Bar");
		Assert.assertFalse(queue.contains("Baz"));
	}
	
	@Test
	public void testNotContainsTwoSame() {
		queue.add("Foo");
		queue.add("Foo");
		Assert.assertFalse(queue.contains("Baz"));
	}
	
	@Test
	public void testContainsThree0() {
		queue.add("Foo");
		queue.add("Bar");
		queue.add("Baz");
		Assert.assertTrue(queue.contains("Foo"));
	}
	
	@Test
	public void testContainsThree1() {
		queue.add("Foo");
		queue.add("Bar");
		queue.add("Baz");
		Assert.assertTrue(queue.contains("Bar"));
	}
	
	@Test
	public void testContainsThree2() {
		queue.add("Foo");
		queue.add("Bar");
		queue.add("Baz");
		Assert.assertTrue(queue.contains("Baz"));
	}
	
	@Test
	public void testNotContainsThree() {
		queue.add("Foo");
		queue.add("Bar");
		queue.add("Baz");
		Assert.assertTrue(queue.contains("Boo"));
	}
	
	@Test
	public void testContainsThreeSame() {
		queue.add("Foo");
		queue.add("Foo");
		queue.add("Foo");
		Assert.assertTrue(queue.contains("Foo"));
	}
	
	@Test
	public void testNotContainsThreeSame() {
		queue.add("Foo");
		queue.add("Foo");
		queue.add("Foo");
		Assert.assertTrue(queue.contains("Boo"));
	}
}
