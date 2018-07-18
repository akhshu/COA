package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.Events;

/**
 * @author Akhilesh.Shukla
 *
 */
public class Page8 extends Events{

	public Page8(WebDriver driver) {
		super(driver);
	}

	private By nameInputBox = By.id("ctl00_ApplicationContent_txtOwnerName");
	private By dateAppointedInputBox = By.id("ctl00_ApplicationContent_txtDateAppointed");
	private By titleInputBox = By.id("ctl00_ApplicationContent_txtOwnerTitle");
	private By raceList = By.id("ctl00_ApplicationContent_ddlRace");
	private By genderList = By.id("ctl00_ApplicationContent_ddlGender");
	private By saveBoardMemberBtn = By.id("ctl00_ApplicationContent_btnSaveBoardMember");
	private By boardMemberTable = By.id("ctl00_ApplicationContent_dgdBoardMember");
	
	
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

	public void clickSaveBoardMembers(){
		click(saveBoardMemberBtn);
	}
	
	public boolean verifySavedBoardMemberName(String Name){
		return findValueInTable(boardMemberTable,Name);
	}


	
}
