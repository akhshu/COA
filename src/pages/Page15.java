package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.Events;

/**
 * @author Akhilesh.Shukla
 *
 */
public class Page15 extends Events{

	public Page15(WebDriver driver) {
		super(driver);
	}

	private By submitApplicationBtn= By.id("ctl00_ApplicationContent_btnNext");

	public void clickSubmitApplication(){
		click(submitApplicationBtn);
	}
	
}
