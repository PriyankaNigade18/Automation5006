package stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class CartSteps
{

	WebDriver driver;
@Given("Open Register page with url {string}")
public void open_register_page_with_url(String url) 
{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(url);
    
}

@When("User enters required entries")
public void user_enters_required_entries(DataTable table) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    
	List<Map<String,String>> data=table.asMaps();
	driver.findElement(By.name("firstname")).sendKeys(data.get(0).get("fname"));
	driver.findElement(By.name("lastname")).sendKeys(data.get(0).get("lname"));
	driver.findElement(By.name("email")).sendKeys(data.get(0).get("emailId"));
	driver.findElement(By.name("telephone")).sendKeys(data.get(0).get("tele"));
	driver.findElement(By.name("password")).sendKeys(data.get(0).get("pwd"));
	driver.findElement(By.name("confirm")).sendKeys(data.get(0).get("cpwd"));
	
	
	
	
}

@When("User click on yes Newsletter")
public void user_click_on_yes_newsletter() {

driver.findElement(By.xpath("//label[text()='Yes']")).click();

}

@When("User check the privacy policy option")
public void user_check_the_privacy_policy_option() {

driver.findElement(By.name("agree")).click();
}

@When("User click on continue button")
public void user_click_on_continue_button() 
{
    driver.findElement(By.xpath("//input[@value='Continue']")).click();
    
    
}

@Then("User User should be able to register")
public void user_user_should_be_able_to_register() {
   System.out.println("Test for message");
}



}
