package com.PageObjectModelUsingPageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTestUsingPageFactory extends BaseClass
{
  @Test(priority=1)
  public void validateTitle() 
  {
	  String title=lp.getAppTitle();
	  Assert.assertTrue(title.contains("HRM"),"Title is wrong");
	  System.out.println("Title matched!");
  }
  
  @Test(priority=2)
  public void validateLogin() 
  {
	  lp.doLogin("Admin","admin123");
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"LoginnFail");
	  System.out.println("LoginPass");
  }
}
