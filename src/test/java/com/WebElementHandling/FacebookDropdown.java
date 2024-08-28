package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Generic.Utility;

public class FacebookDropdown
{
	
//	public static void selectBasedDropdown(WebElement ddele,String value)
//	{
//		Select d1=new Select(ddele);
//		System.out.println("Is dropdown support multiple selection?: "+d1.isMultiple());
//		List<WebElement> allOptions=d1.getOptions();
//		System.out.println("Total Options are: "+allOptions.size());
//		for(WebElement i:allOptions)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains(value))
//			{
//				i.click();
//				break;
//			}
//		}
//		
//	}
	
	
	

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		
		//create an account
		//driver.findElement(By.linkText("Create new account")).click();
		
		Utility.getElementByLinkText("Create new account").click();
		
		//day dropdown
		
		WebElement dayele=driver.findElement(By.id("day"));
		Utility.selectBasedDropdown(dayele,"24");
		
		//month dropdown
		WebElement monthdd=driver.findElement(By.id("month"));
		Utility.selectBasedDropdown(monthdd,"Sep");	
		
		//year dropdown
		WebElement yeardd=driver.findElement(By.id("year"));
		Utility.selectBasedDropdown(yeardd,"2014");
		
		
		
		
		
		
		
//		Select d1=new Select(dayele);
//		System.out.println("Is dropdown support multiple selection?: "+d1.isMultiple());
//		List<WebElement> allOptions=d1.getOptions();
//		System.out.println("Total Options are: "+allOptions.size());
//		for(WebElement i:allOptions)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains("24"))
//			{
//				i.click();
//				break;
//			}
//		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
