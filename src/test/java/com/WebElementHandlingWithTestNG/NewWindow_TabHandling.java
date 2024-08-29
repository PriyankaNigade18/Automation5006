package com.WebElementHandlingWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewWindow_TabHandling {
  @Test
  public void newTabTest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("Https://www.google.com");
	  WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
	  newTab.get("https://www.facebook.com");
	  
  }
  
  @Test
  public void newWindowTest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("Https://www.google.com");
	  WebDriver newWindow=driver.switchTo().newWindow(WindowType.WINDOW);
	  newWindow.get("https://www.amazon.com");
	  
  }
}
