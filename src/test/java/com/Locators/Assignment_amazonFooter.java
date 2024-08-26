package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_amazonFooter {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in");
		
		List<WebElement> allFooters=driver.findElements(By.xpath("//div[contains(@class,'navFooterVerticalRow')]"));
		System.out.println("Total Footer links: "+allFooters.size());
		
		for(WebElement i:allFooters)
		{
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		
		

	}

}
