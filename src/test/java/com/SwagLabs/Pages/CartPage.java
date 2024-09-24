package com.SwagLabs.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.baseTest.BaseTest;

public class CartPage extends BaseTest
{

	//WebDriver driver;
	
	public CartPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//locators
	@FindBy(xpath="//button[text()='Remove']")
	WebElement rbtn;
	
	@FindBy(id="continue-shopping")
	WebElement cbtn;
	
	@FindBy(id="checkout")
	WebElement checkbtn;
	
	//actions method
	public void doRemove()
	{
		rbtn.click();
		System.out.println("Product removed from cart!");
	}
	
	public InventoryPage doContinueShopping()
	{
		cbtn.click();
		return new InventoryPage(driver);
		
	}
	
	public CheckoutPage clickCheckout()
	{
		checkbtn.click();
		return new CheckoutPage();
	}
	
	
	
	
	
	
	
	
}
