package importantscenario;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import baseClassUtility.BaseClass;
import contactPage.ContactClassPage;
import excelutility.ExcelUtilityClass;
import homePage.HomeClassPage;
import successmsgpageutility.SuccessMessgePage;


public class Scnario2{
	@Test(invocationCount = 4)
	public void scarioTest() throws Throwable {
		
		WebDriver driver=new EdgeDriver();
		ExcelUtilityClass el=new ExcelUtilityClass();
		String foreName = el.getDataFromExceFile("contacts", 1, 0);
		String email = el.getDataFromExceFile("contacts", 1, 1);
		String message = el.getDataFromExceFile("contacts", 1, 2);
		String forenameError = el.getDataFromExceFile("contacts", 2, 0);
		String emailError = el.getDataFromExceFile("contacts", 2, 1);
		String messageError = el.getDataFromExceFile("contacts", 2, 2);
		String successMsg = el.getDataFromExceFile("contacts", 3, 2);


		driver.get("https://jupiter.cloud.planittesting.com/");
		HomeClassPage hs=new HomeClassPage(driver);
		
		hs.contact();
		ContactClassPage cs=new ContactClassPage(driver);
		cs.details(foreName, email, message);
		//cs.submitBtn();
		//cs.verifyErrorMsg(forenameError, emailError, messageError);
		//cs.details(forenameError, emailError, messageError);
		Thread.sleep(5000);
		SuccessMessgePage sm=new SuccessMessgePage(driver);
		
		sm.verifysuccessmsg(successMsg);
	}

}
