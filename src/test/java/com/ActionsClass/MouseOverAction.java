package com.ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverAction {
  @Test
  public void testMouseOver() 
    {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.w3schools.com/JSREF/tryit.asp?filename=tryjsref_onmouseover");
	  
	  
	  //frame
	  driver.switchTo().frame("iframeResult");
	  
	  WebElement smiley=driver.findElement(By.xpath("//img[@alt='Smiley']"));
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(smiley).perform();
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
