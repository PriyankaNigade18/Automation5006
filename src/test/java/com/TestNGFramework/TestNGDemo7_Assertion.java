package com.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGDemo7_Assertion {
  @Test(enabled=false)
  public void testHardAssertion() 
  {
	  String act="Selenium WebDriver is WebUI automation library.";
	  //String exp="Selenium WebDriver is WebUI automation library/tool.";
	  String exp="tool";
	  
//	  Assert.assertEquals(act,exp,"Test Fail: Strings are not matched!");
//	  System.out.println("Test Pass: Strings matched!");
	  
//	  Assert.assertTrue(act.equals(exp),"Test Fail: Strings are not matched!");
//	  System.out.println("Test Pass: Strings matched!");
	  
	  Assert.assertFalse(act.contains(exp),"Test Fail: As tool is a part of actual string");
	  System.out.println("Test Pass: As tool is not a part of actual string");
	  
	  
	    }
  
  
  
  @Test
  public void testSoftAssetion()
  {
	  
	  int a=100,b=200;
	   
	  SoftAssert sf=new SoftAssert();
	  Assert.assertEquals(a,b,"Test Fail: Numbers are not equal");
	  System.out.println("Numbers are equal");
	  sf.assertAll();
	  
	  
	  
	  
  }
  
  
}
