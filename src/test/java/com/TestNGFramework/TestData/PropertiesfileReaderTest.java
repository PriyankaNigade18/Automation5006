package com.TestNGFramework.TestData;

import org.testng.annotations.Test;

import com.Generic.PropertiesReader;

public class PropertiesfileReaderTest {
  @Test
  public void testFile()
  
  {
	  PropertiesReader pr=new  PropertiesReader("config");
	  System.out.println(pr.getData("un"));
	  System.out.println(pr.getData("pwd"));
	  
	  
  }
}
