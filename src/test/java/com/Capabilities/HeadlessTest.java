package com.Capabilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessTest {
  @Test
  public void googleSearch()
  {
	  //to run test in headless mode
	  ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("--headless");
	  
	  System.out.println("Creating driver session....");
	  WebDriver driver=new ChromeDriver(opt);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  System.out.println("Driver session is created......");
	  driver.get("https://www.google.com");
	  System.out.println("Application Open!...");

	  driver.findElement(By.name("q")).sendKeys("cucumber");
	  System.out.println("Searched for Keyword....");

	  List<WebElement> options=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	  System.out.println("Total Search options: "+options.size());
	  System.out.println("Search Result..........");
	  
	  for(WebElement i:options)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
