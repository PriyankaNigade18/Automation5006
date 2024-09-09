package com.TestNGFramework.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GeneralTestForCRM {
  @Test
  public void testCRM() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://automationplayground.com/crm/");
	  
	  WebElement link=driver.findElement(By.linkText("Sign In"));
	  if(link.isDisplayed())
	  {
		  link.click();
	  }
	  
	  //login page
	  
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  
	  driver.findElement(By.id("password")).sendKeys("test123");
	  
	  driver.findElement(By.id("submit-id")).click();
	  
	  //signout
	  WebElement signout=driver.findElement(By.linkText("Sign Out"));
	  if(signout.isDisplayed())
	  {
		  signout.click();
	  }
  }
}
