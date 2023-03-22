package com.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Newgetdata {
  @Test
  public void Getallusers() {
	 RestAssured
	 .given()
	 .log()
	 .all()
	 .headers("Content-Type","application/json")
	 .get("https://reqres.in/api/users")
	 .then()
	 .log()
	 .all();
	  
  }
}
