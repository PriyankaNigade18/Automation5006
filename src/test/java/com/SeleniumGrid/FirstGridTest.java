package com.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirstGridTest {
  @Test
  public void testOnRemoteChrome() throws MalformedURLException, InterruptedException
  { System.out.println("Remote connectivity is started!");
	  ChromeOptions cap=new ChromeOptions();
	  WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444"),cap);
	  System.out.println("Remote connectivity is completed!");
	  
	  Thread.sleep(5000);
	  
	  driver.get("https://www.amazon.in");
	  
	  Thread.sleep(12000);
	  
	  System.out.println("Application title is: "+driver.getTitle());
	  
	  driver.quit();
	  
	  
	  
	  
	  
	  
	  
  }
}
