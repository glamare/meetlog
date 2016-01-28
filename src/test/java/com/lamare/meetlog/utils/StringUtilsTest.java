package com.lamare.meetlog.utils;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void isNullorEmptyTest(){
		final boolean test1 = StringUtils.isNullorEmpty("");
		final boolean test2 = StringUtils.isNullorEmpty(null);
		final boolean test3 = StringUtils.isNullorEmpty("coucou");
		final boolean test4 = StringUtils.isNullorEmpty(" ");
		
		Assert.assertTrue(test1);
		Assert.assertTrue(test2);
		Assert.assertFalse(test3);
		Assert.assertFalse(test4);
	}
	
	@Test
	public void isNullorEmptyorEmptyTest(){
		final boolean test1 = StringUtils.isNullOrEmptyOrBlank("");
		final boolean test2 = StringUtils.isNullOrEmptyOrBlank(null);
		final boolean test3 = StringUtils.isNullOrEmptyOrBlank("coucou");
		final boolean test4 = StringUtils.isNullOrEmptyOrBlank(" ");
		
		Assert.assertTrue(test1);
		Assert.assertTrue(test2);
		Assert.assertFalse(test3);
		Assert.assertTrue(test4);
	}
}
