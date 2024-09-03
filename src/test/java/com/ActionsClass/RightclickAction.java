package com.ActionsClass;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class RightclickAction {
  @Test
  public void rightclickTest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  WebElement rbtn=driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  //actions class
	  Actions act=new Actions(driver);
	  act.contextClick(rbtn).perform();
	  
	  List<WebElement> allOptions=driver.findElements(By.xpath("(//ul)[3]//li/span"));
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Copy"))
		  {
			  i.click();
			  break;
			  
		  }
	  }
	  
	  Thread.sleep(2000);
	  //alert will present
	 Alert alt= driver.switchTo().alert();
	 System.out.println("Alert text is: "+alt.getText());
	 alt.accept();
	  
	  
	  
	  
	  
	  
	
	  
	  
	  
	  
	  
  }
}
