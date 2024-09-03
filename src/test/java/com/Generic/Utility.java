package com.Generic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility
{
	
	//Explicit Utility
	public static WebElement presenceOfElement(WebDriver driver,By loc)
	{
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait1.until(ExpectedConditions.presenceOfElementLocated(loc));
	}
	
	public static WebElement visibilityOfElement(WebDriver driver,By loc)
	{
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait1.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	
	
	public static WebElement elementOfclickable(WebDriver driver,By loc)
	{
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait1.until(ExpectedConditions.elementToBeClickable(loc));
	}
	
	public static WebDriver driver;

	public static void selectBasedDropdown(WebElement ddele,String value)
	{
		Select d1=new Select(ddele);
		System.out.println("Is dropdown support multiple selection?: "+d1.isMultiple());
		List<WebElement> allOptions=d1.getOptions();
		System.out.println("Total Options are: "+allOptions.size());
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
		
	}
	
	
	
	public static WebElement getElementById(String id)
	{
		return driver.findElement(By.id(id));
	}
	
	public static WebElement getElementByLinkText(String linktext)
	{
		return driver.findElement(By.linkText(linktext));
	}
	
	//javascript utilities
	
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		  
	}
	
	
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		  
	}
	
	public static void scrollUptoElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
	
	
}
