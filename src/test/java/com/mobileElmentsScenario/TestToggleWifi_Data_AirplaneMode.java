package com.mobileElmentsScenario;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Generic.DriverSession;
import com.Generic.MobileUtility;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestToggleWifi_Data_AirplaneMode {
  @Test
  public void testSetup() throws InterruptedException
    {
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  
	  /*
	   * toggle-->on/off
	   * wifi--->toggleWifi()
	   * airplaneMode--->toggleAirplaneMode()
	   * mobiledata---->toggleData()
	   */
	  
	  
	  System.out.println("Initail setup for wifi is: ON");
	  ((AndroidDriver)driver).toggleWifi();
	  System.out.println("After toggle setup for wifi is: OFF");
	  Thread.sleep(1500);
	  ((AndroidDriver)driver).toggleWifi();
	  System.out.println("After toggle setup for wifi is: ON");

	  
	  //swipe left
	  WebElement area=driver.findElement(AppiumBy.id("com.android.systemui:id/tile_page"));
	  MobileUtility.swipeLeft(driver,area);
	  
	  
	  System.out.println("Initial setup for mobile data is: ON");

	  //mobile data
	  ((AndroidDriver)driver).toggleData();
	  System.out.println("After toggle setup for Mobiledata is: OFF");
	  Thread.sleep(1500);
	  ((AndroidDriver)driver).toggleData();
	  System.out.println("After toggle setup for MobileData is: ON");

	  
	  
	  
	  System.out.println("Initial setup for AirplaneMode is: Off");

	  //AirplaneMode 
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  System.out.println("After toggle setup for AirplaneMode is: ON");
	  Thread.sleep(1500);
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  System.out.println("After toggle setup for AirplaneMode  is: OFF");

	  
	  
  }
}
