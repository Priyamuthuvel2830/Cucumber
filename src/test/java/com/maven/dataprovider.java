package com.maven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class dataprovider {

	@Test(dataProvider = "input")
	public void login(String Username , String Password ) {

		System.out.println("Username is :" +Username);
		System.out.println("Password is :" +Password);

	
	
	}
	
	
	@DataProvider
	public Object[][] input() {

		return new Object[][] {
			
			{"yth","987"},{"hgf","096"},{"dse","876"}
			
		};
	}
}
