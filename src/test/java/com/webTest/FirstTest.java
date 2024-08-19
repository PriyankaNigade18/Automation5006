package com.webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args)
	{
		// Create  a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		

	}

}
