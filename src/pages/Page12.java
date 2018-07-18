package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.Events;

/**
 * @author Akhilesh.Shukla
 *
 */
public class Page12 extends Events{

	public Page12(WebDriver driver) {
		super(driver);
	}

	private By institutionNameInputBox = By.id("ctl00_ApplicationContent_txtBankingInstitutionName");
	private By bankingTypeList = By.id("ctl00_ApplicationContent_ddlBankingType");
	private By accountNumberInputBox = By.id("ctl00_ApplicationContent_txtAccountNumber");
	private By contactPersonInputBox = By.id("ctl00_ApplicationContent_txtContactPerson");
	private By addressInputBox = By.id("ctl00_ApplicationContent_txtBankingAddress1");
	private By cityInputBox = By.id("ctl00_ApplicationContent_txtBankingCity");
	private By stateInputBox = By.id("ctl00_ApplicationContent_ddlBankingState");
	private By zipInputBox = By.id("ctl00_ApplicationContent_txtBankingZip");
	private By saveAccountBtn = By.id("ctl00_ApplicationContent_btnSaveBanking");
	private By accountsListTable = By.id("ctl00_ApplicationContent_dgdBanking");
	
	
	// Active Jobs functions
	public void enterinstitutionName(String name){
		enterValue(institutionNameInputBox, name);
	}
	
	public void selectBankingType(String bankingType){
		selectFromDropdown(bankingTypeList, bankingType);
	}

	public void enterAccountNumber(String accountNumber){
		enterValue(accountNumberInputBox, accountNumber);
	}
	
	public void enterContactPersonName(String name){
		enterValue(contactPersonInputBox, name);
	}

	public void enterAddress(String address){
		enterValue(addressInputBox, address);
	}
	
	public void enterCity(String city){
		enterValue(cityInputBox, city);
	}
	
	public void enterStae(String state){
		enterValue(stateInputBox, state);
	}
	
	public void enterZip(String zip){
		enterValue(zipInputBox, zip);
	}
	

	public void clickSaveAccount(){
		click(saveAccountBtn);
	}

	
	public boolean verifySavedAccountInfo(String AccountNumber){
		return findValueInTable(accountsListTable,AccountNumber);
	}
	


}
