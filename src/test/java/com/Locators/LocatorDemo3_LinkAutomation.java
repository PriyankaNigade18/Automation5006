package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3_LinkAutomation {

	public static void main(String[] args)
	{

		//create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/");
		
		//signIn link
		//driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.partialLinkText("Sign")).click();
	}

}
