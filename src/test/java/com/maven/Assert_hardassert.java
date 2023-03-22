package com.maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_hardassert {

	@Test
	public void hardassert() {

		
		String expected = "MuthuvelPriya";
		String actual = "MuthuvelPriya";
		Assert.assertEquals(expected, actual);
		System.out.println("Validation");
	}
	
	
	
	
}
