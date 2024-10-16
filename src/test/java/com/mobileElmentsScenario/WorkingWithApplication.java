package com.mobileElmentsScenario;

import java.time.Duration;

import org.testng.annotations.Test;

import com.Generic.DriverSession;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class WorkingWithApplication {
  @Test
  public void testApplicationActions() throws InterruptedException
  {
	  
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  String packageName="io.appium.android.apis";
	  
	  //current state of application
	  System.out.println("Current status is: "+((AndroidDriver)driver).queryAppState(packageName));
	  
	  //terminate application
	  ((AndroidDriver)driver).terminateApp(packageName);
	   System.out.println("After Terminate status is: "+((AndroidDriver)driver).queryAppState(packageName));

	   Thread.sleep(2000);
	   
	  //activate application
	  ((AndroidDriver)driver).activateApp(packageName);
	  System.out.println("After activate app status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  Thread.sleep(2000);
	  //un-installation
	  ((AndroidDriver)driver).removeApp(packageName);
	  System.out.println("After uninstallation app status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  Thread.sleep(2000);
	  
	  //install
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  ((AndroidDriver)driver).installApp(path);
	  System.out.println("After installation app status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  Thread.sleep(2000);
	  ((AndroidDriver)driver).activateApp(packageName);
	  System.out.println("After activate app status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  //App in background 
	  ((AndroidDriver)driver).runAppInBackground(Duration.ofSeconds(5));
	  System.out.println("After Background action status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
