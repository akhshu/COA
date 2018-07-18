package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.Events;

/**
 * @author Akhilesh.Shukla
 *
 */
public class Page14 extends Events{

	public Page14(WebDriver driver) {
		super(driver);
	}

	private By institutionNameInputBox= By.id("ctl00_ApplicationContent_txtBankingInstitutionName");
	private By streetAddressInputBox = By.id("ctl00_ApplicationContent_txtBankingAddress1");
	private By cityInputBox = By.id("ctl00_ApplicationContent_txtBankingCity");
	private By stateList = By.id("ctl00_ApplicationContent_ddlBankingState");
	private By zipInputBox = By.id("ctl00_ApplicationContent_txtBankingZip");
	private By phoneNumberInputBox = By.id("ctl00_ApplicationContent_txtBankingPhoneNumber");
	private By saveInsuranceBtn = By.id("ctl00_ApplicationContent_btnSaveBanking");
	private By insuranceTable = By.id("ctl00_ApplicationContent_dgdBanking");
	
	private By issuingBankInputBox= By.id("ctl00_ApplicationContent_txtBrokerAgency");
	private By bondingAddressInputBox = By.id("ctl00_ApplicationContent_txtBondingAddress1");
	private By bondingCityInputBox = By.id("ctl00_ApplicationContent_txtBondingCity");
	private By bondingStateList = By.id("ctl00_ApplicationContent_ddlBondingState");
	private By bondingZipInputBox = By.id("ctl00_ApplicationContent_txtBondingZip");
	private By bondingPhoneNumberInputBox = By.id("ctl00_ApplicationContent_txtBondingPhoneNumber");
	private By bondingDollerValueInputBox = By.id("ctl00_ApplicationContent_txtBondingAggregateLimit");
	private By bondingLimitInputBox = By.id("ctl00_ApplicationContent_txtBondingLimit");
	private By saveBondingBtn = By.id("ctl00_ApplicationContent_btnSaveBonding");
	private By bondingTable = By.id("ctl00_ApplicationContent_dgdBonding");
	
	
	
	

	
	public void enterInstitutionName(String name){
		enterValue(institutionNameInputBox, name);
	}
	

	public void enterStreetAddress(String address){
		enterValue(streetAddressInputBox, address);
		
	}
	
	public void enterCity(String city){
		enterValue(cityInputBox, city);	
	}
	
	
	public void selectState(String state){
		selectFromDropdown(stateList, state);
	}	
	
	public void enterZip(String zip){
		enterValue(zipInputBox, zip);	
	}
	
	public void enterPhoneNumber(String phone){
		enterValue(phoneNumberInputBox, phone);	
	}
	
	public void clickSaveInsurance(){
		click(saveInsuranceBtn);
	}
		
	public boolean verifySavedInsuranceInfo(String institution){
		return findValueInTable(insuranceTable,institution);
	}
	
	public void enterIssuingBank(String bank){
		enterValue(issuingBankInputBox, bank);	
	}
	
	public void enterBondingAddress(String address){
		enterValue(bondingAddressInputBox, address);	
	}
	
	public void enterBondingCity(String city){
		enterValue(bondingCityInputBox, city);	
	}

	public void selectBondingState(String state){
		selectFromDropdown(bondingStateList, state);
	}	
	
	public void enterBondingZip(String zip){
		enterValue(bondingZipInputBox, zip);	
	}
	
	public void enterBondingPhoneNumber(String phone){
		enterValue(bondingPhoneNumberInputBox, phone);	
	}
	

	public void enterBondingDollerValue(String value){
		enterValue(bondingDollerValueInputBox, value);	
	}
	
	public void enterBondingLimit(String limit){
		enterValue(bondingLimitInputBox, limit);	
	}
	
	
	public void clickSaveBonding(){
		click(saveBondingBtn);
	}
	
	public boolean verifySavedBondingInfo(String institution){
		return findValueInTable(bondingTable,institution);
	}
		
}
