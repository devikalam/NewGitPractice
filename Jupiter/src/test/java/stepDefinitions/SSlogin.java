package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SSlogin {
	public WebDriver driver;
	@Given("Browser should open and URL is navigated")
	public void browser_should_open_and_url_is_navigated() {
		driver=new EdgeDriver();
		driver.get("https://shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}

	@Given("login page should be displayed")
	public void login_page_should_be_displayed() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

	@When("Shopper enters {string} and {string}")
	public void shopper_enters_and(String username, String password) {
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);


	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}

	@Then("shopper should be successfully logged")
	public void shopper_should_be_successfully_logged() {
		Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Hello, ')]")).isDisplayed());
	}

	@Then("Browser is close")
	public void browser_is_close() {
		driver.quit();
	}

	@When("Merchant enters {string} and {string}")
	public void merchant_enters_and(String Musername, String Mpassword) {
		driver.findElement(By.xpath("//button[contains(text(),'Merchant Login')]")).click();
		driver.findElement(By.id("Email")).sendKeys(Musername);
		driver.findElement(By.id("Password")).sendKeys(Mpassword);


	}

	@Then("Merchant should be successfully logged")
	public void merchant_should_be_successfully_logged() {
		System.out.println("merchant not looged in");
	}

	@When("Admin enters {string} and {string}")
	public void admin_enters_and(String Ausername, String Apassword) {
		driver.findElement(By.xpath("//button[contains(text(),'Admin Login')]")).click();
		driver.findElement(By.id("Email")).sendKeys(Ausername);
		driver.findElement(By.id("Password")).sendKeys(Apassword);

	}

	@Then("Admin should be successfully logged")
	public void admin_should_be_successfully_logged() {
		Assert.assertTrue(driver.findElement(By.xpath("//button[contains(text(),'Approved Merchant')]")).isDisplayed());
		System.out.println("admin loged successfully");
	}
	@Given("Shopper login is displayed")
	public void shopper_login_is_displayed() {
		Assert.assertTrue(driver.findElement(By.xpath("//strong[contains(text(),'Shopper')]")).isDisplayed());
	}

	@Given("Merchant login is displayed")
	public void merchant_login_is_displayed() {
		System.out.println("merchant not loged in");
	}

	@Given("Admin login is displayed")
	public void admin_login_is_displayed() {
		Assert.assertTrue(driver.findElement(By.xpath("//button[contains(text(),'Admin Login')]")).isDisplayed());
		
	}



}
