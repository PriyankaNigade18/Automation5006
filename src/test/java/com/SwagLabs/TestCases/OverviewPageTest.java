package com.SwagLabs.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLabs.baseTest.BaseTest;

public class OverviewPageTest extends BaseTest
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
		cp.clickCheckout();
		ch.doContinue(prop.getData("fn"),prop.getData("ln"),prop.getData("zc"));
	}
	
  @Test(priority=1)
  public void validateSummary()
  {
	  op.getSummary();
  }
  
  @Test(priority=2)
  public void validateCompleteOrder() 
  {
	  op.doFinish();
  }
}
