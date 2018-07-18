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
import pages.Page10;
import pages.Page11;
import pages.Page12;
import pages.Page13;
import pages.Page14;
import pages.Page15;
import pages.Page16;
import pages.Page2;
import pages.Page3;
import pages.Page4;
import pages.Page5;
import pages.Page6;
import pages.Page7;
import pages.Page8;
import pages.Page9;

public class SubmitNewApplication extends BaseTest {


	@Test
	public void verifySubmitNewApplication() throws Exception {
		
		HomePage homePage = new HomePage(driver);
		Page1 page1 = new Page1(driver);
		Page2 page2 = new Page2(driver);
		Page3 page3 = new Page3(driver);
		Page4 page4 = new Page4(driver);
		Page5 page5 = new Page5(driver);
		Page6 page6 = new Page6(driver);
		Page7 page7 = new Page7(driver);
		Page8 page8 = new Page8(driver);
		Page9 page9 = new Page9(driver);
		Page10 page10 = new Page10(driver);
		Page11 page11 = new Page11(driver);
		Page12 page12 = new Page12(driver);
		Page13 page13 = new Page13(driver);
		Page14 page14 = new Page14(driver);
		Page15 page15 = new Page15(driver);
		Page16 page16 = new Page16(driver);
		
		String fname = page5.getFileName("D:\\Prism Docs\\testfile1.txt");
		System.out.println("Filename is : " + fname);
		
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
		page5.uploadFile1("D:\\Prism Docs\\testfile1.txt");
		page5.verifyFileUploaded("D:\\Prism Docs\\testfile1.txt");

		page5.uploadFile2("D:\\Prism Docs\\testfile2.txt");
		page5.verifyFileUploaded("D:\\Prism Docs\\testfile2.txt");

		page5.uploadFile3("D:\\Prism Docs\\testfile3.txt");
		page5.verifyFileUploaded("D:\\Prism Docs\\testfile3.txt");

		page5.uploadFile4("D:\\Prism Docs\\testfile4.txt");
		page5.verifyFileUploaded("D:\\Prism Docs\\testfile4.txt");

		page5.selectNACheck();
		Thread.sleep(9000);

		homePage.continueFormButton();
		
//		String name = "alpachino";
//		String owenershippercent = "100";
//		String title = "CEO";
//		String gender = "Male";
//		String race = "Native American";
//		String acquiredDate = "07/06/2018";
//		String streetAddress = "chandigarh";
//		String city = "chd";
//		String zip = "225566";
//		String State = "ALASKA";
//		String HomePhone = "9121545487";
		
		// fill page 6 form
		page6.enterName("al pachino");
		page6.enterOwenershipPercentage("100");
		page6.enterTitle("ceo");
		page6.selectGender("Male");
		page6.selectRace("Native American");
		page6.enterAcquiredDate("06/11/2018");
		page6.enterStreetAddress("Chandigarh");
		page6.enterCity("chd");
		page6.enterZip("226655");
		page6.selectState("ALASKA");
		page6.enterHomePhone("9632587410");
		page6.clickSaveOwener();
//		page6.verifySavedOwenerName("pachino");
		homePage.continueFormButton();
		
		//fill page 7 form 
		page7.selectOwner("pachino,  al");
		page7.selectClassOfStock("Common");
		page7.enterNumberOfStocks("50");
		page7.enterAcquiredDate("07/06/2018");
		page7.clickSaveStockDetails();
//		page7.verifySavedOwenerName("pachino,  al");
		homePage.continueFormButton();

		// fill page 8 form 
		page8.enterName("akhil shukla");
		page8.enterAppointmentDate("07/06/2018");
		page8.enterTitle("ceo");
		page8.selectRace("African American");
		page8.selectGender("Male");
		page8.clickSaveBoardMembers();
//		page8.verifySavedBoardMemberName("shukla, akhil");
		homePage.continueFormButton();
		
		// fill page 9 form 
		page9.enterName("akhil shukla");
		page9.enterAppointmentDate("07/06/2018");
		page9.enterTitle("CFO");
		page9.selectRace("African American");
		page9.selectGender("Male");
		page9.clickSaveOfficer();
//		page9.verifySavedOfficerName("shukla, akhil");
		homePage.continueFormButton();
		
		//fill page 10 form 
		page10.enterBiddingName("akhil singh");
		page10.enterBiddingTitle("ceo");
		page10.selectBiddingGender("Male");
		page10.selectBiddingEthnicity("African American");
		page10.clickSaveBiddingButton();
		
		page10.enterFinancialName("ajay singh");
		page10.enterFinancialTitle("cfo");
		page10.selectFinancialGender("Male");
		page10.selectFinancialEthnicity("African American");
		page10.clickSaveFinancialButton();
		
		page10.enterOfficeName("raj thakre");
		page10.enterOfficeTitle("coo");
		page10.selectOfficeGender("Male");
		page10.selectOfficeEthnicity("African American");
		page10.clickSaveOfficeButton();
		homePage.continueFormButton();
		
		// fill page 11 form 
		page11.enterNameOfProject("test project");
		page11.enterLocationOfProject("chandigarh");
		page11.enterFirmStartDate("07/06/2018");
		page11.enterContractValue("5550");
		page11.enterContractName("akhil shukla");
		page11.enterAnticipatedDate("07/06/2018");
		page11.enterEmail("abc@hh.ll");
		page11.enterPhone("5656565656");
		page11.enterScopeOfWork("test scope");
		page11.clickSaveActiveJob();
//		page11.verifySavedActiveJobs("test project");
		
		page11.enterPPContractorName("akhil shuklaa");
		page11.enterPPLocationOfProject("chandigarh");
		page11.enterPPContractName("ajay singh");
		page11.enterPPContractValue("5555");
		page11.enterPPEmail("akhil@test.com");
		page11.enterPPPhone("6565656565");
		page11.enterPPScopeOfWork("test scope");
		page11.clickSavePastPerformance();
//		page11.verifySavedPastPerformance("akhil shuklaa");
		homePage.continueFormButton();
		
		//fill page 12 form
		page12.enterinstitutionName("Microsoft");
		page12.selectBankingType("Bank");
		page12.enterAccountNumber("985689");
		page12.enterContactPersonName("akhil shukla");
		page12.enterAddress("chd");
		page12.enterCity("chandigarh");
		page12.enterStae("GEORGIA");
		page12.enterZip("555555");
		page12.clickSaveAccount();
//		page12.verifySavedAccountInfo("985689");
		
		// fill page 13 form 
		page13.selectAssetType("Trucks");
		page13.enterMakeModel("testmodel");
		page13.enterDollerValue("10000");
		page13.SelectOwnedRadioButton();
		page13.ClickSaveAsset();
//		page13.verifySavedAsset("testmodel");
		homePage.continueFormButton();
		
//		fill page 14 form 
		page14.enterInstitutionName("xcorp");
		page14.enterStreetAddress("chandigarh");
		page14.enterCity("chd");
		page14.selectState("GEORGIA");
		page14.enterZip("252525");
		page14.enterPhoneNumber("2525252525");
		page14.clickSaveInsurance();
//		page14.verifySavedInsuranceInfo("xcorp");
		page14.enterIssuingBank("ICICI");
		page14.enterBondingAddress("chandigarh");
		page14.enterBondingCity("chd");
		page14.selectState("GEORGIA");
		page14.enterBondingZip("989898");
		page14.enterBondingPhoneNumber("9999999999");
		page14.enterBondingDollerValue("50000");
		page14.enterBondingLimit("60000");
		page14.clickSaveBonding();
//		page14.verifySavedBondingInfo("xcorp");
		homePage.continueFormButton();
		
		// Click on submit button on page 15 
		page15.clickSubmitApplication();
		
		// Verify thank you text on page 16
		
		Assert.assertEquals(page16.verifyThankYouText(), true);
	}		
}
