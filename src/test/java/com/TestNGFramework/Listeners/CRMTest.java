package com.TestNGFramework.Listeners;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.TestNGFramework.Listeners.TestListerners.class)
public class CRMTest 
{
	WebDriver driver;
	
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
	}
  @Test(priority=1)
  public void testSignIn()
  {
	  driver.findElement(By.linkText("Sign In")).click();
  }
    
  @Test(priority=2)
  public void testLogin()
  {
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  	driver.findElement(By.id("submit-id")).click();
  }
  
  @Test(priority=3)
  public void testTitle()
  {
	  Assert.assertTrue(driver.getTitle().equals("Customer"),"Title is wrong");
	  System.out.println("Title is accurate!");
  }
  
  @Test(priority=4,dependsOnMethods="testTitle")
  public void testSignOut()
  {
	  driver.findElement(By.linkText("Sign Out")).click();
  }
}
