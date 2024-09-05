package com.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGDemo5_timeouts

{
	
	@Test
	public void sampleTest()
	{
		System.out.println("This is sample test!");
	}
	
  @Test(timeOut = 3000)
  public void testExecutionTimeOut() throws InterruptedException
  {  
	 
	System.out.println("This test case should execute within 3sec.");
	Thread.sleep(4000);
  }
}
