package com.WebElementHandlingWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptExecutorDemo2 {
  @Test
  public void testJavascriptfunction() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	  //how to refresh
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("history.go(0)");
	  
	  System.out.println("Page Refreshed!");
	  
	  //To get the title of application
	  
	  System.out.println(driver.getTitle());
	  
	 String title=js.executeScript("return document.title").toString();
	 System.out.println("Title using javascript: "+title);
	  
	  
	  //Element interaction
	 WebElement cartEle=driver.findElement(By.xpath("//span[normalize-space()='Cart']"));
	  js.executeScript("arguments[0].click()",cartEle);
	  
	  
	  
	  
  }
}
