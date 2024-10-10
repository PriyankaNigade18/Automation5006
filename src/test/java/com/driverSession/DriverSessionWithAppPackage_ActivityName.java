package com.driverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverSessionWithAppPackage_ActivityName {
  @Test
  public void testSession() throws MalformedURLException {
	  
	  UiAutomator2Options options=new UiAutomator2Options();
	  options.setCapability("appium:appPackage","com.android.deskclock");
	  options.setCapability("appium:appActivity","com.android.deskclock.DeskClock");
	  
	  //server details
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //driver session
	  AppiumDriver driver=new AndroidDriver(url,options);
	  System.out.println("SessionId is:"+driver.getSessionId());
	  
	  
	  
	  
  }
}
