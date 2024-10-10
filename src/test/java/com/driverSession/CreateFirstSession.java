package com.driverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CreateFirstSession {
  @Test
  public void testDriverSession() throws MalformedURLException 
  {
	  //first pass desired capabilities to the server
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("platformName","Android");
	  cap.setCapability("appium:automationName","uiautomator2");
	  cap.setCapability("appium:deviceName","pixel_5");
	  cap.setCapability("appium:udid","emulator-5554");
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  cap.setCapability("appium:app", path);
	  
	  //server details
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //create a appium driver session
	  AppiumDriver driver=new AndroidDriver(url,cap);
	  System.out.println("Session Id: "+driver.getSessionId());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
