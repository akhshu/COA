package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.Events;

/**
 * @author Akhilesh.Shukla
 *
 */
public class Page11 extends Events{

	public Page11(WebDriver driver) {
		super(driver);
	}

	private By nameOfProjectInputBox = By.id("ctl00_ApplicationContent_txtActiveJobCompanyName");
	private By locationOfProjectInputBox = By.id("ctl00_ApplicationContent_txtActiveJobLocation");
	private By firmStartDateInputBox = By.id("ctl00_ApplicationContent_txtActiveJobStartDate");
	private By contractValueInputBox = By.id("ctl00_ApplicationContent_txtActiveJobContractValue");
	private By contractNameInputBox = By.id("ctl00_ApplicationContent_txtActiveJobContactName");
	private By anticipatedDateInputBox = By.id("ctl00_ApplicationContent_txtActiveJobAnticipatedDate");
	private By emailInputBox = By.id("ctl00_ApplicationContent_txtActiveJobContactEmail");
	private By phoneInputBox = By.id("ctl00_ApplicationContent_txtActiveJobContactPhone");
	private By scopeOfWorkInputBox = By.id("ctl00_ApplicationContent_txtActiveJobType");
	private By saveActiveJobBtn = By.id("ctl00_ApplicationContent_btnSaveActiveJob");
	private By activeJobsTable = By.id("ctl00_ApplicationContent_dgdActiveJobs");
	
	
	private By ppContractorNameInputBox = By.id("ctl00_ApplicationContent_txtCompanyName");
	private By ppLocationOfProjectInputBox = By.id("ctl00_ApplicationContent_txtLocation");
	private By ppContractNameInputBox = By.id("ctl00_ApplicationContent_txtContactName");
	private By ppContractValueInputBox = By.id("ctl00_ApplicationContent_txtContractValue");
	private By ppEmailInputBox = By.id("ctl00_ApplicationContent_txtContactEmail");
	private By ppPhoneInputBox = By.id("ctl00_ApplicationContent_txtContactPhone");
	private By ppScopeOfWork = By.id("ctl00_ApplicationContent_txtType");
	private By savePastPerformanceJobBtn = By.id("ctl00_ApplicationContent_btnSaveExperience");
	private By pastPerformanceTable = By.id("ctl00_ApplicationContent_dgdExperiences");
	
	
	// Active Jobs functions
	public void enterNameOfProject(String name){
		enterValue(nameOfProjectInputBox, name);
	}
	
	public void enterLocationOfProject(String location){
		enterValue(locationOfProjectInputBox, location);
	}
	
	/**
	 * @param date : mm/dd/yyyy
	 */
	public void enterFirmStartDate(String date){
		enterValue(firmStartDateInputBox, date);
	}

	public void enterContractValue(String value){
		enterValue(contractValueInputBox, value);
	}
	
	public void enterContractName(String contractName){
		enterValue(contractNameInputBox, contractName);
	}
	
	
	/**
	 * @param date : mm/dd/yyyy
	 */
	public void enterAnticipatedDate(String anticipatedDate){
		enterValue(anticipatedDateInputBox, anticipatedDate);
	}
	
	public void enterEmail(String email){
		enterValue(emailInputBox, email);
	}
	
	public void enterPhone(String phone){
		enterValue(phoneInputBox, phone);
	}
	
	public void enterScopeOfWork(String scope){
		enterValue(scopeOfWorkInputBox, scope);
	}
	
	public void clickSaveActiveJob(){
		click(saveActiveJobBtn);
	}

	
	public boolean verifySavedActiveJobs(String contractorName){
		return findValueInTable(activeJobsTable,contractorName);
	}
	
	// past Performance functions	
	
	
	public void enterPPContractorName(String name){
		enterValue(ppContractorNameInputBox, name);
	}
	
	public void enterPPLocationOfProject(String location){
		enterValue(ppLocationOfProjectInputBox, location);
	}
	
	/**
	 * @param date : mm/dd/yyyy
	 */
	public void enterPPContractName(String contractName){
		enterValue(ppContractNameInputBox, contractName);
	}

	public void enterPPContractValue(String value){
		enterValue(ppContractValueInputBox, value);
	}
	
	public void enterPPEmail(String email){
		enterValue(ppEmailInputBox, email);
	}
	
	public void enterPPPhone(String phone){
		enterValue(ppPhoneInputBox, phone);
	}
	
	public void enterPPScopeOfWork(String scope){
		enterValue(ppScopeOfWork, scope);
	}
	
	public void clickSavePastPerformance(){
		click(savePastPerformanceJobBtn);
	}
	
	public boolean verifySavedPastPerformance(String contractorName){
		return findValueInTable(pastPerformanceTable,contractorName);
	}
	

}
