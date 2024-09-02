package com.WebElementHandlingWithTestNG;

import java.time.Duration;

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
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
	  
	 
	  //to switch main page/window
	  driver.switchTo().defaultContent();
	  //frame3 using indexing
	  driver.switchTo().frame(2);
	  driver.findElement(By.name("mytext3")).sendKeys("Hello frame3");
	  
	  //inner frame-iframe
	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath("//div[@id='i8']//div[contains(@class,'Id5V1')]")).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
