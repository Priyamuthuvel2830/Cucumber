package com.maven;

import org.testng.annotations.Test;

public class Dependsonmethods {

	@Test
	public void ValidCredentails() {

		System.out.println("ValidCredentails");
	}
	@Test(dependsOnMethods = "ValidCredentails")
	public void Loginpage() {

		System.out.println("Loginpage");
	}
	
	
}
