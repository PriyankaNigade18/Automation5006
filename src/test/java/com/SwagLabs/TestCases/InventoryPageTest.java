package com.SwagLabs.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLabs.baseTest.BaseTest;

public class InventoryPageTest extends BaseTest
{
	@BeforeClass
	public void pageSetUp()
	{
		lp.doLogin(prop.getData("un"),prop.getData("pwd"));
	}
	
  @Test(priority=1)
  public void validateProductCount()
  {
	  int count=ip.getTotalProductCount();
	  Assert.assertEquals(count,6,"Product count is not matching");
	  System.out.println("Product count is matched & Total Products are "+count);
	}
  
  
  @Test(priority=2)
  public void validateProductDetails()
  {
	  ip.getProductDeatils();
  }
  
  
  @Test(priority=3)
  public void validateAddToCart()
  {
	  ip.addProductToCart(prop.getData("pname1"));
  }
  
  @Test(priority=4)
  public void validateCartPageInit()
  {
	  ip.openCartPage();
  }
}
