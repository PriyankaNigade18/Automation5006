package com.mobileElmentsScenario;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import com.Generic.DriverSession;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Lock_UnlockDevice {
  @Test
  public void testLock_Unlock_rotate()
  {
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  /*
	  //lock the device
	  ((AndroidDriver)driver).lockDevice();
	  
	  //unlock
	  ((AndroidDriver)driver).unlockDevice();
	 */
	  
	  
	  
	  //rotate
	  ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);	  
	  
	  
	  ((AndroidDriver)driver).rotate(ScreenOrientation.PORTRAIT);
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
