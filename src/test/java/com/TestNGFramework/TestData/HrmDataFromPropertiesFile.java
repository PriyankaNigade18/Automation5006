package com.TestNGFramework.TestData;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Generic.ConfigReader;

public class HrmDataFromPropertiesFile {
  @Test
  public void testHRM() 
  {
	  ConfigReader c1=new ConfigReader("config");
	  
	//create  driver session'
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(c1.getData("url"));
	  
	  //username
	  driver.findElement(By.name("username")).sendKeys(c1.getData("un"));
	  
	  //password
	  driver.findElement(By.name("password")).sendKeys(c1.getData("pwd"));
	  
	  //login
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  //assertion
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail");
	  System.out.println("Login Completed!");
	  
	  
  }
}
