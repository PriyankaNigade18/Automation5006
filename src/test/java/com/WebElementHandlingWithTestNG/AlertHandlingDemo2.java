package com.WebElementHandlingWithTestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandlingDemo2
{
  @Test
  public void alertTest() throws InterruptedException 
  {
	  
	  //create driver driver
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  //alert1
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  //static wait
	  Thread.sleep(1500);
	  
	  //alert window will open
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert1 text is: "+alt1.getText());
	  alt1.accept();
	  
	  WebElement result=driver.findElement(By.id("result"));
	  System.out.println("Alert1 result status is: "+result.getText());
	  
	  
	  //alert2
	  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	  
	//static wait
	  Thread.sleep(1500);
	  
	  Alert alt2=driver.switchTo().alert();
	  System.out.println("Alert2 text is: "+alt2.getText());
	  //cancel
	  alt2.dismiss();
	  
	  //alert3
	   	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	  //static wait
		  Thread.sleep(1500);
		  
		  Alert alt3=driver.switchTo().alert();
		  System.out.println("Alert2 text is: "+alt3.getText());
		  
		  //prompt
		  alt3.sendKeys("Hello all!");
		  
		  //ok
		  alt3.accept();
		  
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	  
	  System.out.println("Alert2 result status is: "+result.getText());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
