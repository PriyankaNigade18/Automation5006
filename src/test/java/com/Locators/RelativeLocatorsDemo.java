package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsDemo {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//enter email which is above password
		//driver.findElement(RelativeLocator.with(By.id("email")).above(By.name("pass"))).sendKeys("test@gmail.com");
		WebElement passele=driver.findElement(By.name("pass"));
		driver.findElement(RelativeLocator.with(By.id("email")).above(passele)).sendKeys("piyu1818@gmail.com");
	
		//enter password which is below email id ele
		driver.findElement(RelativeLocator.with(By.id("pass")).below(By.id("email"))).sendKeys("test123");
		
		
		
		
		
	}

}
