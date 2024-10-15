package com.mobileElmentsScenario;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Generic.DriverSession;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AlertHandling {
  @Test
  public void testAlert() throws InterruptedException 
  {
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  
	  //app
	  driver.findElement(AppiumBy.accessibilityId("App")).click();
	  
	  //alert
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	  
	  //alert1
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	  
	  //alert will open
	  
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert Text is: "+alt1.getText());
	  //ok
	  alt1.accept();
	  
	  
	  //alt2-text alert
	  driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
	  
	  //alert will open
	  Alert alt2=driver.switchTo().alert();
	  
	  //area-username
	  WebElement username=driver.findElement(AppiumBy.id("io.appium.android.apis:id/username_edit"));
	  username.sendKeys("Priyanka");
	  
	  Thread.sleep(1500);
	  alt2.dismiss();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
