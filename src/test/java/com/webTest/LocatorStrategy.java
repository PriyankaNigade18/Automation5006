package com.webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategy {

	public static void main(String[] args) 
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//search box
		/*
		//Strategy 1: By Locator 
		//To get address of search box
		By searchBox=By.id("APjFqb");
		
		//To identify WebElement
		driver.findElement(searchBox).sendKeys("Java");
		*/
		//Strategy 2: IdentifyElement +perform action
		//driver.findElement(By.id("APjFqb")).sendKeys("TestNg");
		
		//Strategy 3: IdentifyElement + validation+ perform action
		WebElement ele=driver.findElement(By.id("APjFqb"));
		System.out.println("Is SearchBox is displayed?: "+ele.isDisplayed());
		System.out.println("Is Searchbox is enabled?: "+ele.isEnabled());
		
		if(ele.isDisplayed() && ele.isEnabled())
		{
			ele.sendKeys("selenium",Keys.ENTER);
			
		}
	
		
	}

}
