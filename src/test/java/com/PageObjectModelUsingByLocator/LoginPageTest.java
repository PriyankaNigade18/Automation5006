package com.PageObjectModelUsingByLocator;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass 
{
	
	@Test(priority=1)
	public void validateUrl()
	{  //LoginPage lp=new LoginPage(driver);
	String actUrl=lp.getUrl();
	Assert.assertTrue(actUrl.contains("login"),"Url not matched!");
	System.out.println("Url is matched!");
		
	}
	
	@Test(priority=2)
	public void validateTitle()
	{  //LoginPage lp=new LoginPage(driver);
	String actTitle=lp.getAppTitle();
	Assert.assertTrue(actTitle.contains("HRM"),"Title is not matched!");
		System.out.println("Title is matched!");
	}
	
	
  @Test(priority=3)
  public void validateLogin() 
  {
	  //LoginPage lp=new LoginPage(driver);
//	  lp.setUserName("Admin");
//	  lp.setPassword("admin123");
//	  lp.clickOnButton();
	  lp.doLogin("Admin","admin123");
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"LoginFail!");
	  System.out.println("Login Pass!");
  }
}
