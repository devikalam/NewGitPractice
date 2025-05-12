package itemutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  ItemsPage{
	public ItemsPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[@class='ng-binding' and contains(text(),'Fluffy Bunny')]/ancestor::tr[@class='cart-item ng-scope']/descendant::td[2]")
	private WebElement afterFluffyPrice;
	
	@FindBy(xpath = "//td[@class='ng-binding' and contains(text(),'Stuffed Frog')]/ancestor::tr[@class='cart-item ng-scope']/descendant::td[2]")
	private WebElement afterStuffedFrog;
	
	@FindBy(xpath = "//td[@class='ng-binding' and contains(text(),'Valentine Bear')]/ancestor::tr[@class='cart-item ng-scope']/descendant::td[2]")
	private WebElement afterValentineBear;
	

	@FindBy(xpath = "//td[@class='ng-binding' and contains(text(),'Fluffy Bunny')]/ancestor::tr[@class='cart-item ng-scope']/descendant::td[4]")
	private WebElement actFluffyPrice;
	
	@FindBy(xpath = "//td[@class='ng-binding' and contains(text(),'Stuffed Frog')]/ancestor::tr[@class='cart-item ng-scope']/descendant::td[4]")
	private WebElement actStuffedPrice;
	
	@FindBy(xpath = "//td[@class='ng-binding' and contains(text(),'Valentine Bear')]/ancestor::tr[@class='cart-item ng-scope']/descendant::td[4]")
	private WebElement actValentinePrice;

	public WebElement getAfterFluffyPrice() {
		return afterFluffyPrice;
	}

	public WebElement getAfterStuffedFrog() {
		return afterStuffedFrog;
	}

	public WebElement getAfterValentineBear() {
		return afterValentineBear;
	}

	public WebElement getActFluffyPrice() {
		return actFluffyPrice;
	}

	public WebElement getActStuffedPrice() {
		return actStuffedPrice;
	}

	public WebElement getActValentinePrice() {
		return actValentinePrice;
	}
	

}
