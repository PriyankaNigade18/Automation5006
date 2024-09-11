package com.dataDrivenTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HrmApp
{
	//@Test(dataProvider = "mydata",dataProviderClass = CustomData.class)
  @Test(dataProvider = "exceldata",dataProviderClass = CustomData.class)
  public void tetsLogin(String un,String psw) 
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
