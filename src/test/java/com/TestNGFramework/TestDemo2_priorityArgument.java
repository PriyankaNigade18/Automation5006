package com.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo2_priorityArgument {
  @Test(priority=1)
  public void register()
  {
	  System.out.println("Open Browser to test register application");
  }
  
  @Test(priority=2)
  public void login()
  {
	  System.out.println("Test login functionality");

  }
  
  @Test(priority=3)
  public void addToCart()
  {
	  System.out.println("Test Add to cart functionality");

  }
  
  @Test(priority=4)
  public void logout()
  {
	  System.out.println("Test logout functionality");

  }
}
