package homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeClassPage {
	public HomeClassPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@id='nav-contact']")
	private WebElement contactLink;
	
	@FindBy(xpath = "//li[@id='nav-cart']")
	private WebElement cartLink;

	public WebElement getCartLink() {
		return cartLink;
	}
	
	@FindBy(xpath = "//a[@class='btn btn-success btn-large']")
	private WebElement startShoppingBtn;
	
	public WebElement getStartShoppingBtn() {
		return startShoppingBtn;
	}

	public WebElement getContactLink() {
		return contactLink;
	}	
		public void contact() {
			contactLink.click();
			
		
	}
}
