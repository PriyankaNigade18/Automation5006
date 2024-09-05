package com.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo8_DependsOnMethod
{
	
	@Test(priority=1)
	public void configuration()
	{
		System.out.println("This is base test case");
	}
  @Test(priority=2)
  public void registerTest()
  {
	  System.out.println("User will register first");
	  String act="not Register!";
	  String exp="Register!";
	  AssertJUnit.assertEquals(act,exp,"TestFail: User is not register!");
	  System.out.println("TestPass:User is register");
	  
  }
  
  
  @Test(priority=3,dependsOnMethods = "registerTest")
  public void loginTest()
  {
	  System.out.println("User will login after registration");
	  
  }
  
}
