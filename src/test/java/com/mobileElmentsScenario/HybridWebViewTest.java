package com.mobileElmentsScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Generic.DriverSession;
import com.Generic.MobileUtility;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class HybridWebViewTest {
  @Test
  public void hybridTest() 
  {
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //scroll ele
	  WebElement ele=driver.findElement(AppiumBy.id("android:id/list"));
	  MobileUtility.scrollDownUpToCount(driver,ele,3);
	  
	  //click on webview
	  driver.findElement(AppiumBy.accessibilityId("WebView")).click();
	  
	  //editbox
	  //driver.findElement(AppiumBy.id("i_am_a_textbox")).sendKeys("Hello All");
//	  WebElement ele2=driver.findElement(AppiumBy.className("android.widget.EditText"));
//	  ele2.clear();
//	  ele2.sendKeys("Hello");
	  
	  WebElement ele2=driver.findElements(AppiumBy.className("android.view.View")).get(1);
	  System.out.println("Text is: "+ele2.getText());
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
