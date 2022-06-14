package TestCases;
import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import ArabAds.CartPage;
import ArabAds.CheckOutCompletePage;
import ArabAds.CheckOutInformationPage;
import ArabAds.CheckOutOverView;
import ArabAds.LogOUt;
import ArabAds.LoginPage;
import ArabAds.ProductDetailsPage;
import ArabAds.ProductsPage;

public class E2ETest extends TestBase {
	LoginPage login;
	ProductsPage product;
	ProductDetailsPage productDetail;
	CartPage cart;
	CheckOutInformationPage userInformation;
	CheckOutOverView overView;
	CheckOutCompletePage completedCheckout;
	LogOUt logout;
	CSVReader reader;
	@Test
	public void UserWorkFlowEcommerce() throws CsvValidationException, IOException, InterruptedException {
		//get path of CSV file
				String csv_file1=System.getProperty("user.dir")+"/src/test/java/TestData/TestData.csv";
				
				reader=new CSVReader(new FileReader(csv_file1));
				
				String [] csvCell;
				// while loop will be executed till the last value in CSV file.
				while ((csvCell=reader.readNext())!=null) {
					String username=csvCell[1];
					String password=csvCell[2];
					
					login=new LoginPage(driver);
					login.UserLogin(username, password);
					
					product=new ProductsPage(driver);
					product.ProductsSort();
					product.OpenSelectedProductDetails();
					
					productDetail=new ProductDetailsPage(driver);
					Assert.assertTrue(productDetail.ProductPrice.isDisplayed());
					productDetail.AddtoCart();
					productDetail.OpenShoppingCart();
					
					cart=new CartPage(driver);
					Assert.assertTrue(cart.ProductName.getText().contains("Sauce Labs Onesie"));
					cart.GoToCheckOut();
					
					userInformation=new CheckOutInformationPage(driver);
					
						String fname=csvCell[4];
						String lname=csvCell[5];
						String postalCode=csvCell[6];
						
						userInformation.UserInformation(fname, lname, postalCode);
					
					
					userInformation.ContinueForOverview();
					
					overView =new CheckOutOverView(driver);
					Assert.assertTrue(overView.TotalAfterTax.isDisplayed());
					overView.FinishOverView();
					
					completedCheckout =new CheckOutCompletePage(driver);
					Assert.assertTrue(completedCheckout.CompletedMessageOrder.getText().contains("THANK YOU FOR YOUR ORDER"));
					
					logout=new LogOUt(driver);
					logout.OpenSideMenu();
					Thread.sleep(2000);
					logout.UserLogOut();
					
					
					
					
				}
	}
	
}
