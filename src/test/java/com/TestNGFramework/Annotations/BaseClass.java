package com.TestNGFramework.Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		 driver=new ChromeDriver();
		 driver.get("https://automationplayground.com/crm/");
	}
	
	@BeforeMethod
	public void getUrl()
	{
		System.out.println("Current url: "+driver.getCurrentUrl());
	}
	
	
	@AfterMethod
	public void getApptitle()
	{
		System.out.println("Title of page is: "+driver.getTitle());
	}
	
	 @AfterClass
	  public void tearDown()
	  {
		  driver.quit();
	  }
	

}
