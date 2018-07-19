package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import framework.Events;

/**
 * @author Akhilesh.Shukla
 *
 */
public class Page6 extends Events{

	public Page6(WebDriver driver) {
		super(driver);
	}

	private By nameInputBox = By.id("ctl00_ApplicationContent_txtOwnerName");
	private By owenershipInputBox = By.id("ctl00_ApplicationContent_txtOwnerEquity");
	private By titleInputBox = By.id("ctl00_ApplicationContent_txtOwnerTitle");
	private By genderList = By.id("ctl00_ApplicationContent_ddlOwnerGender");
	private By raceList = By.id("ctl00_ApplicationContent_ddlOwnerRace");
	private By acquiredDateInputBox = By.id("ctl00_ApplicationContent_txtAquiredDate");
	private By streetAddressInputBox = By.id("ctl00_ApplicationContent_txtOwnerAddress1");
	private By cityInputBox = By.id("ctl00_ApplicationContent_txtOwnerCity");
	private By zipBox = By.id("ctl00_ApplicationContent_txtOwnerZip");
	private By stateList = By.id("ctl00_ApplicationContent_ddlOwnerState");
	private By homePhoneInputBox = By.id("ctl00_ApplicationContent_txtOwnerPhone");
	private By saveOwenerBtn = By.id("ctl00_ApplicationContent_btnSaveOwner");
	private By owenersInfoTable = By.id("ctl00_ApplicationContent_dgdOwners");
	private By acquiredDateTodayBtn = By.id("ctl00_ApplicationContent_textAquiredDateCalendar_day_1_0");
	

	
	public void enterName(String name){
		enterValue(nameInputBox, name);
	}
	
	public void enterOwenershipPercentage(String percentage){
		enterValue(owenershipInputBox, percentage);
	}

	public void enterTitle(String title){
		enterValue(titleInputBox, title);
	}
	
	public void selectGender(String gender){
		selectFromDropdown(genderList, gender);
	}
	
	public void selectRace(String race){
		selectFromDropdown(raceList, race);
	}
	
	/**
	 * @param date : mm/dd/yyyy
	 * @throws InterruptedException 
	 */
	public void enterAcquiredDate(String date) throws InterruptedException{
		
//		selectTodayDate(acquiredDateInputBox,acquiredDateTodayBtn);
		
		click(acquiredDateInputBox);
		click(acquiredDateTodayBtn);

//		WebElement tdayDate = getElement(acquiredDateTodayBtn);
//		click(acquiredDateInputBox);
//		Actions act = new Actions(driver);
//		act.moveToElement(tdayDate);
//		click(acquiredDateTodayBtn);
//		enterValue(acquiredDateInputBox, date); 
	}
	
	public void enterStreetAddress(String address){
		enterValue(streetAddressInputBox, address);
	}
	
	public void enterCity(String city){
		enterValue(cityInputBox, city);
	}
	
	public void enterZip(String zip){
		enterValue(zipBox, zip);
	}
	
	public void enterHomePhone(String phone){
		enterValue(homePhoneInputBox, phone);
	}
	
	public void selectState(String state){
		selectFromDropdown(stateList, state);
	}
	
	public void clickSaveOwener(){
		click(saveOwenerBtn);
	}
	
	public boolean verifySavedOwenerName(String Name){
		return findValueInTable(owenersInfoTable,Name);
	}
	
}
