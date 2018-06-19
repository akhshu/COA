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
	
	private By question1NoRbtn = By.id("ctl00_ApplicationContent_rbEBOSBO_A_No");
	private By question2NoRbtn = By.xpath("//*[@id='ctl00_ApplicationContent_rbEBOSBO_B_NO']");
	private By question3NoRbtn = By.xpath("//*[@id='ctl00_ApplicationContent_rbEBOSBO_C_NO']");
	private By question4NoRbtn = By.xpath("//*[@id='ctl00_ApplicationContent_rbEBOSBO_D_NO']");
	private By question5NoRbtn = By.xpath("//*[@id='ctl00_ApplicationContent_rbEBOSBO_E_NO']");
	private By question6NoRbtn = By.xpath("//*[@id='ctl00_ApplicationContent_rbEBOSBO_G_NO']");
	private By question7NoRbtn = By.xpath("//*[@id='ctl00_ApplicationContent_rbEBOSBO_I_NO']");

	private By question1YesRbtn = By.id("ctl00_ApplicationContent_rbEBOSBO_A_Yes");
	private By question2YesNoRbtn = By.id("ctl00_ApplicationContent_rbEBOSBO_B_Yes");
	private By question3YesNoRbtn = By.id("ctl00_ApplicationContent_rbEBOSBO_C_Yes");
	private By question4YesNoRbtn = By.id("ctl00_ApplicationContent_rbEBOSBO_D_Yes");
	private By question5YesNoRbtn = By.id("ctl00_ApplicationContent_rbEBOSBO_E_Yes");
	private By question6YesNoRbtn = By.id("ctl00_ApplicationContent_rbEBOSBO_G_Yes");
	private By question7YesNoRbtn = By.id("ctl00_ApplicationContent_rbEBOSBO_I_Yes");
	

	
	// generic function for all forms , can be used for any page 
	public int getPageCount() {
		String pageLabel =  getText(pageNumberLabel);
		String[] subStrings = splitString(pageLabel);
		return Integer.parseInt(subStrings[1]);
	}
	
	public void selectAllNoOptions() throws InterruptedException{

			click(question1NoRbtn);
			click(question2NoRbtn);			
			click(question3NoRbtn);			
			click(question4NoRbtn);			
			click(question5NoRbtn);			
			click(question6NoRbtn);			
			click(question7NoRbtn);
			
	}
	
	
	
}
