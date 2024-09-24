package com.SwagLabs.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.baseTest.BaseTest;

public class OverviewPage extends BaseTest
{
	public OverviewPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="checkout_summary_container")
	WebElement summary;
	
	@FindBy(id="finish")
	WebElement fbtn;
	
	@FindBy(tagName="h2")
	WebElement text;
	
	//action methods
	
	public void getSummary()
	{
		System.out.println("*******Order Summary is*********");
		System.out.println(summary.getText());
	}
	
	public void doFinish()
	{
		fbtn.click();
		System.out.println("Final Order status: "+text.getText());
	}

}
