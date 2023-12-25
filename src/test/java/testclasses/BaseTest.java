package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pageclasses.AddToCart;

public class BaseTest {

	WebDriver driver;
	AddToCart cart;
	@BeforeSuite
	public void initBrowser()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://www.betterrhodes.com/");
	}
	
	@BeforeClass
	public void createObject()
	{
		cart=new AddToCart(driver);
	}

	
	
}
