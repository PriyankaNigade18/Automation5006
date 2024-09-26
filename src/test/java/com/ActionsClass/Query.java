package com.ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Query {

	public static void main(String[] args) throws InterruptedException 
	{
		 //create driver driver
		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		  driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		  
		  driver.manage().window().maximize();
		  //First Name
		  driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("Sourabh");
		  
		  //last Name
		  driver.findElement(By.xpath("//input[@name='RESULT_TextField-2']")).sendKeys("Kumbhar");

		  
		  //Phone number
		  driver.findElement(By.xpath("//input[@name='RESULT_TextField-3']")).sendKeys("9172194936");
		  
		  
		  //Country
		  driver.findElement(By.xpath("//input[@name='RESULT_TextField-4']")).sendKeys("India");
		  
		  //City
		  driver.findElement(By.xpath("//input[@name='RESULT_TextField-5']")).sendKeys("Kolhapur");
		  
		  
		  //Email ID
		  driver.findElement(By.xpath("//input[@name='RESULT_TextField-6']")).sendKeys("test@gmail.com");
		  //Thread.sleep(7000);
		  
		  
//		  //Scrolling Down
		  JavascriptExecutor js=(JavascriptExecutor) driver;
//		  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		  
		  //Gender
		 WebElement ele=driver.findElement(By.xpath("(//input[contains(@name,'RESULT_RadioButton')])[1]"));
		 js.executeScript("arguments[0].click()",ele);
		 
		  //radio.click();
		 // System.out.println(radio.isSelected());
		  
		 
		  //driver.findElement(By.xpath("(//div[@id='q26']//input[contains(@class,'multiple_choice')])[1]")).click();
		  
		  //driver.findElement(By.xpath("//div[@id='q15']//table//tbody//tr//td//input[@id='RESULT_CheckBox-8_0']")).click();	  
		  

	}

}
