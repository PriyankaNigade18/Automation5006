package com.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGDemo3_invocationCount
{
  @Test(priority=1,description="test1")
  public void register() 
  {
	  System.out.println("This is register test");
  }
  
  
  
  @Test(priority=2,description="test2",invocationCount=3)
  public void login() 
  {
	  System.out.println("This is login test");
  }
  
  
  
}
