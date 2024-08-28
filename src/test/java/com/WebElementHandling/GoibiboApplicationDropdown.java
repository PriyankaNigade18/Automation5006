package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboApplicationDropdown {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/flights");
		
		//close the popup
		driver.findElement(By.xpath("//span[contains(@class,'icClose')]")).click();
		
		//from
		
		driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pu");
		
		//list
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//span[@class='autoCompleteTitle ']"));
		
		System.out.println("Total Options are: "+list1.size());
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Pantnagar, India "))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		

	}

}
