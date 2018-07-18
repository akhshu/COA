package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.Events;

/**
 * @author Akhilesh.Shukla
 *
 */
public class Page13 extends Events{

	public Page13(WebDriver driver) {
		super(driver);
	}

	private By assetTypeList = By.id("ctl00_ApplicationContent_ddlInventoryType");
	private By makeModelInputBox = By.id("ctl00_ApplicationContent_txtInventoryMakeModel");
	private By dollerValueInputBox = By.id("ctl00_ApplicationContent_txtInventoryAmount");
	private By ownedRbtn = By.id("ctl00_ApplicationContent_rbInventoryLeasedNo");
	private By saveAssetBtn = By.id("ctl00_ApplicationContent_btnSaveInventory");
	private By AssetTable = By.id("ctl00_ApplicationContent_dgdInventory");
	
	
	public void selectAssetType(String assetType){
		selectFromDropdown(assetTypeList, assetType);
	}
	
	public void enterMakeModel(String model){
		enterValue(makeModelInputBox, model);
	}
	

	public void enterDollerValue(String value){
		enterValue(dollerValueInputBox, value);
	}
	
	public void SelectOwnedRadioButton(){
		click(ownedRbtn);
	}
	
	public void ClickSaveAsset(){
		click(saveAssetBtn);
	}
		
	public boolean verifySavedAsset(String makeModel){
		return findValueInTable(AssetTable,makeModel);
	}
	


}
