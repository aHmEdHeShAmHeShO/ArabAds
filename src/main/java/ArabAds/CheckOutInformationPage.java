package ArabAds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutInformationPage extends PageBase{

	public CheckOutInformationPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id="first-name")
	WebElement FirstName;
	
	@FindBy(id="last-name")
	WebElement LastName;
	
	@FindBy(id="postal-code")
	WebElement PostalCode;
	
	public void UserInformation(String fname, String lname,String postalcode) {
		FirstName.sendKeys(fname);
		LastName.sendKeys(lname);
		PostalCode.sendKeys(postalcode);
	}
	
	@FindBy(id="continue")
	WebElement ContinueBtn;
	
	public void ContinueForOverview() {
		ContinueBtn.click();
	}
}
