package com.webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException
	{
		//Create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//driver.get("https://www.facebook.com");
		
		//navigate to facebook
		driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(1500);
		
		//go back-->back()
		driver.navigate().back();
		
		Thread.sleep(1500);
		
		//forward()
		driver.navigate().forward();
		
		Thread.sleep(1500);
		
		//refresh()
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
