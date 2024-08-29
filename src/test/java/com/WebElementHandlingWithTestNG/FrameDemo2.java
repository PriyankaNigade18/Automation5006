package com.WebElementHandlingWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameDemo2 {
  @Test
  public void frameTest() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://ui.vision/demo/webtest/frames/");
	  
	  //frame with index
	  //driver.switchTo().frame(0);
	  
	  //frame -WebElement
	  WebElement f1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	  driver.switchTo().frame(f1);
	  driver.findElement(By.name("mytext1")).sendKeys("Priyanka");
	  
	  //to switch main page/window
	  driver.switchTo().defaultContent();
	  
	  //frame2
	  WebElement f2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	  driver.switchTo().frame(f2);
	  driver.findElement(By.name("mytext2")).sendKeys("HelloAll");
	  
	  
	  
	  
	  
	  
  }
}
