package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.Events;

public class Page4 extends Events{

	public Page4(WebDriver driver) {
		super(driver);
	}
	
	private By typeOfFirmList = By.id("ctl00_ApplicationContent_ddlBusinessStructure");
	private By dateEstablishedInbutBox = By.id("ctl00_ApplicationContent_txtDateEstablished");
	private By methodOfAcquisitionList = By.id("ctl00_ApplicationContent_ddlMethodOfAcquisition");
	private By mainAreaList = By.id("ctl00_ApplicationContent_ddlBusinessActivity");
	private By industryCodeList = By.id("ctl00_ApplicationContent_radServiceCodes_Input");
	private By addCodeButton = By.id("ctl00_ApplicationContent_btnAddService");
	private By industryInfotable = By.id("ctl00_ApplicationContent_dgdServices");
	
	public void selectTypeOfFirm(String firmType){
		selectFromDropdown(typeOfFirmList, firmType);
	} 

	public void enterDateEstablished(String date){
		enterValue(dateEstablishedInbutBox,date);
	}
	
	public void selectMethodOfAcquisition(String acquisitionMethod){
		selectFromDropdown(methodOfAcquisitionList, acquisitionMethod);
	}	
	
	public void selectMainArea(String mainArea){
		selectFromDropdown(mainAreaList, mainArea);
	}
	
	public void enterIndustryCode(String industryCode){
		enterValue(industryCodeList, industryCode);
	}
	
	public void clickAddCodeButton(){
		click(addCodeButton);
	}
	
	public boolean verifyIndustryCodeSaved(String industryCode){
		return findValueInTable(industryInfotable,industryCode);
	}
	
}
