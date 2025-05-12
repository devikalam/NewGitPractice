package importantscenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import allcartsutility.AllCartsPage;
import baseClassUtility.BaseClass;
import cartPageUtility.CartPage;
import excelutility.ExcelUtilityClass;
import homePage.HomeClassPage;
import itemutility.ItemsPage;
import javautility.JavaUtils;

public class Scenario3{
	@Test
	public void scnarioTest() throws Throwable {
		ExcelUtilityClass elib=new ExcelUtilityClass();
		JavaUtils jlib=new JavaUtils();
		float fluffyQty= Float.parseFloat(elib.getDataFromExceFile("cart", 1, 0));
		float valentineQty = Float.parseFloat(elib.getDataFromExceFile("cart", 1, 1));
		float stuffedfrogQty = Float.parseFloat(elib.getDataFromExceFile("cart", 1, 2));



		WebDriver driver=new EdgeDriver();
		//driver.get("https://jupiter.cloud.planittesting.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		HomeClassPage hp=new HomeClassPage(driver);
		hp.getStartShoppingBtn().click();
		Thread.sleep(2000);

		AllCartsPage ap=new AllCartsPage(driver);
		float fluffyPrice = Float.parseFloat(ap.getFluffyBunny().getText().replace("$", ""));
		float stuffedPrice = Float.parseFloat(ap.getStuffedFrog().getText().replace("$", ""));
		float valentinePrice = Float.parseFloat(ap.getValentineBear().getText().replace("$", ""));
		System.out.println(valentinePrice);

		ap.addProductsToCart();
		hp.getCartLink().click();

		float sumFlufySubTotal = jlib.roundOffNumber(fluffyPrice*fluffyQty);
		float sumValentineSubTotal= jlib.roundOffNumber(valentinePrice  *valentineQty);
		float sumStuffedSubTotal=jlib.roundOffNumber(stuffedPrice*stuffedfrogQty);

		ItemsPage ip=new ItemsPage(driver);
		float subTotalFluffy = Float.parseFloat(ip.getActFluffyPrice().getText().replace("$", ""));
		float subTotalStuffed = Float.parseFloat(ip.getActStuffedPrice().getText().replace("$", ""));
		float subTotalValentine = Float.parseFloat(ip.getActValentinePrice().getText().replace("$",""));

		Assert.assertEquals(sumFlufySubTotal, subTotalFluffy);
		Assert.assertEquals(sumStuffedSubTotal, subTotalStuffed);
		Assert.assertEquals(sumValentineSubTotal, subTotalValentine);



	}

}

