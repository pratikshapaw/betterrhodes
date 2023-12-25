package testclasses;

import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

	@Test(priority=1)
	public void validatePopup() throws InterruptedException
	{
		cart.popupHandle();
	}
	
	@Test(priority=2)
	public void validateSearch()
	{
		cart.search();
	}
	
	@Test(priority=3)
	public void validateProduct()
	{
		cart.productImage();
	}
	
	@Test(priority=4)
	public void validateAddToCart()
	{
		cart.addToCart();
	}
}
