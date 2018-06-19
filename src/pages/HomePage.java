package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.Events;

public class HomePage extends Events{
	

	private By startApplicationLink = By.xpath("//a/*[contains(text(),'Start')]");
	private By completeApplicationLink = By.id("ctl00_ApplicationContent_lbtnComplete");	
	private By continueNewApplicationButton = By.id("ctl00_ApplicationContent_btnStartApplication");
	private By continueRecertificationButton = By.id("ctl00_ApplicationContent_btnRecertificateApplication");
	private By backButton = By.id("ctl00_ApplicationContent_btnBack");
	private By continueFormButton= By.id("ctl00_ApplicationContent_btnNext");
	private By pleaseChooseCertificationLabel = By.xpath("//div[contains(text(),'Please choose Certification')]");
	private By continueSubmitReCertificationButton = By.id("ctl00_ApplicationContent_btnRecertificateApplication");
	private By applicationIdInputBox = By.id("ctl00_ApplicationContent_txtCodeSessionID");
	private By lostApplicationIdLink = By.id("ctl00_ApplicationContent_btnLostApplicationID");
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickStartApplication() {
		click(startApplicationLink);
	}
	
	public void clickCompleteApplication() {
		click(completeApplicationLink);
	}
	
	public void continueNewApplication() {
		click(continueNewApplicationButton);
	}
	
	public void continueRecertification() {
		click(continueRecertificationButton);
	}
	
	public void backButton() {
		click(backButton);
	}
	
	public void continueFormButton() {
		click(continueFormButton);
	}
	
	public String getLabelText() {
		return getText(pleaseChooseCertificationLabel);
	}
	
	public String getPageTitle() {
		return getTitle();
	}
	
	public void continueSubmitaRecertification() {
		click(continueSubmitReCertificationButton);
	}
	
	public void EnterApplicationIdForRecertification(String strApplicationId) {
		enterValue(applicationIdInputBox,strApplicationId);
	}
	
	public void ClickLostApplicationId() {
		click(lostApplicationIdLink);
	}
	
	
}
