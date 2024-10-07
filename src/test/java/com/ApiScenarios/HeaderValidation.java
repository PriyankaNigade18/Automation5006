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
public class HeaderValidation
{
  @Test
  public void getHeaders() 
  {
	  
	  given()
	  
	  .when().get("https://www.google.com/")
	  
	  .then()
	  .log()
	  .headers();
	  
	  
	  
	  
	  
  }
  
  @Test
  public void validateHeaders() 
  {
	  
	  Response res=given()
	  
	  .when().get("https://www.google.com/");
	  
	  String actHeader=res.getHeader("Content-Type");
	  String expHeader="text/html; charset=ISO-8859-1";
	  
	  Assert.assertEquals(actHeader,expHeader,"Test Fail: As headers are not match");
	  System.out.println("Test Pass: as Headers are match");
	  
	  
	  
	  
	  
  }
}
