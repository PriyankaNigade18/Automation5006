package com.SwagLabs.baseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.SwagLabs.Pages.*;

public class BaseTest 
{
	public WebDriver driver;
	public LoginPage lp;
	public InventoryPage ip;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		
	}
	
	
}
