package com.WebElementHandlingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFrameDemo {
  @Test
  public void frameTest() 
  {
	  WebDriver driver=new ChromeDriver();
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
	  
	  //frame-name
	  //driver.switchTo().frame("globalSqa");
	  
	  //frame-webElement
	  WebElement frameEle=driver.findElement(By.name("globalSqa"));
	  driver.switchTo().frame(frameEle);
	  
	  //frame -->search box--books
	   WebElement ele=driver.findElement(By.id("s"));
	  ele.click();
	  ele.sendKeys("Books");
	  
	  //All books name inside console
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
