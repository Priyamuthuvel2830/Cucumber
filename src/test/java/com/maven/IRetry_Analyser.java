package com.maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IRetry_Analyser {

	@Test
	public void username() {

		String exp = "Priya";
		String act = "Priya";
		Assert.assertEquals(act, exp);
		
	}
	@Test(retryAnalyzer = Rerun.class)
	public void password() {

		String exp = "muthu";
		String act = "Priya";
		Assert.assertEquals(act, exp);
		
	}
	
	
	
	
	
}
