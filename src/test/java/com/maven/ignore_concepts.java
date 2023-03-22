package com.maven;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ignore_concepts {

	@Test
	public void briyani() {

		System.out.println("Print Briyani");
	}
	@Ignore
	@Test
	public void friedrice() {
	
		System.out.println("Fried Rice");
	}
	@Test
	public void vegfriedrice() {

		System.out.println("Veg Fried Rice");
	}
	@Test
	public void curdrice() {

		System.out.println("Curdrice");
	}
	@Test(enabled = false)
	public void lemonrice() {

		System.out.println("Lemon rice");
	}
	
}
