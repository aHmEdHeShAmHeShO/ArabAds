package ArabAds;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ProductDetailsPage extends PageBase{

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='inventory_details_price']")
	public WebElement ProductPrice;
	
	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	WebElement AddToCart;
	
	public void AddtoCart() {
		AddToCart.click();
	}
	
	@FindBy(className  = "shopping_cart_link")
	WebElement OpenLinkShoppingCart;
	
	public void OpenShoppingCart() {
		OpenLinkShoppingCart.click();
	}
}
