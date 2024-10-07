package com.RestMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestPojo.Authentication;
import com.TestPojo.Booking;
import com.TestPojo.BookingDates;

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
public class TestBookingAPIS
{
	String tokenid;
	int id;
  @Test(priority=1)
  public void createToken()
  {
	  Authentication auth=new Authentication("admin","password123");
//	  auth.setUsername("admin");
//	  auth.setPassword("password123");
	  
	 Response res=given()
	  .header("Content-Type","application/json")
	  .body(auth)
	  /*.body("{\n"
	  		+ "    \"username\" : \"admin\",\n"
	  		+ "    \"password\" : \"password123\"\n"
	  		+ "}")*/
	  
	  .when()
	  .post("https://restful-booker.herokuapp.com/auth");
	 
	 
	 Assert.assertEquals(res.statusCode(),200,"Status code not matched!");
	 System.out.println("Status code is: "+res.statusCode());
	 
	tokenid=res.jsonPath().getString("token");
	 
	 System.out.println("Token is: "+tokenid);
	  
	    }
  
  @Test(priority=2)
  public void createBooking()
  {
	  BookingDates date=new BookingDates("2024-10-07", "2024-10-08");
	  Booking br=new Booking("Priyanka","Nigade",999, false, "dinner", date);
	  
	  Response res=given()
	  .header("Content-Type","application/json")
	  .body(br)
	  
	  /*.body("{\n"
	  		+ "    \"firstname\" : \"Priyanka\",\n"
	  		+ "    \"lastname\" : \"Nigade\",\n"
	  		+ "    \"totalprice\" : 999,\n"
	  		+ "    \"depositpaid\" : true,\n"
	  		+ "    \"bookingdates\" : {\n"
	  		+ "        \"checkin\" : \"2024-10-07\",\n"
	  		+ "        \"checkout\" : \"2024-10-08\"\n"
	  		+ "    },\n"
	  		+ "    \"additionalneeds\" : \"Breakfast\"\n"
	  		+ "}")*/
	  .when()
	  .post("https://restful-booker.herokuapp.com/booking");
	  System.out.println("Status code : "+res.statusCode());
	  
	  id= res.jsonPath().getInt("bookingid");
	 System.out.println("Booking id is: "+id);
	 
	 System.out.println(res.asPrettyString());
	  
  }
  
  @Test(priority=3,dependsOnMethods = "createBooking")
  public void getBooking()
  {
	  System.out.println("*********Get Booking for Same Id***********");
	  
	  Response res=given()
	  
	  .when()
	  .get("https://restful-booker.herokuapp.com/booking/"+id);
	  System.out.println("Status code: "+res.statusCode());
	  System.out.println(res.asPrettyString());
	  
  }
  @Test(priority=4,dependsOnMethods = "createToken")
  public void partialUpdate() {
	  
	  System.out.println("Partial Update for id: "+id);
	  Response res=given()
	  .header("Content-Type","application/json")
	  .header("Accept","application/json")
	  .header("Cookie","token="+tokenid)
	  .body("{\n"
	  		+ "    \"firstname\" : \"Sumit\",\n"
	  		+ "    \"lastname\" : \"Sharma\"\n"
	  		+ "}")
	  
	  .when()
	  .patch("https://restful-booker.herokuapp.com/booking/"+id);
	  
	  
	  System.out.println("status code: "+res.statusCode());
	  
	  System.out.println(res.asPrettyString());
	  
	  
	  
  }
}
