package com.TestNGFramework.Annotations;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationDemo1 
{
	
	@BeforeClass
	public void bclass()
	{
		System.out.println("Before class will run only before first testcase");
	}
	@BeforeMethod
	public void bmethod()
	{
		System.out.println("Before Method run before every test case");
	}
	
  @Test
  public void testCase1() 
  {
	  System.out.println("This is test case1");
  }
  
  @Test
  public void testCase2() 
  {
	  System.out.println("This is test case2");
  }
  
  @Test
  public void testCase3() 
  {
	  System.out.println("This is test case3");
  }
  
  @Test
  public void testCase4() 
  {
	  System.out.println("This is test case4");
  }
  
  @AfterMethod
	public void amethod()
	{
		System.out.println("After Method run after every test case");
	}
  
  @AfterClass
	public void aclass()
	{
		System.out.println("After class will run only after last testcase");
	}
  
}
