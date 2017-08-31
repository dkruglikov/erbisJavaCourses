package com.erbis.java.courses.algorithms.structure.impl;

import com.erbis.java.courses.algorithms.structure.LinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings({"rawtypes", "unchecked"})
public class LinkedListImplTest {
	
    private LinkedList list;
	
	@Before
	public void init() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		list = (LinkedList) Class.forName("com.erbis.java.courses.algorithms.structure.impl.LinkedListImpl").newInstance();
	}
	
    @Test
	public void testAddIndexEmpty() {
		list.add("Foo", 0);
		Assert.assertEquals(1, list.size());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testAddIndexNegative() {
		list.add("Foo", -1);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testAddIndexGreaterToEmpty() {
		list.add("Foo", 1);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testAddIndexGreater() {
		list.add("Foo", 0);
		list.add("Bar", 2);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testAddIndex() {
		list.add("Foo", 0);
		list.add("Bar");
		list.add("Baz", 3);
	}
	
	@Test
	public void testAddIndex0() {
		list.add("Foo");
		list.add("Bar");
		list.add("Baz", 0);
		Assert.assertEquals("Baz", list.get(0));
		Assert.assertEquals("Foo", list.get(1));
		Assert.assertEquals("Bar", list.get(2));
	}
	
	@Test
	public void testAddIndex1() {
		list.add("Foo", 0);
		list.add("Bar", 1);
		list.add("Baz", 1);
		Assert.assertEquals("Foo", list.get(0));
		Assert.assertEquals("Baz", list.get(1));
		Assert.assertEquals("Bar", list.get(2));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetEmpty() {
		list.get(0);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNegativeEmpty() {
		list.get(-1);
	}
	
	@Test
	public void testGet() {
		list.add("Foo");
		list.add("Bar");
		list.add("Baz");
		Assert.assertEquals("Foo", list.get(0));
		Assert.assertEquals("Bar", list.get(1));
		Assert.assertEquals("Baz", list.get(2));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNegative() {
		list.add("Foo");
		list.get(-1);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetGreater() {
		list.add("Foo");
		list.get(1);
	}
}
