package com.mobileElmentsScenario;

import java.util.List;

import org.testng.annotations.Test;

import com.Generic.DriverSession;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestPerformaceParameters {
  @Test
  public void testPerformance() throws InterruptedException
  {
	  
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  List<String> allParam=((AndroidDriver)driver).getSupportedPerformanceDataTypes();
	  System.out.println(allParam);
	  
	  //[cpuinfo, memoryinfo, batteryinfo, networkinfo]
	  
	  List<List<Object>> batteryData=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","batteryinfo",5);
	  System.out.println(batteryData);
	  
	  Thread.sleep(2000);
	  
	  List<List<Object>> memoryData=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","memoryinfo",5);
	  System.out.println(memoryData);
	  
	  
	  Thread.sleep(2000);
	  
	  List<List<Object>> networkData=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","networkinfo",5);
	  System.out.println(networkData);
	  
//	  Thread.sleep(2000);
//	  
//	  List<List<Object>> cpuData=((AndroidDriver)driver).getPerformanceData("","cpuinfo",5);
//	  System.out.println(cpuData);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
