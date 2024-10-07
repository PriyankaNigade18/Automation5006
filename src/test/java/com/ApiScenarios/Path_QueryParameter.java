package com.ApiScenarios;

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
public class Path_QueryParameter {
  @Test
  public void testParamaters()
  {
	  
	  
	  //https://reqres.in/api/users?page=2
	  
	  Response res=given()
	  .pathParam("path","users")
	  .queryParam("page",2)
	  
	  .when().get("https://reqres.in/api/{path}");
	  
	  System.out.println(res.asPrettyString());
  }
}
