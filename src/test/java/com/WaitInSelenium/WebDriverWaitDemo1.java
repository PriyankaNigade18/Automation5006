package com.WaitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class WebDriverWaitDemo1 
{
	
//	public static WebElement presenceOfElement(WebDriver driver,By loc)
//	{
//		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
//		return wait1.until(ExpectedConditions.presenceOfElementLocated(loc));
//	}
//	
//	public static WebElement visibilityOfElement(WebDriver driver,By loc)
//	{
//		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
//		return wait1.until(ExpectedConditions.visibilityOfElementLocated(loc));
//	}
//	
//	
//	public static WebElement elementOfclickable(WebDriver driver,By loc)
//	{
//		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
//		return wait1.until(ExpectedConditions.elementToBeClickable(loc));
//	}
  @Test
  public void explicitWaitTest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	 By email= By.name("email");
	 By pass=By.name("password");
	 By btn=By.xpath("//input[@value='Login']");
	 
	 //explicit wait---->WebDriverWait class
	 /*
	  * TimeoutException:
	  *  Expected condition failed:
	  *  waiting for presence of element located by:
	  *  By.name: email### (tried for 5 second(s) with 500 milliseconds interval)
	  *  
	  *  Interval time=Polling time
	  *  Default time for selenium is 500 millisecond=0.5 sec.
	  *  
	  */
	 Utility.presenceOfElement(driver,email).sendKeys("test@gmail.com");
	 Utility.visibilityOfElement(driver,pass).sendKeys("test123");
	 Utility.elementOfclickable(driver,btn).click();
	 
	 
	 
	 
	 
	 
	 /*
	 //email
	 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
	 wait1.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys("test@gmail.com");
	 
	 
	 //password
	 WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
	 WebElement passele=wait2.until(ExpectedConditions.visibilityOfElementLocated(pass));
	 passele.click();
	 passele.sendKeys("test123");
	 
	 //button
	 WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(5));
	 wait3.until(ExpectedConditions.elementToBeClickable(btn)).click();
	 
	 
	 
	 
	 
	 */
	 
			 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
