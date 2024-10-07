package com.ApiScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

/*
 * given():Pre-requisite
 * ----------------------------
 * headers,cookies,path parameter+query parameter,request payload,authentication
 *  
 * when(): Set the Request
 * -----------------------------
 * GET,POST,PUT,PATCH,DELETE
 *  
 * then(): validation of response
 * -----------------------------
 * status code,message,headers,cookies,authentication,json response
 * 
 * 
 */

public class Authentication {
  @Test
  public void testBasicAuthentication()
  {
	  Response res=given()
	  .auth().basic("postman","password")
	  .when()
	  .get("https://postman-echo.com/basic-auth");
	  
	  System.out.println(res.statusCode());
	  System.out.println(res.asPrettyString());
	  
	  boolean status=res.jsonPath().getBoolean("authenticated");
	  
	  Assert.assertTrue(status==true);
	  System.out.println("Test Pass: As Authenticated is true!");
	  
	  
	  
	  
	  
	  
	  
  }
}
