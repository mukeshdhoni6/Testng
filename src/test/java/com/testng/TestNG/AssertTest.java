package com.testng.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {
	
	@Test
	private void demo() {
		
		String expected = "James";
		String actual = "Jason";
		
		Assert.assertNotEquals(actual, expected);
		
		System.out.println("Data Validation");
	}
	

}
