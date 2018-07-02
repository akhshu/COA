package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.Events;

public class Page5 extends Events{

	public Page5(WebDriver driver) {
		super(driver);
	}
	
	private By NACheck= By.id("ctl00_ApplicationContent_ctlCheckListEBOSBO_lv_Checklist_ctrl4_fu_main_cbx_NA");
	private By selectFile1= By.id("ctl00_ApplicationContent_ctlCheckListEBOSBO_lv_Checklist_ctrl0_fu_main_mainAsyncFileUpload_ctl02");
	private By selectFile2= By.id("ctl00_ApplicationContent_ctlCheckListEBOSBO_lv_Checklist_ctrl1_fu_main_mainAsyncFileUpload_ctl02");
	private By selectFile3= By.id("ctl00_ApplicationContent_ctlCheckListEBOSBO_lv_Checklist_ctrl2_fu_main_mainAsyncFileUpload_ctl02");
	private By selectFile4= By.id("ctl00_ApplicationContent_ctlCheckListEBOSBO_lv_Checklist_ctrl3_fu_main_mainAsyncFileUpload_ctl02");
	
	private By file1Link = By.xpath("//a[contains (text(), 'Imp_notes1.txt')]");
	
	
	private WebElement file2Link = (WebElement) By.xpath("//a[contains (text(), 'Imp_notes3.txt')]");
	private By file3Link = By.xpath("//a[contains (text(), 'Imp_notes3.txt')]");
	private By file4Link = By.xpath("//a[contains (text(), 'Imp_notes4.txt')]");
	
	
	public void selectNACheck(){
		click(NACheck);
	}
	
	public void uploadFile1(String filePath){
		enterValue(selectFile1, filePath);
//		waitForVisible(file1Link);
	}
	
	public void uploadFile2(String filePath){
		enterValue(selectFile2, filePath);
	}
	
	public void uploadFile3(String filePath){
		enterValue(selectFile3, filePath);
	}

	public void uploadFile4(String filePath){
		enterValue(selectFile4, filePath);
	}
}
