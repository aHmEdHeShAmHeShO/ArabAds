package ArabAds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutOverView extends PageBase{

	public CheckOutOverView(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='summary_total_label']")
	public WebElement TotalAfterTax;
	
	@FindBy(id="finish")
	WebElement FinishBtn;
	
	public void FinishOverView() {
		FinishBtn.click();
	}
	

}
