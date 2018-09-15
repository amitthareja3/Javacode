package com.java.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.java.pages.AnagramCheck;

public class StringAnagramTest {

	@Test
	public void testIsAnagramValidCredintials() 
	{
		Assert.assertTrue(AnagramCheck.isAnagram("word", "wrdo"));
		Assert.assertTrue(AnagramCheck.isAnagram("stop", "tops"));
		Assert.assertTrue(AnagramCheck.isAnagram("mary", "army"));
		Assert.assertTrue(AnagramCheck.isAnagram("boat", "btoa"));
		Assert.assertTrue(AnagramCheck.isAnagram("a", "a"));

}
	@Test
	public void testIsAnagramInvalidCredintials() 
	{
		Assert.assertFalse(AnagramCheck.isAnagram("fill", "fil"));
		Assert.assertFalse(AnagramCheck.isAnagram("b", "bbb"));
		Assert.assertFalse(AnagramCheck.isAnagram("ccc", "ccccccc"));
		Assert.assertFalse(AnagramCheck.isAnagram("pure", "in"));
		Assert.assertFalse(AnagramCheck.isAnagram("sleep", "slep"));
	}
	
}