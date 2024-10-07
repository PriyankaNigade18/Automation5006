package com.RestMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GETWithNonBDD {
  @Test
  public void getSingleUserDetails()
  {
	  RestAssured.baseURI="https://reqres.in/api";//baseURI
	  
	  Response res=RestAssured.get("/users/2");//resource
	  int statuscode=res.getStatusCode();
	  Assert.assertEquals(statuscode,200,"status code is not matching!");
	  System.out.println("Status code is matched!: "+statuscode);
	  
	  System.out.println("Status Line: "+res.getStatusLine());
	  
	  System.out.println("*********Response in String***************");
	  System.out.println(res.asString());
	  
	  System.out.println("********Response in Formatted like Json**********");
	  System.out.println(res.asPrettyString());
	  
	  System.out.println("Time for Response: "+res.getTime());
	  System.out.println("Time in milliseconds:"+res.getTimeIn(TimeUnit.MILLISECONDS));
	  
	  System.out.println(res.getHeader("Content-Type"));
	  
	  
	  
  }
  @Test 
  public void validateSingleUser()
  {
	  RestAssured.baseURI="https://reqres.in/api";
	  
	  Response res=RestAssured.get("/users/2");
	  
	  int id=res.jsonPath().getInt("data.id");
	  System.out.println("Id is: "+id);
	  
	  
	  String email=res.jsonPath().getString("data.email");
	 
	  Assert.assertEquals(email,"janet.weaver@reqres.in");
	  System.out.println("Email id is: "+email);
	  
	  
	  
	  
  }
  
  @Test
  public void getListOfUsers()
  {
	  
	  RestAssured.baseURI="https://reqres.in/api";
	  
	  Response res=RestAssured.get("/users?page=2");
	  
	  System.out.println(res.asPrettyString());
	  
	  //list of ids
	  List<Integer> listOfId=res.jsonPath().getList("data.id");
	  System.out.println("Total Id's are: "+listOfId.size());
	  
	  for(Integer i:listOfId)
	  {
		  System.out.println(i);
	  }
	  
	  List<String> allEmails=res.jsonPath().getList("data.email");
	  System.out.println("Total Emails are: "+allEmails.size());
	  for(String i:allEmails)
	  {
		  System.out.println(i);
	  }
	  
	  
	 }
  
  @Test
  public void createUser_Post()
  {
	  
	  RestAssured.baseURI="https://reqres.in/api";
	  //request specification
	   RestAssured.given()
	   .contentType("application/json")
	   .body("{\n"
	 		+ "    \"name\": \"morpheus\",\n"
	 		+ "    \"job\": \"leader\"\n"
	 		+ "}");
	  Response res=RestAssured.post("/users");
	  System.out.println("Status code is: "+res.getStatusCode());
	  
	  
	  
  }
  
}
