package importantscenario;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import baseClassUtility.BaseClass;
import contactPage.ContactClassPage;
import excelutility.ExcelUtilityClass;
import homePage.HomeClassPage;

public class Scenario1 extends BaseClass{

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		ExcelUtilityClass el=new ExcelUtilityClass();
		String foreName = el.getDataFromExceFile("contacts", 1, 0);
		String email = el.getDataFromExceFile("contacts", 1, 1);
		String message = el.getDataFromExceFile("contacts", 1, 2);
		String forenameError = el.getDataFromExceFile("contacts", 2, 0);
		String emailError = el.getDataFromExceFile("contacts", 2, 1);
		String messageError = el.getDataFromExceFile("contacts", 2, 2);


		driver.get("https://jupiter.cloud.planittesting.com/");
		HomeClassPage hs=new HomeClassPage(driver);
		hs.contact();
		ContactClassPage cs=new ContactClassPage(driver);
		cs.submitBtn();
		cs.verifyErrorMsg(forenameError, emailError, messageError);
		cs.details(forenameError, emailError, messageError);

	}
}
