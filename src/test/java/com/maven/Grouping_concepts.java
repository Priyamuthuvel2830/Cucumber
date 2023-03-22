package com.maven;

import org.testng.annotations.Test;

public class Grouping_concepts {
@Test(groups = "Fruits")
public void mango() {

	System.out.println("Mango");
}
@Test(groups = "Fruits")
public void papaya() {

	System.out.println("papaya");
}
@Test(groups = "Fruits")
public void sapotta() {

	System.out.println("sapotta");
}
@Test(groups = "Fruits")
public void apple() {
 System.out.println("apple");
}
@Test(groups = "Vegetables")	
public void potato() {

	System.out.println("potato");
}
@Test(groups = "Vegetables")
public void cabbage() {

	System.out.println("cabbage");
}
@Test(groups = "Vegetables")
public void carrot() {

	System.out.println("carrot");
}
@Test(groups = "Flowers")	
public void rose() {

	System.out.println("rose");
}	
@Test(groups = "Flowers")	
	public void lilly() {

		System.out.println("lilly");
	}
	
		
}
