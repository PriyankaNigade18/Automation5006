package com.TestNGFramework.ParallelTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTest 
{
	WebDriver driver;
 @Parameters({"bname"})
	@Test
  public void testApp(String bname)
  {
	  if(bname.equals("chrome"))
	  {
		  driver=new ChromeDriver();
		  
	  }else if(bname.equals("edge"))
	  {
		  driver=new EdgeDriver();
		  
	  }else if(bname.equals("firefox"))
	  {
		driver=new FirefoxDriver();
		
	  }
	  //driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");
	  
  }
  
  
}
