package com.ApiScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

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
public class CookiesValidation {
  @Test
  public void getAllCookies()
  {
	  
	  Response res=given()
	  
	  .when().get("https://www.google.com/");
	  
	  Map<String,String> map=res.getCookies();
	  for(Map.Entry<String,String> i:map.entrySet())
	  {
		  System.out.println(i.getKey()+" : "+i.getValue());
	  }
 
	  
	  
  }
  
  @Test
  public void getAllCookiesUsingLog()
  {
	  
	  given()
	  
	  .when().get("https://www.google.com/")
	  
	  .then()
	  .log().cookies();
	  
	  
	  
	  
  }
  
  @Test
  public void validateCookies()
  {
	  
	  Response res=given()
	  
	  .when().get("https://www.google.com/");
	  
	  String actValue=res.getCookie("AEC");
	  /*
	   * As per the rule cookies are always dynamic so value
	   * will not be same
	   */
	  
	  Assert.assertFalse(actValue.contains("AVYB7crnnWzJ744mhgxfkNlAlQU8OWZu"),"Test Fail: As cookies value is same!");
	  System.out.println("Test Pass: As cookies value is different");
	  
 System.out.println(actValue);
 System.out.println("Expected: AVYB7crnnWzJ744mhgxfkNlAlQU8OWZu");
	  
	  
  }
  
}
