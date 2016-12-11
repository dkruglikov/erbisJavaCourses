package com.erbis.java.courses.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
	
	@Test
	public void testGetMostRepeatableCharOnly() {
		Assert.assertEquals('c', StringUtil.getMostRepeatableChar("c"));
	}
	
	@Test
	public void testGetMostRepeatableCharSame() {
		Assert.assertEquals('c', StringUtil.getMostRepeatableChar("ccc"));
	}
	
	@Test
	public void testGetMostRepeatableChar() {
		Assert.assertEquals('b', StringUtil.getMostRepeatableChar("Baobab"));
	}
	
	@Test
	public void testGetCharCountEmpty() {
		Assert.assertEquals(0, StringUtil.getCharCount(""));
	}
	
	@Test
	public void testGetCharCountOnly() {
		Assert.assertEquals(1, StringUtil.getCharCount("R"));
	}
	
	@Test
	public void testGetCharCountSame() {
		Assert.assertEquals(4, StringUtil.getCharCount("    "));
	}
	
	@Test
	public void testGetCharCount() {
		Assert.assertEquals(16, StringUtil.getCharCount("Test me, please!"));
	}
	
	@Test
	public void testGetLongestWordEmpty() {
		Assert.assertEquals("", StringUtil.getLongestWord(""));
	}
	
	@Test
	public void testGetLongestWordOnly() {
		Assert.assertEquals("Foo", StringUtil.getLongestWord("Foo"));
	}
	
	@Test
	public void testGetLongestWordEqualLength() {
		Assert.assertEquals("Foo", StringUtil.getLongestWord("Foo  Bar  Baz"));
	}
	
	@Test
	public void testGetLongestWord() {
		Assert.assertEquals("theory!", StringUtil.getLongestWord("Foo  Bar  Baz It is just a theory!"));
	}
	
	@Test
	public void testGetLastCharOnly() {
		Assert.assertEquals('c', StringUtil.getLastChar("c"));
	}
	
	@Test
	public void testLastCharSame() {
		Assert.assertEquals('c', StringUtil.getLastChar("ccc"));
	}
	
	@Test
	public void testGetLastChar() {
		Assert.assertEquals(' ', StringUtil.getMostRepeatableChar("Just a bubble gum "));
	}
}
