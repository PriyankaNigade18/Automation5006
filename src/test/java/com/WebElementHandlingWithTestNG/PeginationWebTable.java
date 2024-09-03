package com.WebElementHandlingWithTestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PeginationWebTable {
  @Test
  public void testTable()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://testautomationpractice.blogspot.com/");
		 
		 //Total Pages
		List<WebElement> allPages=driver.findElements(By.xpath("//ul[@id='pagination']//li/a"));  
		 
		 	System.out.println("Total Pages are: "+allPages.size());
		 	
		 	for(WebElement i: allPages)
		 	{
		 		i.click();
		 		List<WebElement> data=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td"));
		 		
		 		for(WebElement j:data)
		 		{
		 			System.out.println(j.getText());
		 		}
		 	}
		 	
		 	
  
  
  
  
  
  
  
  
  
  }
}
