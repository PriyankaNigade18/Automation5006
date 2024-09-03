package com.WaitInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class DynalicLoadingScenario {
  @Test
  public void testWebDriverWait()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  By sbtn=By.xpath("//button[text()='Start']");
	  
	  By text=By.xpath("(//h4)[2]");
	  
	  
	  driver.findElement(sbtn).click();
	  WebElement ele=Utility.visibilityOfElement(driver,text);
	  //String resText=driver.findElement(text).getText();
	  String resText=ele.getText();
	  System.out.println(resText);
	  
	  
	  
	  
	  
	  
	  
  }
}
