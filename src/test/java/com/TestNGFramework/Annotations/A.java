package com.TestNGFramework.Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A 
{
  @Test
  public void registerTest()
  {
	  System.out.println("User is registered!");
  }
  
  @BeforeSuite
  public void bsuite()
  {
	  System.out.println("Before suite run at top level/before test");
  }
  
  @AfterSuite
  public void asuite()
  {
	  System.out.println("After suite run after test");
  }
  @BeforeTest
	public void atest()
	{
		System.out.println("Before test will run before all the classes!");
	}
}
