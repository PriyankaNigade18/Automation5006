package com.TestNGFramework.TestData;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HrmLoginUsingXML 
{
@Parameters({"un","psw"})
  @Test
  public void testLogin(String un,String psw)
  {
	  //create  driver session'
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  //username
	  driver.findElement(By.name("username")).sendKeys(un);
	  
	  //password
	  driver.findElement(By.name("password")).sendKeys(psw);
	  
	  //login
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  //assertion
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail");
	  System.out.println("Login Completed!");
	  
	  
	  
	  
  }
}
