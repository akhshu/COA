package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.Events;

/**
 * @author Akhilesh.Shukla
 *
 */
public class Page10 extends Events{

	public Page10(WebDriver driver) {
		super(driver);
	}

	private By biddingNameInputBox = By.id("ctl00_ApplicationContent_dgdPersonnel_ctl02_txtEmployeeName1");
	private By biddingTitleInputBox = By.id("ctl00_ApplicationContent_dgdPersonnel_ctl02_txtPosition1");
	private By biddingGenderList = By.id("ctl00_ApplicationContent_dgdPersonnel_ctl02_ddlGender1");
	private By biddingEthnicityList = By.id("ctl00_ApplicationContent_dgdPersonnel_ctl02_ddlRace1");
	private By saveBiddingBtn = By.id("ctl00_ApplicationContent_dgdPersonnel_ctl02_btnSave");
	
	private By financialNameInputBox = By.id("ctl00_ApplicationContent_dgdPersonnel_ctl03_txtEmployeeName1");
	private By financialTitleInputBox = By.id("ctl00_ApplicationContent_dgdPersonnel_ctl03_txtPosition1");
	private By financialGenderList = By.id("ctl00_ApplicationContent_dgdPersonnel_ctl03_ddlGender1");
	private By financialEthnicityList = By.id("ctl00_ApplicationContent_dgdPersonnel_ctl03_ddlRace1");
	private By saveFinancialBtn = By.id("ctl00_ApplicationContent_dgdPersonnel_ctl03_btnSave");
	
	private By officeNameInputBox = By.id("ctl00_ApplicationContent_dgdPersonnel_ctl04_txtEmployeeName1");
	private By officeTitleInputBox = By.id("ctl00_ApplicationContent_dgdPersonnel_ctl04_txtPosition1");
	private By officeGenderList = By.id("ctl00_ApplicationContent_dgdPersonnel_ctl04_ddlGender1");
	private By officeEthnicityList = By.id("ctl00_ApplicationContent_dgdPersonnel_ctl04_ddlRace1");
	private By saveOfficeBtn = By.id("ctl00_ApplicationContent_dgdPersonnel_ctl04_btnSave");
	
	
	public void enterBiddingName(String name){
		enterValue(biddingNameInputBox, name);
	}
	
	public void enterFinancialName(String name){
		enterValue(financialNameInputBox, name);
	}
	
	public void enterOfficeName(String name){
		enterValue(officeNameInputBox, name);
	}

	public void enterBiddingTitle(String title){
		enterValue(biddingTitleInputBox, title);
	}
	
	public void enterFinancialTitle(String title){
		enterValue(financialTitleInputBox, title);
	}

	public void enterOfficeTitle(String title){
		enterValue(officeTitleInputBox, title);
	}


	public void selectBiddingGender(String gender){
		selectFromDropdown(biddingGenderList, gender);
	}

	public void selectFinancialGender(String gender){
		selectFromDropdown(financialGenderList, gender);
	}
	
	public void selectOfficeGender(String gender){
		selectFromDropdown(officeGenderList, gender);
	}

	public void selectBiddingEthnicity(String ethnicity){
		selectFromDropdown(biddingEthnicityList, ethnicity);
	}

	public void selectFinancialEthnicity(String ethnicity){
		selectFromDropdown(financialEthnicityList, ethnicity);
	}

	public void selectOfficeEthnicity(String ethnicity){
		selectFromDropdown(officeEthnicityList, ethnicity);
	}

	public void clickSaveBiddingButton(){
		click(saveBiddingBtn);
	}

	public void clickSaveFinancialButton(){
		click(saveFinancialBtn);
	}
	
	public void clickSaveOfficeButton(){
		click(saveOfficeBtn);
	}
	

}
