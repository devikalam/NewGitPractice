package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	@Given("Browser is open and URL is navigated")
	public void browser_is_open_and_url_is_navigated() {
	   driver=new EdgeDriver();
	   driver.get("https://demowebshop.tricentis.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	}

	@Given("login page is displayed")
	public void login_page_is_displayed() {
	   driver.findElement(By.partialLinkText("Log in")).click();
	   
	}

	@When("enter valid username and valid password")
	public void enter_valid_username_and_valid_password() {
	   driver.findElement(By.id("Email")).sendKeys("devikalam@gmail.com");
	   driver.findElement(By.id("Password")).sendKeys("kalamdevi@123");
	   
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	   driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

	@Then("user should be susccesfully logged in")
	public void user_should_be_susccesfully_logged_in() {
	  
	Assert.assertTrue(driver.findElement(By.partialLinkText("Log out")).isDisplayed());
	
	}

	@Then("browser should close")
	public void browser_should_close() {
	    driver.close();
	}




}
