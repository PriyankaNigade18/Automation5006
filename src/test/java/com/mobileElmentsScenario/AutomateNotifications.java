package com.mobileElmentsScenario;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Generic.DriverSession;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AutomateNotifications {
  @Test
  public void testNotifications() 
  {
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  //open Notifications from the device-openNotifications()
	  
	  ((AndroidDriver)driver).openNotifications();
	  
	  //get it in the console
	  List<WebElement> list=driver.findElements(AppiumBy.id("android:id/title"));	  
	  System.out.println("Current Notification in Device");
	  for(WebElement i:list)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  //appiumSetting notification data
	  String notification1=driver.findElement(AppiumBy.id("android:id/big_text")).getText();	  
	  System.out.println(notification1);
	  System.out.println("***************************");
	  //second
	  String notification2=driver.findElement(AppiumBy.id("android:id/text")).getText();
	  System.out.println(notification2);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
