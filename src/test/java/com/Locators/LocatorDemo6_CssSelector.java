package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo6_CssSelector {

	public static void main(String[] args)
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		//username-tagname with id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//password-tagname with attribute
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
		
		//login-tagname with classname
		//driver.findElement(By.cssSelector("input.submit-button")).click();
		
		driver.findElement(By.cssSelector("input#login-button.submit-button[type='submit']")).click();
	}

}
