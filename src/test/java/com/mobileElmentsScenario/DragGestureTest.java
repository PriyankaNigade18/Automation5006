package com.mobileElmentsScenario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverSession;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class DragGestureTest {
  @Test
  public void testDragGesture() 
  {
	  
	  //create  driver session
	  AppiumDriver driver=DriverSession.initAndroidSession();

	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	 
	  
	  //dragndrop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //element-dot3
	  
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));

	  //dragGesture
	  driver.executeScript("mobile:dragGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId(),
			  "endX",719,
			  "endY",1109
			  
			  ));

	  //result Text
	  String text=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();

	  System.out.println("Result text is: "+text);
	  










  }
}
