package com.TestNGFramework.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListerners implements ITestListener
{

	public void onStart(ITestContext context)
	{
		System.out.println("OnStart will run before first test....Execution starts");
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("OnTestStart will run for every test....& current test is:"+result.getName());
		
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Pass: "+result.getName()+" Got successfully Executed");
		
	}
	

	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Fail"+result.getName());
		
	}
	

	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Skipped"+result.getName());
		
	}
	public void onFinish(ITestContext context)
	{
		System.out.println("OnFinish will run after last test....Execution finished!");

	}
	
	
}
