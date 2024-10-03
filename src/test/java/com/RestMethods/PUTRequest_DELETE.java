package com.RestMethods;

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

public class PUTRequest_DELETE {
  @Test
  public void putRequest()
  {
	  //request payload
	  POJOData p1=new POJOData();
	  p1.setName("Jay");
	  p1.setJob("Engg");
	  
	  given()
	  .header("Content-Type","application/json")
	  .body(p1)
	  
	  .when()
	  	.put("https://reqres.in/api/users/2")
	  	
	  	.then()
	  	.statusCode(200)
	  	.body("name",equalTo("Jay"))
	  	.body("job", equalTo("Engg"))
	  	.log().body();
	  	
	
	  
	  
  }
  
  @Test
  public void deleteRequest()
  {
	  
	  Response res=given()
	  	
	  .when()
	  	.delete("https://reqres.in/api/users/2");
	  
	  System.out.println("Status code is: "+res.statusCode() );
	  
	  
	  
  }
}
