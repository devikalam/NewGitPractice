package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	public WebDriver driver;
	public String searchItem;
	
	@Given("Welcome page should be displayed")
	public void welcome_page_should_be_displayed() {
		 driver=new EdgeDriver();
		    driver.get("https://demowebshop.tricentis.com/");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
	}

	@When("^user enter \"([^\"]*)\" in searchTextField and click on enter$")
	public void user_enter_in_search_text_field_and_click_on_enter(String searchItem) {
		this.searchItem=searchItem;
		driver.findElement(By.id("small-searchterms")).sendKeys(searchItem);
	    driver.findElement(By.xpath("//input[@value='Search']")).click();
	}

	@Then("search results should be displayed")
	public void search_results_should_be_displayed() {
		 Assert.assertTrue(driver.findElement(By.id("Q")).isDisplayed());
		 driver.quit();
	}




}
