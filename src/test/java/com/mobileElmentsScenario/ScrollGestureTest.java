package com.mobileElmentsScenario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverSession;
import com.Generic.MobileUtility;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollGestureTest {
  @Test
  public void testScroll() throws InterruptedException 
  {
	  //create  a driver session
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //area
	  WebElement area=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  MobileUtility.scrollDownUpToCount(driver,area,3);
	  
	  Thread.sleep(2000);
	  
	  MobileUtility.scrollUp(driver,area);
	  
	  /*
	  //scroll
	  driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)area).getId(),
			  "direction","down",
			  "percent",1.0
			  ));
	  
	  */
	  
	  System.out.println("Scroll down is complted!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
