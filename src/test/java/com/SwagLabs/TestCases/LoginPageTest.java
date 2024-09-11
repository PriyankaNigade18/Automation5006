package com.SwagLabs.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwagLabs.baseTest.BaseTest;

public class LoginPageTest extends BaseTest
{
  @Test(priority=1)
  public void validateUrl() 
  {
	  String actUrl=lp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("demo"),"Url is not valid");
	  System.out.println("Url is valid!");
  }
  
  @Test(priority=2)
  public void validateTitle() 
  {
	  String actTitle=lp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Labs"),"Title is not valid");
	  System.out.println("Title is valid!");
  }
  
  @Test(priority=3)
  public void validateLogin() 
  {
	  lp.doLogin(prop.getData("un"),prop.getData("pwd"));
  }
}
