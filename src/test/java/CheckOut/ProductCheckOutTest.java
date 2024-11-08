package CheckOut;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.centralpoint.ConfigurationUtility.BaseClass;
import com.centrepoint.ObjectRepository.CartPage;
import com.centrepoint.ObjectRepository.OverViewPage;
import com.centrepoint.ObjectRepository.WomenClothingListPage;
import com.centrepoint.ObjectRepository.WomensPage;



public class ProductCheckOutTest extends BaseClass
{
	@Test
	public void checkOutTest() throws InterruptedException
	{
		
		OverViewPage hp=new OverViewPage(driver);
		hp.getCloseicon().click();
		
		hp.getWomensOption().click();
		WomensPage wp=new WomensPage(driver);
		wp.getClothingOptions().click();
		WomenClothingListPage cp=new WomenClothingListPage(driver);
	    web.waitTillVisibilityOfElement(driver, cp.getProductImg());
		web.moveToTheElement(driver, cp.getProductImg());
		web.waitTillVisibilityOfElement(driver, cp.getSize());
		cp.getSize().click();
		cp.getAddToBasket().click();;
		cp.getCart().click();
		CartPage ctp=new CartPage(driver);
		ctp.getCheckOutOption().click();
	}

}
