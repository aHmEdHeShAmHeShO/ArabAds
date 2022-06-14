package ArabAds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOUt extends PageBase {

	public LogOUt(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="react-burger-menu-btn")
	WebElement SideMenu;
	
	public void OpenSideMenu() {
		SideMenu.click();
	}
	
	@FindBy(id="logout_sidebar_link")
	WebElement LogOut;
	
	public void UserLogOut() {
		LogOut.click();
	}
}
