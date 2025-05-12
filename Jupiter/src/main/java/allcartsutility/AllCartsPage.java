package allcartsutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllCartsPage {
	public AllCartsPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h4[text()='Fluffy Bunny']/ancestor::li[@class='product ng-scope']/descendant::span")
	private WebElement fluffyBunny;
	
	@FindBy(xpath = "//h4[text()='Stuffed Frog']/ancestor::li[@class='product ng-scope']/descendant::span")
	private WebElement stuffedFrog;
	
	@FindBy(xpath = "//h4[text()='Valentine Bear']/ancestor::li[@class='product ng-scope']/descendant::span")
	private WebElement valentineBear;
	
	@FindBy(xpath = "//h4[text()='Valentine Bear']/ancestor::li[@class='product ng-scope']/descendant::a")
	private WebElement buyValentineBear;
	
	@FindBy(xpath = "//h4[text()='Fluffy Bunny']/ancestor::li[@class='product ng-scope']/descendant::a")
	private WebElement buyFluffyBunny;
	
	@FindBy(xpath = "//h4[text()='Stuffed Frog']/ancestor::li[@class='product ng-scope']/descendant::a")
	private WebElement buysStuffedFrog;

	
	public WebElement getBuyValentineBear() {
		return buyValentineBear;
	}

	public WebElement getBuyFluffyBunny() {
		return buyFluffyBunny;
	}

	public WebElement getBuysStuffedFrog() {
		return buysStuffedFrog;
	}
	
	public WebElement getFluffyBunny() {
		return fluffyBunny;
	}

	public WebElement getStuffedFrog() {
		return stuffedFrog;
	}

	public WebElement getValentineBear() {
		return valentineBear;
	}
	
public void addProductsToCart() {
	for(int i=0;i<5;i++) {
		buyFluffyBunny.click();
	}
	for(int i=0;i<2;i++) {
		buysStuffedFrog.click();
	}
	for(int i=0;i<3;i++) {
		buyValentineBear.click();
	}
}
}
