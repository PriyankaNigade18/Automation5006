package com.mobileElmentsScenario;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Generic.DriverSession;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorsDemo {
  @Test
  public void testLocator() throws InterruptedException 
  {
	  
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  System.out.println("session id : "+driver.getSessionId());
	  
	  
	  //ele1-accessibilityId
	  WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	  System.out.println("Text of element1: "+ele1.getText());
	  ele1.click();
	  
	  Thread.sleep(1500);
	  //Navigation interface
	  driver.navigate().back();
	  
	  
	  //ele2-xpath
	  WebElement ele2=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
	  System.out.println("Text of element2: "+ele2.getText());
	  ele2.click();
	  
	  Thread.sleep(1500);
	  //Navigation interface
	  driver.navigate().back();
	  
	  //ele3-className
	 WebElement ele3= driver.findElements(AppiumBy.className("android.widget.TextView")).get(3);
	  System.out.println("Text iof element3: "+ele3.getText());
	  ele3.click();
	  
	  Thread.sleep(1500);
	  //Navigation interface
	  driver.navigate().back();
	  
	  
	  //ele4- resource-id-id
	  WebElement ele4=driver.findElements(AppiumBy.id("android:id/text1")).get(3);
	  System.out.println("Text iof element4: "+ele4.getText());
	  ele4.click();
	  
	  Thread.sleep(1500);
	  //Navigation interface
	  driver.navigate().back();
	  
	  
	  //ele5-text-androidUIAutomator
	  WebElement ele5=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Content\")"));
	  System.out.println("Text iof element5: "+ele5.getText());
	  ele5.click();
	  
	  Thread.sleep(1500);
	  //Navigation interface
	  driver.navigate().back();
	  
	  
	  
	  
	  
	  
	  
  }
}
