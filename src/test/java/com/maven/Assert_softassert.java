package com.maven;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_softassert {

	@Test
	public void SoftAssert() {

		String expected = "MuthuvelPriya78";
		String actual = "MuthuvelPriya12";
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, expected);
		System.out.println("Verification");
	}
}
