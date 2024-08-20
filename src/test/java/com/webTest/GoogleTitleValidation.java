package com.webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleValidation {

	public static void main(String[] args) 
	{
		//ctrl+shift+O -->To import the classes
		
		//Create  a driver session
		WebDriver driver=new ChromeDriver();
		
		//Open Google application
		driver.get("https://www.google.com");
		
		//To get title from application- getTitle()
		String actTitle=driver.getTitle();
		System.out.println("Title is: "+actTitle);
		
		//validate title with expected title
		
		if(actTitle.equals("Google"))
		{
			System.out.println("Test Pass....Title matched!");
		}else
		{
			System.out.println("Test Fail.....Title not matched!");
			
		}
		
		//close the browser
			//driver.close();
			
			driver.quit();
		
		
		
		
			

	}
}


