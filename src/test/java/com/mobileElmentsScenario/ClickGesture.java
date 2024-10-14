package com.mobileElmentsScenario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverSession;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ClickGesture {
  @Test
  public void testClickGesture()
  {

	  //create a driver session
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  //element
	  WebElement ele=driver.findElement(AppiumBy.accessibilityId("Views"));
	  
	  
	  //click gesture
	  driver.executeScript("mobile:clickGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)ele).getId()
			  
			  ));
	  
	  
	  
	  System.out.println("Click gesture is completed!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
