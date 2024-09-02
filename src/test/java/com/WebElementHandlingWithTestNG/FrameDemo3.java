package com.WebElementHandlingWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameDemo3 {
  @Test
  public void nestedFrameTest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/nested_frames");
	  
	  //top
	  //driver.switchTo().frame(0);
	  
	  //top-->left
	  driver.switchTo().frame(0).switchTo().frame("frame-left");
	  System.out.println("Page source of left page is: "+driver.getPageSource());
	  
	  //main window
	  driver.switchTo().defaultContent();
	  
	  //top->middle
	  driver.switchTo().frame(0).switchTo().frame("frame-middle");
	  System.out.println("Page source of Middle page is: "+driver.getPageSource());

	  
	  
	  
	  
  }
}
