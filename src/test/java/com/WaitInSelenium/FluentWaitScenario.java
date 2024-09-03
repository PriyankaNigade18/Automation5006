package com.WaitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class FluentWaitScenario {
  @Test
  public void fluentTest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  By sbtn=By.xpath("//button[text()='Start']");
	  
	  By text=By.xpath("(//h4)[2]");
	  
	  
	  driver.findElement(sbtn).click();
	  
	  FluentWait<WebDriver> wait =
		        new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(5))
		            .pollingEvery(Duration.ofMillis(2000))
		            .ignoring(ElementNotInteractableException.class);
	  
	  String resText=wait.until(ExpectedConditions.visibilityOfElementLocated(text)).getText();
	  
	  System.out.println(resText);
	  
	  
	  
	  
	  
	  
  }
}
