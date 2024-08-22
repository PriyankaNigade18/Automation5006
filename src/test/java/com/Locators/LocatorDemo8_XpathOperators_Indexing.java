package com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo8_XpathOperators_Indexing {

	public static void main(String[] args)
	{
		//Create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//fname
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Anil");
		
		//lname- and
		driver.findElement(By.xpath("//input[@placeholder='Last Name' and @class='form-control']")).sendKeys("sharma");
		
		//email- or
		driver.findElement(By.xpath("//input[@placeholder='E-Mail' or @class='form-']")).sendKeys("anil@gmail.com");
		
		//tele
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("877665544");
		
		//pass
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("test123");
		
		//cpass
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=6]")).sendKeys("test123");
		
		//radio button
		driver.findElement(By.xpath("//input[@name='newsletter']")).click(); //yes
		
		
		/*
		 * Scenario:
		 * check if radio button is not selected then select
		 * 
		 */
		List<WebElement> list=driver.findElements(By.xpath("//div/label[@class='radio-inline']"));
		
		for(WebElement i:list)
		{
			//System.out.println(i.isSelected());
			
			if(!i.isSelected())
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
