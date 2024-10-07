package com.ApiScenarios;

import org.testng.annotations.Test;

import com.RestMethods.POJOData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
public class Serialization_Deserialization 
{
	/*
	 * POJO---->JSON= Serialization
	 * JSON---->POJO= De-serialization
	 */
  @Test
  public void testSerialization() throws JsonProcessingException
  {
	  POJOData p1=new POJOData();
	  p1.setName("Jay");
	  p1.setJob("QA");
	  
	  ObjectMapper obj=new ObjectMapper();
	 String json=obj.writerWithDefaultPrettyPrinter().writeValueAsString(p1);
	  
	 System.out.println(json);
	  
			  
  }
  
  @Test
  public void testDeserialization() throws JsonMappingException, JsonProcessingException
  {
	  String json="{\n"
	  		+ "  \"name\" : \"Jay\",\n"
	  		+ "  \"job\" : \"QA\"\n"
	  		+ "}";
	  
	  ObjectMapper map=new ObjectMapper();
	  POJOData data=map.readValue(json,POJOData.class);
	  
	  System.out.println(data.getName());
	  System.out.println(data.getJob());
	  
	  
	  
	  
	  
	  
  }
}
