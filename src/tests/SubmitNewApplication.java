package tests;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import framework.Utilities;
import pages.DashboardPage;
import pages.HomePage;
import pages.Page1;
import pages.Page2;
import pages.Page3;
import pages.Page4;
import pages.Page5;

public class SubmitNewApplication extends BaseTest {


	@Test
	public void verifySubmitNewApplication() throws Exception {
		
		HomePage homePage = new HomePage(driver);
		Page1 page1 = new Page1(driver);
		Page2 page2 = new Page2(driver);
		Page3 page3 = new Page3(driver);
		Page4 page4 = new Page4(driver);
		Page5 page5 = new Page5(driver);
		
		// verify home page title
		Assert.assertEquals("City of Atlanta GA SBE Program", homePage.getTitle());
		// click on start application
		Thread.sleep(2000);
		homePage.clickStartApplication();
		Thread.sleep(2000);		
		homePage.clickStartApplication();
		//Assert.assertEquals("Please choose Certification or Recertification process", homePage.getLabelText());
		
		
		// click on continue for new application 
		homePage.continueNewApplication();
		
		// verify page 1 header
		//Assert.assertEquals(1, page1.getPageCount());
		
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
		page2.SelectCertificationApplyingFor();
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
		Thread.sleep(2000);
	//	Assert.assertEquals(3, page1.getPageCount());
		
		// fill page 3 form 
		page3.selectJurisdiction("City of Atlanta GA");
		page3.selectCertificationType("AABE");
		page3.enterDateOfIssue("06/11/2018");
		page3.enterCertificateNumber("123654987");
		page3.clickSaveCertification();
		Thread.sleep(10000);
		//Assert.assertEquals(4, page1.getPageCount());
		boolean savedStatus = page3.findCertIdInTable("123654987");
		Assert.assertEquals(savedStatus, true);
		page3.selectCertificateLetterCheck();
		Thread.sleep(2000);
		homePage.continueFormButton();
		
		// fill page 4 form 
		page4.selectTypeOfFirm("Corporation");
		page4.enterDateEstablished("06/11/2018");
		page4.selectMethodOfAcquisition("Started as a new business");
		page4.selectMainArea("Construction");
		page4.enterIndustryCode("236100 Residential Building Construction (NAICS)");
		page4.clickAddCodeButton();
		Thread.sleep(4000);
		boolean industryStatus = page4.verifyIndustryCodeSaved("236100");
		Assert.assertEquals(industryStatus, true);
		homePage.continueFormButton();
		
		// fill page 5 form 
		page5.uploadFile1("D:\\Prism Docs\\testfile.txt");
		Thread.sleep(5000);
		page5.uploadFile2("D:\\Prism Docs\\testfile.txt");
		Thread.sleep(5000);
		page5.uploadFile3("D:\\Prism Docs\\testfile.txt");
		Thread.sleep(5000);
		page5.uploadFile4("D:\\Prism Docs\\testfile.txt");
		Thread.sleep(5000);
		page5.selectNACheck();
		Thread.sleep(9000);
		homePage.continueFormButton();
		
		
	}		
}
