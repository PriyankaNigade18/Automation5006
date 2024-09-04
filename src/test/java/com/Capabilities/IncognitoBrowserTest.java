package com.Capabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class IncognitoBrowserTest {
  @Test
  public void testBrowser()
  {
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--incognito");
	  
	  WebDriver driver=new ChromeDriver(options);
	  driver.get("https://www.facebook.com");
	  
  }
}
