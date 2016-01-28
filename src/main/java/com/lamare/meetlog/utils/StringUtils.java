package com.lamare.meetlog.utils;

public class StringUtils {
	
	/**
	 * Checks if is null or empty.
	 *
	 * @param stringToTest the string to test
	 * @return true, if is nullor empty
	 */
	public static boolean isNullorEmpty(String stringToTest) {
		return stringToTest == null || org.springframework.util.StringUtils.isEmpty(stringToTest);
	}
	
	public static boolean isNullOrEmptyOrBlank(String stringToTest) {
		return stringToTest == null || org.springframework.util.StringUtils.isEmpty(stringToTest) || !org.springframework.util.StringUtils.hasText(stringToTest);
	}
}
