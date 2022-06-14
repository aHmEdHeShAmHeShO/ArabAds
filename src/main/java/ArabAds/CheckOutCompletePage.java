package ArabAds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutCompletePage extends PageBase {

	public CheckOutCompletePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//h2[@class='complete-header']")
	public WebElement CompletedMessageOrder;
	

}
