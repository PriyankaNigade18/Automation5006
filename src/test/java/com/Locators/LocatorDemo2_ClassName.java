package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2_ClassName {

	public static void main(String[] args)
	{

		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/login.html");
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.className("btn")).click();
		
		
		/*
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		//email
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		
		//button-InvalidSelectorException: Compound class names not permitted
		//driver.findElement(By.className("btn btn-primary")).click();
		
		//login -->cssSelector
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		*/
		
	}

}
