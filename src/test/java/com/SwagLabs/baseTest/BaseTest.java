package com.SwagLabs.baseTest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.SwagLabs.Pages.*;
import com.SwagLabs.Utility.PropertiesReader;

public class BaseTest 
{
	public static WebDriver driver;
	public LoginPage lp;
	public InventoryPage ip;
	public CartPage cp;
	public PropertiesReader prop;
	public CheckoutPage ch;
	public OverviewPage op;
	@BeforeTest
	public void setUp()
	{
		prop=new PropertiesReader();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getData("url"));
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		cp=new CartPage();
		ch=new CheckoutPage();
		op=new OverviewPage();
		
		
		
	}
	
	public String captureScreen(String tname)
	{
	String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File source=ts.getScreenshotAs(OutputType.FILE);
		String targetFilePath=System.getProperty("user.dir")+"\\Screenshots\\"+tname+"_"+timestamp+".png";
			File targetFile=new File(targetFilePath);
			source.renameTo(targetFile);
			return targetFilePath;
		
	}

	public void addWait()
	{
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
