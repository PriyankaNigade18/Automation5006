package com.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGDemo9_Grouping 
{
  @Test(groups = "smokeTest")
  public void openApplication() 
  {
	  System.out.println("application open");
  }
  
  @Test(groups = "regressionTest")
  public void setAddress() 
  {
	  System.out.println("address set for the employee");
  }
  
  @Test(groups = "regressionTest")
  public void setDepartment() 
  {
	  System.out.println("department set for employee");
  }
  
  @Test(groups = "regressionTest")
  public void setStatus() 
  {
	  System.out.println("Employee status updated");
  }
  @Test(groups = "regressionTest")
  public void setEmpId() 
  {
	  System.out.println("Employee id is set");
  }
  @Test(groups = "smokeTest")
  public void projectStarted() 
  {
	  System.out.println("Employee started work on Project");
  }
  
}
