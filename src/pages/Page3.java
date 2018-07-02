package pages;



import java.util.List;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.Events;

public class Page3 extends Events{

	public Page3(WebDriver driver) {
		super(driver);
	}
	
	private By jurisdictionList = By.id("ctl00_ApplicationContent_ddlTrustedJurisdiction");
	private By certificationTypeList = By.id("ctl00_ApplicationContent_ddlCertificateType");
	private By certificateNumberInputBox = By.id("ctl00_ApplicationContent_txtCertificationNumber");
	private By dateOfIssueInputBox = By.id("ctl00_ApplicationContent_txtIssueDate");
	private By saveCertificationButton = By.id("ctl00_ApplicationContent_btnSaveCertification");

	private By CertificationsTable= By.id("ctl00_ApplicationContent_dgdCertifications");
	private By CertificationsTableRows = By.xpath("//table[@id='ctl00_ApplicationContent_dgdCertifications']/tbody/tr");
	private By CertificationsTableColumns = By.xpath("//table[@id='ctl00_ApplicationContent_dgdCertifications']/tbody/tr");
	private By CertificationsLetterCheck = By.id("ctl00_ApplicationContent_ctlCheckList_lv_Checklist_ctrl0_fu_main_cbx_NA");
	
	public void selectJurisdiction(String jurisdiction){
		selectFromDropdown(jurisdictionList,jurisdiction);
	}
	

	public void selectCertificationType(String certType){
		selectFromDropdown(certificationTypeList,certType);
	}
	
	/**
	 * @param date : mm/dd/yyyy
	 */
	public void enterDateOfIssue(String date){
		enterValue(dateOfIssueInputBox,date);
	}
	
	public void enterCertificateNumber(String certNumber){
		enterValue(certificateNumberInputBox,certNumber);
	}
	

	public void clickSaveCertification(){
		click(saveCertificationButton);
	}
	
	public boolean findCertIdInTable(String certNumber){
		return findValueInTable(CertificationsTable,certNumber);
	}
	
	public void selectCertificateLetterCheck(){
		click(CertificationsLetterCheck);
	}
	
//	public boolean findValueInTable(By by,String value){
//		
//		WebElement certTable = getElement(by);
//		
//		List<WebElement> rows = certTable.findElements(By.tagName("tr"));
//		int row_count = rows.size();
//		System.out.println("Total number of rows are :  " + row_count);
//		
//		//List<WebElement> cols = certTable.findElements(By.tagName("td"));
//		//int col_count = cols.size();
//		//System.out.println("Total number of columns are :  " + col_count);
//		
//		boolean dataFound = false;
//		
//		for(int i = 0; i<row_count; i ++){
//			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
//			int col_count = cols.size();
//
//			for(int j = 0; j<col_count;j++){
//				String cellData = cols.get(j).getText();
//				System.out.println("Cell Data is : " + cellData + "===");
//				System.out.println("valid Data is : " + value + "===");
//				if(Objects.equals(cellData, value)){
//					System.out.println("Data found at cell : " + i + "," + j);
//					dataFound = true;
//				}
//			}	
//		}
//		return dataFound;
//	}
	
	
	
}
