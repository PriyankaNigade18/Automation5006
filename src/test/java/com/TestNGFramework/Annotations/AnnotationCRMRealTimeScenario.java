package com.TestNGFramework.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import org.testng.annotations.Test;

public class AnnotationCRMRealTimeScenario extends BaseClass
{
	//WebDriver driver;
	
	
  @Test(priority=1)
  public void verifySignIn()
  {
	  System.out.println("Verifying SignIn link");
	  WebElement link=driver.findElement(By.linkText("Sign In"));
	  if(link.isDisplayed())
	  {
		  link.click();
	  }
	  
  }
  
  
  @Test(priority=2)
  public void validateLogin()
  {
	  System.out.println("Validation login");
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  
	  driver.findElement(By.id("password")).sendKeys("test123");
	  
	  driver.findElement(By.id("submit-id")).click();
	  
  }
  
  @Test(priority=3)
  public void verifySignOut()
  {
	  System.out.println("Verifying SignOut link");

	  WebElement signout=driver.findElement(By.linkText("Sign Out"));
	  if(signout.isDisplayed())
	  {
		  signout.click();
	  }
  }
  
  
 
}


