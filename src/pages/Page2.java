package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.Events;

public class Page2 extends Events{

	public Page2(WebDriver driver) {
		super(driver);
	}

	private By formHeaderLabel = By.xpath("//div[@class='formHead']");
	private By pageNumberLabel = By.xpath("//div[@class='text' and contains(text(),'Page')]");
	private By federalTaxIdInputBox = By.id("ctl00_ApplicationContent_txtTaxID");
	private By findMeButton = By.id("ctl00_ApplicationContent_btnFindByTaxID");
	private By vendorNotFoundLabel = By.id("ctl00_ApplicationContent_divTaxIDNotFound");
	private By certificationApplyingForRBtn = By.id("ctl00_ApplicationContent_rblCertTypes_0");
	private By projectPendingRBtn = By.id("rdb_COA_No");
	private By companyNameInputBox = By.id("ctl00_ApplicationContent_txtVendorName");
	private By streetAddressInputBox = By.id("ctl00_ApplicationContent_txtPrimaryAddress1");
	private By cityInputBox = By.id("ctl00_ApplicationContent_txtPrimaryCity");
	private By zipInputBox = By.id("ctl00_ApplicationContent_txtPrimaryZip");
	private By stateList = By.id("ctl00_ApplicationContent_ddlPrimaryState");
	private By bussinessPhoneInputBox = By.id("ctl00_ApplicationContent_txtPhone");
	private By primaryContactInputBox = By.id("ctl00_ApplicationContent_txtPrimaryContactName");
	private By emailInputBox = By.id("ctl00_ApplicationContent_txtPrimaryEmail");
	private By titleInputBox = By.id("ctl00_ApplicationContent_txtPrimaryTitle");
	private By emailToSendApplicationIdInputBox = By.id("ctl00_ApplicationContent_txtEmailsApplicationID");
	
	
	public void enterFederalTaxId(String strTaxId){
		enterValue(federalTaxIdInputBox,strTaxId);
	}
	
	public void clickFindMe(){
		click(findMeButton);
	}
	
	public String getVendorNotFound(){
		return getText(vendorNotFoundLabel);
	}

	public void selectState(String stateName){
		selectFromDropdown(stateList, stateName);
	}
	
	public void enterCompanyName(String companyname){
		enterValue(companyNameInputBox, companyname);
	}
	
	public void enterStreetAddress(String streetAddress){
		enterValue(streetAddressInputBox, streetAddress);
	}
	
	public void enterCity(String city){
		enterValue(cityInputBox, city);
	}	
	
	public void enterZip(String zip){
		enterValue(zipInputBox, zip);
	}	
	
	public void enterBussinessPhone(String phonenumber){
		enterValue(bussinessPhoneInputBox, phonenumber);
	}	
	
	public void enterPrimaryContactName(String name){
		enterValue(primaryContactInputBox, name);
	}	
	
	public void enterEmail(String email){
		enterValue(emailInputBox, email);
	}	

	public void enterTitle(String title){
		enterValue(titleInputBox, title);
	}	
	
	public void enterEmailToSendApplicationId(String email){
		enterValue(emailToSendApplicationIdInputBox, email);
	}
	
}
