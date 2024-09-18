package apphooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.BrowserProvider;

public class SwagLabsHooks 
{

	public WebDriver driver;
	
	@Before
	public void setUp1()
	{
		System.out.println("Browser will launch");
		//driver=new ChromeDriver();
		driver=BrowserProvider.setDriver("chrome");
		
		
	}
	
	@After
	public void tearDown1()
	{
		System.out.println("Browser closed");
		driver.quit();
		
	}
	
}
