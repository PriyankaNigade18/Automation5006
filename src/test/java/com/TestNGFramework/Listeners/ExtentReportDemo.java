package com.TestNGFramework.Listeners;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
  @Test
  public void testReport() 
  {
	  //create object of ExetentReports class
	  ExtentReports extent=new ExtentReports();
	  
	  //path of the report
	  ExtentSparkReporter spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//reports//AutomationTest.html");
	  
	  //cofiguration
	  spark.config().setDocumentTitle("AutomationReport");
	  spark.config().setReportName("Sprint 1 report");
	  spark.config().setTheme(Theme.DARK);
	  
	  //attached the report to spark reporter
	  
	  extent.attachReporter(spark);
	  
	  extent.setSystemInfo("OS","Windows");
	  extent.setSystemInfo("systenname","laptopxyz");
	  
	  //create a test	
	  ExtentTest test=extent.createTest("TestCaseDetails");
	  
	  //logs 
	  test.log(Status.PASS,"Test Pass");
	  test.log(Status.FAIL,"Test Fail");
	  test.log(Status.INFO,"Test Information");
	  test.log(Status.SKIP,"Test Skipped");
	  
	  //close the report-flush()
	  extent.flush();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
