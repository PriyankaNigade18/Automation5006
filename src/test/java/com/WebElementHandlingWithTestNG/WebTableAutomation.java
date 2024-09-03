package com.WebElementHandlingWithTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebTableAutomation {
  @Test
  public void testTable()
  {
	  WebDriver driver=new ChromeDriver();
	 driver.get("https://testautomationpractice.blogspot.com/");
	 
	 System.out.println("*******Get the Headings of the table**********");
	 
	 List<WebElement> headings=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//th"));
	 System.out.println("Total Headings: "+headings.size());
	 for(WebElement i:headings)
	 {
		 System.out.println(i.getText());
	 }
	 System.out.println("*******Number of Rows**********");
	 List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr"));
	  	
	 System.out.println("Total Rows without Heading are: "+(rows.size()-1));
	 
	 
	 System.out.println("*******Number of Columns**********");

	 int cell=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[1]//th")).size();
	 System.out.println("Total Columns are: "+cell);
	 
	 System.out.println("***********Get the row 3***********");
	 List<WebElement> rowdata=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[4]/td"));
	 
	 for(WebElement i: rowdata)
	 {
		 System.out.print(i.getText()+" ");
	 }
	 
	 
	 System.out.println("***********Get the Author column **************");
	 
	 List<WebElement> celldata=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[2]"));
	 
	 for(WebElement i:celldata)
	 {
		 System.out.println(i.getText());
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
  }
}
