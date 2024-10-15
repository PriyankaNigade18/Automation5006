package com.mobileElmentsScenario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverSession;
import com.Generic.MobileUtility;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class SwipeGestureTest {
  @Test
  public void testSwipeGesture() 
  {
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  //views
	  
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //gallery
	  
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	  //photos
	  driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	  
	  //swipe-element
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
	  
//	  driver.executeScript("mobile:swipeGesture",ImmutableMap.of(
//			  "elementId",((RemoteWebElement)ele).getId(),
//			  "direction","left",
//			  "percent",1.0
//			  
//			  ));
	  
	  MobileUtility.swipeLeft(driver,ele);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
