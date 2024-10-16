package com.mobileElmentsScenario;

import org.testng.annotations.Test;

import com.Generic.DriverSession;
import com.Generic.MobileUtility;

import io.appium.java_client.AppiumDriver;

public class TestSceenshot {
  @Test
  public void takeScreenshot()
  {
	  
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  MobileUtility.takeScreenshot(driver);
	  
	  
	  
	  
	  
  }
}
