package com.SwagLabs.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLabs.baseTest.BaseTest;

public class CartPageTest extends BaseTest
{
	@BeforeClass
	public void pageSetup()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("pwd"));
		addWait();
		ip.addProductToCart(prop.getData("pname1"));
		addWait();
		ip.openCartPage();
		addWait();
	}
	
	
	
	
	
  @Test(priority=1)
  public void validateRemove()
  {
	  cp.doRemove();
	  addWait();
  }
  
  
  
  @Test(priority=2)
  public void validateContinueShopping()
  {
	  ip=cp.doContinueShopping();
	  addWait();
	  ip.addProductToCart(prop.getData("pname2"));
	  addWait();
	  ip.openCartPage();
	  addWait();
  }
  
  
  
  
  @Test(priority=3)
  public void navigateToCheckoutPage()
  {
	  cp.clickCheckout();
  }
}
