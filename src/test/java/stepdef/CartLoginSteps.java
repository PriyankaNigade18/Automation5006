package stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class CartLoginSteps
{
	WebDriver driver;
	@Given("Open application with url {string}")
	public void open_application_with_url(String url) {
	    
		driver=new ChromeDriver();
		driver.get(url);
	}

	@When("user enters credentials")
	public void user_enters_credentials(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String,String>> map=table.asMaps();
		driver.findElement(By.name("email")).sendKeys(map.get(0).get("email"));
		driver.findElement(By.name("password")).sendKeys(map.get(0).get("pwd"));
	   
	}

	@When("User click on Cart Login button")
	public void user_click_on_cart_login_button() {
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("User should able to login into application")
	public void user_should_able_to_login_into_application() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("account"),"Login Fail");
	    System.out.println("Login completed!");
	    
	}

}
