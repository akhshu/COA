package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.Events;

/**
 * @author Akhilesh.Shukla
 *
 */
public class Page9 extends Events{

	public Page9(WebDriver driver) {
		super(driver);
	}

	private By nameInputBox = By.id("ctl00_ApplicationContent_txtOwnerName");
	private By dateAppointedInputBox = By.id("ctl00_ApplicationContent_txtDateAppointed");
	private By titleInputBox = By.id("ctl00_ApplicationContent_ddlOfficerPosition");
	private By raceList = By.id("ctl00_ApplicationContent_ddlRace");
	private By genderList = By.id("ctl00_ApplicationContent_ddlGender");
	private By saveOfficerBtn = By.id("ctl00_ApplicationContent_btnSaveOfficer");
	private By officerTable = By.id("ctl00_ApplicationContent_dgdBoardMember");
	
	
	public void enterName(String name){
		enterValue(nameInputBox, name);
	}
	
	/**
	 * @param date : mm/dd/yyyy
	 */
	public void enterAppointmentDate(String date){
		enterValue(dateAppointedInputBox, date); 
	}
	
	public void enterTitle(String title){
		enterValue(titleInputBox, title);
	}
	
	public void selectRace(String race){
		selectFromDropdown(raceList, race);
	}
	
	public void selectGender(String gender){
		selectFromDropdown(genderList, gender);
	}

	public void clickSaveOfficer(){
		click(saveOfficerBtn);
	}
	
	public boolean verifySavedOfficerName(String Name){
		return findValueInTable(officerTable,Name);
	}

}
