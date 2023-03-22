package com.maven;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterized {
	
@Test

@Parameters({"Username" , "Password"})
public void login(@Optional("xyz")String Username , @Optional("987") String Password) {

	System.out.println("Username is :" +Username);
	System.out.println("Password is :" +Password);
}





}




