package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.Events;

/**
 * @author Akhilesh.Shukla
 *
 */
public class Page7 extends Events{

	public Page7(WebDriver driver) {
		super(driver);
	}

	private By ownerList = By.id("ctl00_ApplicationContent_ddlOwners");
	private By classOfStockList = By.id("ctl00_ApplicationContent_ddlShareClass");
	private By numberOfStockInputBox = By.id("ctl00_ApplicationContent_txtShareNumber");
	private By dateAcquiredInputBox = By.id("ctl00_ApplicationContent_txtDateAcquired");
	private By saveStockDetailsBtn = By.id("ctl00_ApplicationContent_btnSaveOwnership");
	private By owenershipTable = By.id("ctl00_ApplicationContent_dgdOwnership");
	
	
	
	public void selectOwner(String owener){
//		selectFromDropdown(ownerList, owener);
		selectFromDropdownByIndex(ownerList, 1);
	}
	

	public void selectClassOfStock(String classOfStock){
		selectFromDropdown(classOfStockList, classOfStock);
	}
	
	public void enterNumberOfStocks(String numberOfStocks){
		enterValue(numberOfStockInputBox, numberOfStocks);
	}

	
	/**
	 * @param date : mm/dd/yyyy
	 */
	public void enterAcquiredDate(String date){
		enterValue(dateAcquiredInputBox, date); 
	}
	
	
	public void clickSaveStockDetails(){
		click(saveStockDetailsBtn);
	}
	
	public boolean verifySavedOwenerName(String Name){
		return findValueInTable(owenershipTable,Name);
	}
	
}
