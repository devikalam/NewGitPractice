
package stepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Books {
	WebDriver driver;
	@Given("Browser is open to welcome page")
	public void browser_is_open_to_welcome_page() {
		driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@When("user is logged in")
	public void user_is_logged_in(DataTable datatable) {
		driver.findElement(By.partialLinkText("Log in")).click();
		 List<List<String>> data = datatable.asLists();
		String userName = data.get(0).get(0);
		String password = data.get(0).get(1);
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

	@When("user clicks on books page")
	public void user_clicks_on_books_page() {
		driver.findElement(By.partialLinkText("Books")).click();
	}

	@When("books page is displayed")
	public void books_page_is_displayed() {
		Assert.assertTrue(driver.getCurrentUrl().contains("books"));
	}

	@When("user chooses the books in sorting order in dropdown")
	public void user_chooses_the_books_in_sorting_order_in_dropdown() {
		Select sel=new Select(driver.findElement(By.id("products-orderby")));
		sel.selectByVisibleText("Name: A to Z");
	}

	@Then("Page should be displayed in alphabetically")
	public void page_should_be_displayed_in_alphabetically() {
		System.out.println("page should be sorted alphabetically");
	}

	@When("user clicks on add to cart computing and internet")
	public void user_clicks_on_add_to_cart_computing_and_internet() {
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input")).click();
	
	}

	@Then("book should be added to cart")
	public void book_should_be_added_to_cart() {
		
		Assert.assertEquals(driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).getText(), "The product has been added to your ");	
		driver.quit();
	}

	@When("user clicks on add to cart Health book")
	public void user_clicks_on_add_to_cart_health_book() {
		driver.findElement(By.xpath("//a[text()='Health Book']/../..//input")).click();
	System.out.println("health book added to cart");
	}



}
