package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo10_XpathAxies {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=tetds&submit-name=");

		//ancestor
		String tag1=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
		System.out.println("Ancestor for John is: "+tag1);
		
		
		//parent
		String tag2=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		
		System.out.println("Parent node for John is: "+tag2);

		
		//child
		int count=driver.findElements(By.xpath("//tbody//tr[4]//child::td")).size();	
		System.out.println("For row 4 all child element count is: "+count);//5
		
		//following
		int frows=driver.findElements(By.xpath("//td[text()='John']//following::tr")).size();
		System.out.println("After john all rows are: "+frows);
		
	//preceding
		
		int prows=driver.findElements(By.xpath("//td[text()='John']//preceding::tr")).size();
		System.out.println("Before john all the rows are: "+prows);
		
		//following-sibling
		int sfcount=driver.findElements(By.xpath("//td[text()='John']//following-sibling::td")).size();
		System.out.println("All following siblings of John: "+sfcount);
		
		
		//preceding-sibling
		int pscount=driver.findElements(By.xpath("//td[text()='John']//preceding-sibling::td")).size();
		System.out.println("All preceding siblings of John: "+pscount);
	}

}
