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
  
  @Test
  public void testDigestAuth()
  {
	  Response res=given()
	  .auth().digest("postman","password")
	  .when()
	  .get("https://postman-echo.com/digest-auth");
	  
	  System.out.println(res.asPrettyString());
	  System.out.println("Status is: "+res.jsonPath().getBoolean("authenticated"));
	  
	 }
  
  @Test
  public void testBearerToken()
  {
	  Response res=given()
	  .header("Authorization","Bearer 181818")
	  
	  .when()
	  .get("https://postman-echo.com");
	  
	int actCode=res.statusCode();
	Assert.assertEquals(actCode,200);
	System.out.println("Authentication success");
	System.out.println(res.asPrettyString());
	  
  }
  
  @Test
  public void testOAuth2()
  {
	  
	  Response res=given()
	  .auth().oauth2("7777777")
	  .when()
	  .get("https://postman-echo.com");
	  
	  System.out.println(res.statusCode());
	  
	  
  }
}
