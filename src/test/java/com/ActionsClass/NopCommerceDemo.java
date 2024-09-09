package com.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NopCommerceDemo {
  @Test
  public void testRegister() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	  
	  driver.findElement(By.xpath("//a[text()='Register']")).click();
	  
	  driver.findElement(By.id("gender-female")).click();
	  driver.findElement(By.id("FirstName")).sendKeys("Priyanka");
	  driver.findElement(By.id("LastName")).sendKeys("Nigade");
	  driver.findElement(By.id("Email")).sendKeys("test1818@gmail.com");
	  driver.findElement(By.id("Password")).sendKeys("test123");
	  driver.findElement(By.id("ConfirmPassword")).sendKeys("test123");
	  driver.findElement(By.id("register-button")).click();
	  
	  
	  
  }
}
