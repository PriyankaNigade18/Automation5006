package com.Generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class MobileUtility 
{
	
	//screenshotutility
	public static void takeScreenshot(AppiumDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//Screenshots//APIDemos"+System.currentTimeMillis()+".png");
		try {
			FileHandler.copy(temp,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	//swipe
	public static void swipeLeft(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile:swipeGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","left",
				  "percent",1.0
				  
				  ));
	}
	
	public static void swipeRight(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile:swipeGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","right",
				  "percent",1.0
				  
				  ));
	}
	public static void swipeUp(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile:swipeGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","up",
				  "percent",1.0
				  
				  ));
	}
	
	public static void swipeDown(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile:swipeGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","down",
				  "percent",1.0
				  
				  ));
	}
	
	
	
	
	//scroll
	public static void scrollDown(AppiumDriver driver,WebElement ele)
	{
		 driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","down",
				  "percent",1.0
				  ));
		  
	}
	public static void scrollUp(AppiumDriver driver,WebElement ele)
	{
		 driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","up",
				  "percent",1.0
				  ));
		  
	}
	
	public static void scrollLeft(AppiumDriver driver,WebElement ele)
	{
		 driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","left",
				  "percent",1.0
				  ));
		  
	}
	
	public static void scrollRight(AppiumDriver driver,WebElement ele)
	{
		 driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","right",
				  "percent",1.0
				  ));
		  
	}
	
	public static void scrollDownUpToCount(AppiumDriver driver,WebElement ele,int count)
	{
		for(int i=1;i<=count;i++)
		{
		 driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","down",
				  "percent",1.0
				  ));
		 System.out.println("Iteration number : "+i);
		 
		}
		
	}

}
