package com.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGDemo4_disableTest
{
  @Test(priority=1)
  public void verifyApplication()
  {
	 System.out.println("Application launch"); 
  }
  
  
  @Test(priority=2)
  public void verifyCurrentUrl()
  {
	 System.out.println("Application current url"); 
  }
  
  @Test(priority=3)
  public void verifyTitle()
  {
	 System.out.println("Application Title"); 
  }
  
  @Test(priority=4)
  public void verifyLogin()
  {
	 System.out.println("Application login"); 
  }
  
  @Test(priority=5,enabled=false)
  public void verifyLogout()
  {
	 System.out.println("Application logout"); 
  }
  
}
