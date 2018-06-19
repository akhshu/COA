package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.Events;

public class Page3 extends Events{

	public Page3(WebDriver driver) {
		super(driver);
	}
	
	private By jurisdictionList = By.id("ctl00_ApplicationContent_ddlTrustedJurisdiction");
	private By certificationTypeList = By.id("ctl00_ApplicationContent_ddlCertificateType");
	private By certificateNumberList = By.id("ctl00_ApplicationContent_txtCertificationNumber");
	private By dateOfIssueInputBox = By.id("ctl00_ApplicationContent_txtIssueDate");
	private By saveCertificationButton = By.id("ctl00_ApplicationContent_btnSaveCertification");
	private By CertificationsTable= By.id("ctl00_ApplicationContent_dgdCertifications");
	private By CertificationsTableRows = By.xpath("//table[@id='ctl00_ApplicationContent_dgdCertifications']/tbody/tr");
	private By CertificationsTableColumns = By.xpath("//table[@id='ctl00_ApplicationContent_dgdCertifications']/tbody/tr");
	
	
}
