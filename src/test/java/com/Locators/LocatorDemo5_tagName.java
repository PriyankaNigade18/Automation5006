package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LocatorDemo5_tagName {

	public static void main(String[] args)
	{
		// create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Number of Input boxes
//		List<WebElement> allInputs=driver.findElements(By.tagName("input##"));
//		System.out.println("Total Input Boxes are: "+allInputs.size());//0
//		System.out.println(allInputs);//[]
		
		//Number of Images
		List<WebElement> allImages=driver.findElements(By.tagName("img"));
		System.out.println("Total Images are: "+allImages.size());
		
		
		//Number of Links +Get the attribute value +text of Link in console
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+allLinks.size());
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getAttribute("href"));
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
