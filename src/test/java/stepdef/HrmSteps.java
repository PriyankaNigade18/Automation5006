package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HrmSteps {

	WebDriver driver;
	
	@Given("Open Hrm application")
	public void open_hrm_application() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enters {string} and enters {string}")
	public void user_enters_and_enters(String un, String pwd) 
	{
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);
	    
	}

	@When("User click on hrm login button")
	public void user_click_on_hrm_login_button() {
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("As per valid data set user should be navigated to dashboard page")
	public void as_per_valid_data_set_user_should_be_navigated_to_dashboard_page() {
	    
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail!");
		System.out.println("Login completed!");
		
	}



}
