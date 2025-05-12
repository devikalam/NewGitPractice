package bddFrameWork;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TLD {
	@Test
	public void tdd() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		//click on books button
		driver.findElement(By.partialLinkText("Books")).click();
		//click on add to cart
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input")).click();
		//driver.findElement(By.xpath("//input[@id='add-to-cart-button-13']")).click();
		//Assert.assertTrue(driver.findElement(By.className("content")).getText().contains("The product has been added to your "));
Assert.assertTrue(driver.findElement(By.xpath("//p[@class='content']")).getText().contains("The product has been added to your "));
	}

}
