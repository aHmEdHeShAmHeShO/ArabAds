package ArabAds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase {

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='inventory_item_name']")
	public WebElement ProductName;
	
	@FindBy(id="checkout")
	WebElement CheckOut;
	
	public void GoToCheckOut() {
		CheckOut.click();
	}

}
