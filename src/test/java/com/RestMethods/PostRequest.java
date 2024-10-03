package com.RestMethods;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

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
 * POST Request
 * ===============
 * 1.POJO: plain old java object class :Encapsulation
 * 2.Using Map
 * 
 */

public class PostRequest
{
  @Test
  public void PostWithMap()
  {
	  //request payload
	  HashMap<String,Object> map=new HashMap<String,Object>();
	  map.put("name","Priyanka");
	  map.put("job","SDET");
	  
	  
	  int id=given()
	  .header("Content-Type","application/json")
	  .body(map)
	  
	  .when()
	  	.post("https://reqres.in/api/users")
	  	.jsonPath().getInt("id");
	  
	  System.out.println("Id is: "+id);
	  	
//	  	.then()
//	  	.statusCode(201)
//	  	.log().body();
	  
	  
	  
  }
  
  
  
  @Test
  public void PostWithMapFullResponse()
  {
	  //request payload
	  HashMap<String,Object> map=new HashMap<String,Object>();
	  map.put("name","Priyanka");
	  map.put("job","SDET");
	  
	  
	  Response res=given()
	  .header("Content-Type","application/json")
	  .body(map)
	  
	  .when()
	  	.post("https://reqres.in/api/users");
	  	
	  System.out.println("Status code: "+res.statusCode());
	  System.out.println("Id is: "+res.jsonPath().getInt("id"));
	  
	  String username=res.jsonPath().getString("name");
	  System.out.println("Username is: "+username);
	  
	  String job=res.jsonPath().getString("job");	
	  System.out.println("Job is: "+job);
//	  	.then()
//	  	.statusCode(201)
//	  	.log().body();
	  
	  
	  
  }
  
  //POJO class
  @Test
  public void postRequestWithPOJO()
  {
	  //request payload using pojo
	  POJOData p1=new POJOData();
	  p1.setName("Sarang");
	  p1.setJob("QA");
	  
	  
 Response res=given()
	  .header("Content-Type","application/json")
	  .body(p1)
	  
	  .when()
	  .post("https://reqres.in/api/users");
	  
	  System.out.println("Status code: "+res.statusCode());
	  System.out.println("New user created with Id: "+res.jsonPath().getInt("id"));
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
  
  
  
}
