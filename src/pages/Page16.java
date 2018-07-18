package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.Events;

/**
 * @author Akhilesh.Shukla
 *
 */
public class Page16 extends Events{

	public Page16(WebDriver driver) {
		super(driver);
	}

	private By thankyouTextTable= By.xpath("//table[@class = 'text contenttable prc100']");

	public boolean verifyThankYouText(){
		return findValueInTable(thankyouTextTable,"Thank you for submitting your  application!");	
	}
	
}
