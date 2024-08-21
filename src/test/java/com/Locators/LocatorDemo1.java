package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1 {

	public static void main(String[] args)
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/login.html");
		
		//maximize()
		//driver.manage().window().maximize();
		
		//email-NoSuchElementException
		//driver.findElement(By.id("priyanka")).sendKeys("test@gmail.com");
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//pass
		driver.findElement(By.name("password-name")).sendKeys("test123");
		
		//check
		driver.findElement(By.id("remember")).click();
				
		//submit
		driver.findElement(By.id("submit-id")).click();
	}

}
