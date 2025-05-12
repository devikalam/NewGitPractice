package successmsgpageutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClassUtility.BaseClass;

public class SuccessMessgePage{
	public SuccessMessgePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//strong[text()='Thanks devika']")
    private WebElement successMsg;
	
	public WebElement getSuccessMsg() {
		return successMsg;
	}
	public void verifysuccessmsg(String msg) {
		
		boolean flag = successMsg.getText().contains(msg);
		System.out.println(flag);
	}

}
