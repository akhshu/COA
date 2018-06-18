package tests;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.HomePage;
import pages.Page1;

public class SubmitNewApplication extends BaseTest {


	@Test
	public void verifyHomePage() throws Exception {
		HomePage homePage = new HomePage(driver);
		Page1 page1 = new Page1(driver);
		// verify home page title
		Assert.assertEquals("City of Atlanta GA SBE Program", homePage.getTitle());
		// click on start application
		Thread.sleep(4000);
		homePage.clickStartApplication();
		Thread.sleep(4000);		
		homePage.clickStartApplication();
		Assert.assertEquals("Please choose Certification or Recertification process", homePage.getLabelText());
		
		// click on continue for new application 
		homePage.continueNewApplication();
		
		// verify page 1 header
		int pageCount = page1.getPageCount();
		System.out.println("page count is : "+ 1);
		Assert.assertEquals(1, pageCount);
		
	}		
}
