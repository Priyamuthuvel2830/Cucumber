package com.restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class valueupdate {
  @Test
  public void f() {
	  RestAssured.baseURI="https://reqres.in/api/users/2";
	  RequestSpecification given = RestAssured.given();
	  JSONObject obj = new JSONObject();
	  obj.put("name","Muthu");
	  obj.put("job","tester trainee");
	  given.header("Content-Type","application/json");
	  given.body(obj.toJSONString());
	  Response put = given.put("https://reqres.in/api/users/2");
	  System.out.println(put.getStatusCode());
	  System.out.println("*** User Updated ****");
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
