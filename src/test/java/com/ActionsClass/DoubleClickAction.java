package com.ActionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClickAction {
  @Test
  public void testDoubleClick() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  WebElement ele=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	  
	  
	  Actions act=new Actions(driver);
	  act.doubleClick(ele).perform();
	  
	  Thread.sleep(1500);
	  //alert will open
	  Alert alt=driver.switchTo().alert();	  
	  System.out.println("Alert text is: "+alt.getText());
	  alt.accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
