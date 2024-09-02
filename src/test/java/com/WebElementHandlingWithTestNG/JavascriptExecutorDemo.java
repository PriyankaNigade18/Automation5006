package com.WebElementHandlingWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class JavascriptExecutorDemo 
{
	
	
	
	
	
  @Test
  public void testExecutor() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
//	  Utility.scrollDown(driver);
//	  
//	  Thread.sleep(2000);
//	  
//	  Utility.scrollUp(driver);
	  
	  
	  
	  //How to scroll upto any element
	  WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Computers & Accessories')]"));
	  Utility.scrollUptoElement(driver,ele);
	  
	  
//	  JavascriptExecutor js=(JavascriptExecutor) driver;
//	  js.executeScript("arguments[0].scrollIntoView(true);",ele);
//	  
	  
	  
	  
	  
	  
	  
	  
	  
	  /*
	  
	  //scrollDown
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  //js.executeScript("window.scrollTo(0,5000)");
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  Thread.sleep(2000);
	  
	  
	  //scroll up
	  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	  */
	  
	  
  }
}
