package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.Events;

public class Page1 extends Events{

	public Page1(WebDriver driver) {
		super(driver);
	}

	private By formHeaderLabel = By.xpath("//div[@class='formHead']");
	private By pageNumberLabel = By.xpath("//div[@class='text' and contains(text(),'Page')]");
	
	// generic function for all forms , can be used for any page 
	public int getPageCount() {
		String pageLabel =  getText(pageNumberLabel);
		String[] subStrings = splitString(pageLabel);
		System.out.println(subStrings[1]);
		return Integer.parseInt(subStrings[1]);
	}
	
	
	
	
}
