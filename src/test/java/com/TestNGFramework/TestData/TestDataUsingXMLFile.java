package com.TestNGFramework.TestData;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDataUsingXMLFile 
{
  @Parameters({"un","psw"})
  @Test
  public void testXMlFile(String un,String psw)
  {
	  System.out.println("User name is: "+un);
	  System.out.println("Password is: "+psw);
	  
  }
}
