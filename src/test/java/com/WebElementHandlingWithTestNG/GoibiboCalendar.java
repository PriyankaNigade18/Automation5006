package com.WebElementHandlingWithTestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoibiboCalendar {
  @Test
  public void testDatePicker()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.goibibo.com/flights/");
	  driver.manage().window().maximize();
	  
	  
	  //close the popup
	  driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
	  
	  //open caledar
	  driver.findElement(By.xpath("(//span[contains(@class,'fswDownArrow')])[1]")).click();
	  
	  //expectation
	  String date="6";
	  String month="April";
	  String year="2025";
	  
	  
	//month selection
	  while(true) {
	 String text=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
	 // System.out.println(text);
	  String cmonth=text.split(" ")[0];
	  String cyear=text.split(" ")[1];
	  
	  System.out.println("Current month is: "+cmonth);
	  System.out.println("Current year is: "+cyear);
	  if(cmonth.contains(month)&&cyear.contains(year))
	  {
		  break;
	  }else
	  {
		  //click on arrow
		  driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	  }
	  
	  }
	  //date selection
	  List<WebElement> allDates=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[@class='DayPicker-Day']//p"));
	  
	  for(WebElement i:allDates)
	  {
		  if(i.getText().contains(date))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
