package com.SwagLabs.Utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.SwagLabs.baseTest.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager implements ITestListener
{
	String rname;
	public ExtentSparkReporter spark;//for UI
	public ExtentReports extent;//populate common info on report
	public ExtentTest test;//creating test case entries in report

	public void onStart(ITestContext context) {
		   System.out.println("Execution started");
		   
		   String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		   rname="TestReport"+timestamp+".html";
		   spark=new ExtentSparkReporter(".\\reports\\"+rname);
		   spark.config().setDocumentTitle("Application title");
		   spark.config().setReportName("FunctionalReport");
		   spark.config().setTheme(Theme.DARK);
		   extent=new ExtentReports();
		   extent.attachReporter(spark);
		   extent.setSystemInfo("Application","App Name");
		   extent.setSystemInfo("Os","Windows");
		   
	}

		public void onTestStart(ITestResult result) {
		    System.out.println("Test execution started: "+result.getMethod().getMethodName());
		  }

		public void onFinish(ITestContext context) {
		    System.out.println("Execution Finish");
		    extent.flush();

		  }

		public void onTestSuccess(ITestResult result) 
		{
		    System.out.println("Test success: "+result.getMethod().getMethodName());
		    test=extent.createTest(result.getTestClass().getName());
		    test.log(Status.PASS,result.getName()+"Got successfully executed!");
		 }

		public void onTestFailure(ITestResult result) {
		    System.out.println("Test Failure : "+result.getMethod().getMethodName());
		    test=extent.createTest(result.getTestClass().getName());
		    test.log(Status.FAIL,result.getName()+"got fail");
		    test.log(Status.INFO,result.getThrowable().getMessage());
		    try {
		    	String imgpath=new BaseTest().captureScreen(result.getName());
		    	test.addScreenCaptureFromPath(imgpath);
		    }catch(Exception i)
		    {
		    	i.printStackTrace();
		    }

		  }

		public void onTestSkip(ITestResult result) {
		    System.out.println("Test Skip : "+result.getMethod().getMethodName());
		    test=extent.createTest(result.getTestClass().getName());
		    test.log(Status.SKIP,result.getName()+"Test got skiped!");
		}
		
		
}
