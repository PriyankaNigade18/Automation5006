package com.webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) 
	{

		//create  a driver session
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//to get the title-getTitle
		System.out.println("Application title is: "+driver.getTitle());

	
		//To get the current url -getCurrentUrl()
		System.out.println("Application current url is: "+driver.getCurrentUrl());
	
		//To get the current page source- getPageSource()
		
		System.out.println(driver.getPageSource());
		
		//To close browser
		driver.quit();
		
		
		
		
		
	
	
	}

}
