package com.mobileElmentsScenario;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Generic.DriverSession;
import com.Generic.MobileUtility;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AutomateKeyboardAction {
  @Test
  public void testKeyboardInteraction()
  {
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  //scroll 2
	  WebElement area=driver.findElement(AppiumBy.id("android:id/list"));
	  MobileUtility.scrollDownUpToCount(driver,area,2);
	  
	  
	  
	  //textfields
	  driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
	  
	  //edit-type
	  WebElement editoption=driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit"));
	  
	  //Using SendKeys
	  //editoption.sendKeys("Hello All");
	  
	  
	  //Using Android KeyEvent
	  
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.H));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.E));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.L));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.L));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.O));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  
  }
}
