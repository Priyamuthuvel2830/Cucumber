package com.maven;

import org.testng.annotations.Test;

public class Timeout {
@Test(timeOut = 6000)
	public void login() throws InterruptedException {

		Thread.sleep(2000);
		System.out.println("Launch Browser");
		
		Thread.sleep(2000);
		System.out.println("URL launch");
		
		Thread.sleep(1000);
		System.out.println("login");
	}
	
	
	
	
	
}
