package com.ActionsClass;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileUploadUsingRobotClass {
  @Test
  public void testFileUpload() throws AWTException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //choose the file
	  WebElement ele=driver.findElement(By.id("file-upload"));
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).click().perform();
	  
	  //Robot class
	  Robot rb=new Robot();
	  rb.delay(5000);
	  
	//Clip board action
	  StringSelection sc=new StringSelection("C:\\Users\\Ganes\\OneDrive\\Desktop\\Appiumsetup.txt");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc,null);
	  
	  //ctrl+v
	  
	  //press the key
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_V);
	  
	  //release key
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	  rb.keyRelease(KeyEvent.VK_V);
	  
	  //Enter
	  rb.keyPress(KeyEvent.VK_ENTER);
	  
	  //upload
	  driver.findElement(By.id("file-submit")).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
