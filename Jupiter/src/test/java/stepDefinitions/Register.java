package stepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	WebDriver driver;
	@Given("Browser is open")
	public void browser_is_open() {
		 driver=new EdgeDriver();
		   
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Given("URL is navigated")
	public void url_is_navigated() {
		driver.get("https://demowebshop.tricentis.com/");
	    	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials(DataTable dataTable) {
		
	   driver.findElement(By.partialLinkText("Register")).click();
	   List<List<String>> data = dataTable.asLists();
	  // System.out.println(data.getClass());
	   driver.findElement(By.xpath("//input[@value='"+data.get(1).get(0)+"']")).click();
	   driver.findElement(By.id("FirstName")).sendKeys(data.get(1).get(1));
	   
   driver.findElement(By.id("LastName")).sendKeys(data.get(1).get(2));
	   driver.findElement(By.id("Email")).sendKeys(data.get(1).get(3));
	   driver.findElement(By.id("Password")).sendKeys(data.get(1).get(4));
	   driver.findElement(By.id("ConfirmPassword")).sendKeys(data.get(1).get(4));
	   
//	   driver.findElement(By.id("gender-female")).click();
//	   driver.findElement(By.id("FirstName")).sendKeys("varshini");
//	   driver.findElement(By.id("LastName")).sendKeys("saride");
//	   driver.findElement(By.id("Email")).sendKeys("varshinisaride1@gmail.com");
//	   driver.findElement(By.id("Password")).sendKeys("varshini@123");
//	   driver.findElement(By.id("ConfirmPassword")).sendKeys("varshini@123");
	   
	}

	@When("Clicks on Register button")
	public void clicks_on_register_button() {
		driver.findElement(By.id("register-button")).click();
	}

	@Then("New account is created")
	public void new_account_is_created() {
	   Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).isDisplayed());
	}

	@Then("Browser is closed")
	public void browser_is_closed() {
	   driver.quit();
	}

}
