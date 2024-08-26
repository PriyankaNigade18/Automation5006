package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo9_XpathMethod {

	public static void main(String[] args) 
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		WebElement ele=driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		System.out.println("Text of element: "+ele.getText());
		ele.click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		
		String cartmsg=driver.findElement(By.tagName("h2")).getText();
		System.out.println(cartmsg);
		
		String cartmsg2=driver.findElement(By.xpath("//h2[contains(text(),'Cart is empty')]")).getText();
		System.out.println("Cart message with xpath: "+cartmsg2);
		
		//contains ----attribute
		driver.findElement(By.xpath("//input[contains(@id,'searchtext')]")).sendKeys("watch",Keys.ENTER);
		
		//starts-with()
		WebElement ele2=driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]"));
		ele2.clear();
		ele2.sendKeys("bags",Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
		

	}

}
