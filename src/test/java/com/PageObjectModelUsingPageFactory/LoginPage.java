package com.PageObjectModelUsingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	WebDriver driver;
	
	//constructor
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		//initializing the page Object
		PageFactory.initElements(driver,this);
	}
	
	
	//locator
	@FindBy(name="username") 
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	//Action methods
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	public void doLogin(String un,String psw)
	{
	uname.sendKeys(un);
	pass.sendKeys(psw);
	loginBtn.click();
	}
	

}
