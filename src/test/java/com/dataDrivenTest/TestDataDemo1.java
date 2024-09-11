package com.dataDrivenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataDemo1 
{
//	@DataProvider(name="mydata")
//	public Object[][] testData()
//	{
//		Object arr[][]= {{"Admin","admin123"},{"Amit","test123"},{"Shreya","test123"},{"Admin","admin123"}};
//		return arr;
//	}
	
	
	
	
  @Test(dataProvider="mydata",dataProviderClass = CustomData.class)
  public void validateData(String un,String pwd)
  {
	  System.out.println("User name is: "+un);
	  System.out.println("Password is: "+pwd);
  }
}
