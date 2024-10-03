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





public class GetRequestWithBDD
{
  @Test
  public void getSingleUser()
  {
	  given()
	  
	  .when()
	  	.get("https://reqres.in/api/users/2")
	  
	  .then()
	  	.statusCode(200)
	  	.log().all();
	  	
	   
  }
  
  
  @Test
  public void getSingleUserValidation()
  {
	 Response res= given()
	  
			 	.when()
			 	.get("https://reqres.in/api/users/2");
	  
//	  .then()
//	  	.statusCode(200)
//	  	.log().all();
	 System.out.println(res.statusCode());
	 int id=res.jsonPath().getInt("data.id");
	 System.out.println(id);
	 
	  	
	   
  }
  
  @Test
  public void getSingleUserJsonValidationUsinnHamcrest()
  {
	  given()
	  
	  .when()
	  	.get("https://reqres.in/api/users/2")
	  
	  .then()
	  	.statusCode(200)
	  	.body("data.id",equalTo(2))
	  	.body("data.first_name",equalTo("Janet"));
	  	
	   
  }
  
  @Test
  public void listOfUsers()
  {
	  //hasItems() -> Check all elements are in a collection
	  //contains() -> Check all elements are in a collection and in a strict order
	  given()
	  	.when()
	  		.get("https://reqres.in/api/users?page=2")
	  	.then()
	  	.statusCode(200)
	  	//.body("data.id",hasItems(7,8,9,10,11,12))//pass
	  	//.body("data.id",hasItems(7,8,9,10,11,12,13));//fail
	  	//.body("data.id",hasItems(10,7,9,12,8,11));//pass
	  	//.body("data.id",hasItems(7,11,12));//pass
	  	//.body("data.id",contains(7,8,9,10,11,12));//pass
	  	//.body("data.id",contains(7,8,9,10,11,12,13));//fail
	  	//.body("data.id",contains(7,10,12));//fail
	  	.body("data.id",contains(7,10,8,11,9,12));
	  System.out.println("Ids are matching!");
  }
}
