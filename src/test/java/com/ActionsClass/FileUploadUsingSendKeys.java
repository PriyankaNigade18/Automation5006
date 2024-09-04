package com.ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadUsingSendKeys {
  @Test
  public void testFileUpload()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://the-internet.herokuapp.com/upload");
	  /*
	   * sendKeys() applicable only when the element
	   * is designed as type=file
	   */
	  driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Ganes\\OneDrive\\Desktop\\Appiumsetup.txt");
	  
	  //upload
	  driver.findElement(By.id("file-submit")).click();
	  
	  
  }
}
