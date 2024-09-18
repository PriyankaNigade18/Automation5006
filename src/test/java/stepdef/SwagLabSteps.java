package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import apphooks.SwagLabsHooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import utility.BrowserProvider;

public class SwagLabSteps 
{
	/*
	 * Hooks into stedef 
	 * create seperate class and use hooks
	 */
	WebDriver driver=BrowserProvider.getDriver();
	
	/*
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
	*/
	
	String title;
	@Given("Open SwagLab application")
	public void open_swag_lab_application() {
	   driver.get("https://www.saucedemo.com/");
	}

	@When("User get the title of swaglab home page")
	public void user_get_the_title_of_swaglab_home_page() {
	   title=driver.getTitle();
	}

	@Then("Title should matched with swaglab homepage title")
	public void title_should_matched_with_swaglab_homepage_title() {
	    Assert.assertTrue(title.contains("Labs"),"Title not matched!");
	    System.out.println("Title matched!");
	}

	@When("User enter {string} into username text box and {string} into password")
	public void user_enter_into_username_text_box_and_into_password(String un, String pwd) {
	    
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("User click on swaglab login button")
	public void user_click_on_swaglab_login_button() {

		driver.findElement(By.id("login-button")).click();
	}

	@Then("User should able to navigate Inventory page")
	public void user_should_able_to_navigate_inventory_page() {

		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"Login Fail!");
		System.out.println("Login Completed!");
	}


}
