package com.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo6_AssertionTest_Google {
  @Test
  public void verifyGoogleTitle()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  String actTitle=driver.getTitle();
	  String expTitle="Google";
	  
	  
	  AssertJUnit.assertEquals(actTitle, expTitle,"Test Fail: Title is not matched!");
	  System.out.println("Test Pass: Title is matched!");
	  
	  
	  
	  /*
	  if(actTitle.equals(expTitle))
	  {
		  System.out.println("Title matched...Test Pass!");
	  }else
	  {
		  System.out.println("Title not matched.....Test Fail");
	  }
	  
	 */
	  
  }
}
