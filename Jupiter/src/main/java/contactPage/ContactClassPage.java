package contactPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class ContactClassPage {
public ContactClassPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//input[@id='forename']")
private WebElement ForenameTF;

public WebElement getForenameTF() {
	return ForenameTF;
}
@FindBy(xpath = "//a[text()='Submit']")
private WebElement submitButton;

@FindBy(xpath = "//input[@id='email']")
private WebElement emailTF;

@FindBy(xpath = "//textarea[@id='message']")
private WebElement messageTF;

public WebElement getSubmitButton() {
	return submitButton;
}

public WebElement getEmailTF() {
	return emailTF;
}

public WebElement getMessageTF() {
	return messageTF;
}

@FindBy(xpath = "//span[text()='Forename is required']")
private WebElement foreNameError;

@FindBy(xpath = "//span[text()='Email is required']")
private WebElement emailError;

@FindBy(xpath = "//span[text()='Message is required']")
private WebElement meassageError;

public WebElement getForeNameError() {
return foreNameError;
}

public WebElement getEmailError() {
return emailError;
}

public WebElement getMeassageError() {
return meassageError;
}



public void submitBtn() throws Throwable {
	Thread.sleep(5000);
	submitButton.click();

}
public void verifyErrorMsg(String forenameEr,String emailEr,String msgEr) {
	boolean flag1 = foreNameError.getText().contains(forenameEr);
	boolean flag2 = emailError.getText().contains(emailEr);
	boolean flag3 = meassageError.getText().contains(msgEr);
	Assert.assertTrue(flag1);  
	Assert.assertTrue(flag2); 
	Assert.assertTrue(flag3); 
	System.out.println("successfully created");
	
}

public void details(String forename,String email,String msg ) throws InterruptedException {
	Thread.sleep(3000);
	//ForenameTF.sendKeys(null);;
	ForenameTF.sendKeys(forename);
	emailTF.sendKeys(email);
	messageTF.sendKeys(msg);
	submitButton.click();
}
}
