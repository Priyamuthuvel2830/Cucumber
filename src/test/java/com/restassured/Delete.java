package com.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Delete {
  @Test
  public void DataDelete() {
	  RestAssured
		 .given()
		 .log()
		 .all()
		 .headers("Content-Type","application/json")
		 .delete("https://reqres.in/api/users/2")
		 .then()
		 .log()
		 .all();
		  
	  
	  
	  
	  
	  
	  
  }
}
