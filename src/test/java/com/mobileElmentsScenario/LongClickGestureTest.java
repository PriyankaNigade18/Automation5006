package com.mobileElmentsScenario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverSession;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LongClickGestureTest {
  @Test
  public void testLongClick()
  {
	  
	  //create driver session
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //dragndrop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //dot1
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	  
	  //longClickGesture
	  driver.executeScript("mobile:longClickGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId(),
			  "duration",4000
			  		  
			  ));
	  
	  
	  System.out.println("Long click gesture is completed!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
