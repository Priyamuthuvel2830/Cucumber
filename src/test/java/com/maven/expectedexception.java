package com.maven;

import org.testng.annotations.Test;


public class expectedexception {

	@Test(expectedExceptions = ArithmeticException.class)
	public void demo() {
		// TODO Auto-generated method stub

		int i = 10;
		System.out.println(i/0);
	}
	
	
	
	
}
