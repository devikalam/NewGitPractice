package baseClassUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import excelutility.ExcelUtilityClass;
import excelutility.FileUtility;
import homePage.HomeClassPage;

public class BaseClass {
public WebDriver driver;
public ExcelUtilityClass el=new ExcelUtilityClass();
public FileUtility flib=new FileUtility();


@BeforeClass
public void configBC() throws Throwable {

	String BROWSER=flib.getDataFromPropertyFile("browser");
	String URL = flib.getDataFromPropertyFile("url");
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	
	if(BROWSER.equals("chrome")) {
	driver=new ChromeDriver();
	}
	else if(BROWSER.equals("edge")) {
		driver=new EdgeDriver();
	}
	else if(BROWSER.equals("firefox")) {
		driver=new FirefoxDriver();
	}
	else {
		driver=new ChromeDriver();
	}
	System.out.println("launch browser");
}
 @AfterMethod
public void conficAM() {
	HomeClassPage hp=new HomeClassPage(driver);

	
	
}
}
