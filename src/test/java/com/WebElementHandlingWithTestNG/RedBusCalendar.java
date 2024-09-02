package com.WebElementHandlingWithTestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedBusCalendar {
  @Test
  public void datePickerTest()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in/");
	  
	  //expectation
	  String date="6";
	  String month="Apr";
	  String year="2025";
	  
	  //open calendar
	  driver.findElement(By.className("dateText")).click();
	  
	  
	 //month selection
	  while(true) {
	 String text=driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[3]")).getText();
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
		  driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[4]")).click();
	  }
	  
	  }
	  //date selection
	  List<WebElement> allDates=driver.findElements(By.xpath("//span[contains(@class,'DayTiles__CalendarDaysSpan')]"));
	  
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
