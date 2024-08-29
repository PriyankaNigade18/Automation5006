package com.WebElementHandlingWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AuthenticationAlert {
  @Test
  public void authAlertTest() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  
	  System.out.println("Auth Text is: "+driver.findElement(By.tagName("p")).getText());
	  
	  
	  
  }
}
