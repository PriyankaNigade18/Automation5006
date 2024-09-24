package com.SwagLabs.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.baseTest.BaseTest;

public class LoginPage 

{
	WebDriver driver;
	public LoginPage(WebDriver driver)//from base class
	{
		this.driver=driver;
		//initialize
		PageFactory.initElements(driver,this);
	}
	
	//locators
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	//ActionMathod
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public InventoryPage doLogin(String un,String pass)
	{
		username.sendKeys(un);
		password.sendKeys(pass);
		loginBtn.click();
		//after login we will go to inventory return object of same page
		return new InventoryPage(driver);
	}
	
	
	
	
	
}
