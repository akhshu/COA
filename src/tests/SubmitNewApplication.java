package tests;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import framework.Utilities;
import pages.DashboardPage;
import pages.HomePage;
import pages.Page1;
import pages.Page2;

public class SubmitNewApplication extends BaseTest {


	@Test
	public void verifySubmitNewApplication() throws Exception {
		
		HomePage homePage = new HomePage(driver);
		Page1 page1 = new Page1(driver);
		Page2 page2 = new Page2(driver);
		// verify home page title
		Assert.assertEquals("City of Atlanta GA SBE Program", homePage.getTitle());
		// click on start application
		Thread.sleep(2000);
		homePage.clickStartApplication();
		Thread.sleep(2000);		
		homePage.clickStartApplication();
		Assert.assertEquals("Please choose Certification or Recertification process", homePage.getLabelText());
		
		
		// click on continue for new application 
		homePage.continueNewApplication();
		
		// verify page 1 header
		Assert.assertEquals(1, page1.getPageCount());
		
		// select No options from page 1 
		page1.selectAllNoOptions();
		homePage.continueFormButton();
		// verify page 2 header 
		Assert.assertEquals(2, page1.getPageCount());
		
		// enter unique federal tax id on page 2 
		page2.enterFederalTaxId(Integer.toString(Utilities.getRandonNumber(9)));
		page2.clickFindMe();
		// verify that tax id is unique 
		Assert.assertEquals("Vendor is not found. Please, complete the vendor profile.",page2.getVendorNotFound());
		
		// fill page 2 form 
		page2.selectState("IOWA");
		Thread.sleep(4000);
		page2.enterCompanyName("test company 1");
		page2.enterStreetAddress("test address 1");
		page2.enterCity("chandigarh");
		page2.enterZip("213456");
		page2.enterBussinessPhone("9876543210");
		page2.enterPrimaryContactName("akhilesh shukla");
		page2.enterEmail("test@abc.com");
		page2.enterTitle("CEO");
		page2.enterEmailToSendApplicationId("test2@abcd.com");
		homePage.continueFormButton();
		
		Assert.assertEquals(3, page1.getPageCount());
		
	}		
}
