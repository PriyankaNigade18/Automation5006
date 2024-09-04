package com.Capabilities;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FileDownLoad {
  @Test
  public void testFileDownLoad()
  {
	  
	  ChromeOptions options = new ChromeOptions();
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("download.default_directory",System.getProperty("user.dir")+"\\target");
	  options.setExperimentalOption("prefs", map);
	  
	  WebDriver driver=new ChromeDriver(options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://the-internet.herokuapp.com/download");
	  
	  
	  driver.findElement(By.xpath("//a[text()='demo123.txt']")).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
