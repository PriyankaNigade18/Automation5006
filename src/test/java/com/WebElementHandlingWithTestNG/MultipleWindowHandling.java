package com.WebElementHandlingWithTestNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowHandling {
  @Test
  public void windowHandlingTest() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  //main window
	  String parentId=driver.getWindowHandle();
	  System.out.println(parentId);
	  
	  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  //page opens in New tab
	  Set<String> allWindows=driver.getWindowHandles();
	  System.out.println(allWindows);
	  
	  for(String childID:allWindows)
	  {
		  if(!parentId.equals(childID))//if parent id is not equal to child id then switch
		  {//child window
			  driver.switchTo().window(childID);
			  driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
			  //driver.close();//close current active window
			 // driver.quit();//close all open windows by selenium
		  }
	  }
	  
	  
	  //parent
	  
	  driver.switchTo().window(parentId);
	   
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
