package com.restassured;

import org.testng.annotations.Test;

public class getdata {
  @Test
  Run  | Debug
  public void createdata() {
	  
	  Restassured
	  .given()
	  .log()
	  .all()
	  .headers("Content-Type","application/json");
	  .get("https://reqres.in/api/users?page=2");
	  .then()
	  .log()
	  .all();
       	  
  }
}
