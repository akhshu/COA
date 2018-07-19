package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import framework.Events;

/**
 * @author Akhilesh.Shukla
 *
 */
public class Page16 extends Events{

	public Page16(WebDriver driver) {
		super(driver);
	}

	private By thankyouText= By.xpath("//*[contains(text(),'Thank you for submitting your  application')]");

	public boolean verifyThankYouText(){
		return objectExist(thankyouText);
	}
	
}
