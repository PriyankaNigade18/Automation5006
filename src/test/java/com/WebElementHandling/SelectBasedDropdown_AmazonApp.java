package com.WebElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Generic.Utility;

public class SelectBasedDropdown_AmazonApp {

	public static void main(String[] args) throws InterruptedException
	{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
			
			//get the address of dropdown
			WebElement ddele=driver.findElement(By.id("searchDropdownBox"));
			
			Utility.selectBasedDropdown(ddele,"Baby");
			
			
			
			
			
			
			/*
			//select class
			Select sc=new Select(ddele);
			
			System.out.println("Is dropdown support multiple selection?: "+sc.isMultiple());
			
			//single selection
			sc.selectByIndex(3);
			Thread.sleep(1500);
			sc.selectByValue("search-alias=computers");
			Thread.sleep(1500);
			sc.selectByVisibleText("MP3 Music");
			 
			//To get all the options -getOptions()
			
			
			List<WebElement> allOptions=sc.getOptions();
			
			System.out.println("Total Options are: "+allOptions.size());
			
			for(WebElement i:allOptions)
			{
				System.out.println(i.getText());
				if(i.getText().contains("Toys & Games"))
				{
					i.click();
					break;
				}
			}
			
			*/
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
