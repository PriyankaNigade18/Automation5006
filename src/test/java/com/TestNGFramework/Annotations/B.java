package com.TestNGFramework.Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class B 
{
	@Test
	  public void loginTest()
	  {
		  System.out.println("User is login!");
	  }
	
	@AfterTest
	public void atest()
	{
		System.out.println("After test will run after all the classes!");
	}
}
