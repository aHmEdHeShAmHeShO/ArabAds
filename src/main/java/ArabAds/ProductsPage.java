package ArabAds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage extends PageBase{

	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement ProductSort;
	
	public void ProductsSort() {
		select=new Select(ProductSort);
		select.selectByValue("lohi");
	}
	
	@FindBy(linkText = "Sauce Labs Onesie")
	WebElement SauceLabsOnesie;
	
	public void OpenSelectedProductDetails() {
		SauceLabsOnesie.click();
	}
	
}
