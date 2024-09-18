package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class AmazonSteps 
{
	WebDriver driver;
	String title;
	
	@Given("Opem amazon application with url {string}")
	public void opem_amazon_application_with_url(String url) {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get(url);
	}

	@When("user get the title for amazon home page")
	public void user_get_the_title_for_amazon_home_page() {
	    title=driver.getTitle();
	}

	@Then("title should matched with amazon home page")
	public void title_should_matched_with_amazon_home_page() {
	    Assert.assertTrue(title.contains("India"),"title is not matched!...Test Fail");
	    System.out.println("Title matched: "+title);
	}

	@When("User click on BestSellers option link")
	public void user_click_on_best_sellers_option_link() {
	    driver.findElement(By.linkText("Best Sellers")).click();
	}

	@When("User get the title of bestseller page")
	public void user_get_the_title_of_bestseller_page() {
	    title=driver.getTitle();
	}

	@Then("title should matched with bestsellers title")
	public void title_should_matched_with_bestsellers_title() {
		Assert.assertTrue(title.contains("Bestsellers"),"title is not matched!...Test Fail");
	    System.out.println("Title matched: "+title);
	}

	@When("User click on Mobiles option link")
	public void user_click_on_mobiles_option_link() {
	    driver.findElement(By.linkText("Mobiles")).click();
	}

	@When("User get the title of Mobile page")
	public void user_get_the_title_of_mobile_page() {
	    title=driver.getTitle();
	}

	@Then("title should matched with Mobiles title")
	public void title_should_matched_with_mobiles_title() {
		Assert.assertTrue(title.contains("Phones"),"title is not matched!...Test Fail");
	    System.out.println("Title matched: "+title);	    
	}



}
