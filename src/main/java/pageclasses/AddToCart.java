package pageclasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	WebDriver driver;
	@FindBy(xpath="(//*[@class='site-header__search-input'])[1]")WebElement search;
	
	@FindBy(xpath="//*[text()='Freixenet Alcohol-Removed Sparkling White Wine']")WebElement product ;
	
	@FindBy(xpath="//*[@class='make-sticky-test is-sticky-btn-mobile-only btn btn--full add-to-cart ']")WebElement addtocart ;
	
	@FindBy(xpath="//*[name()='circle' and contains(@cx,'10')]")WebElement popup;
	
	public AddToCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void popupHandle() throws InterruptedException
	{
		Thread.sleep(5000);
		
	}
	public void search()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//search.sendKeys(searchtext);
		js.executeScript("arguments[0].value='wine'", search);
		Actions act =new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	
	public void productImage()
	{
		product.click();
	}
	
	public void addToCart()
	{
		addtocart.click();
	}
	
}
