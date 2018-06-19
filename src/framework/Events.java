package framework;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Events {
	WebDriver driver;
	//String filePath = "COA\\src\\configuration\\config.properties";

	public Events(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @param by
	 * @return list of <webelement>
	 */
	public WebElement getElement(By by) {
		return driver.findElement(by);
	}

	/**
	 * @param by, value
	 */
	public void enterValue(By by, String value) {
		getElement(by).sendKeys(value);
	}
	
	
	/**
	 * @param by
	 */
	public void click(By by) {
		waitForPresent(by);
		getElement(by).click();
	}

	/**
	 * @return title of the screen
	 */
	public String getTitle() {
		return driver.getTitle();
	}

	/**
	 * @param by
	 * @return text of object 
	 */
	public String getText(By by) {
		waitForPresent(by);
		return getElement(by).getText();
	}


	public void hover(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

	public boolean matchSubString(String subString,String mainString) {
		return mainString.contains(subString);
	}
	
	public String[] splitString(String mainString) {
		String[] subStrings = mainString.split(" ");
		return subStrings;
	}
	
	public WebElement waitForPresent(By by){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
	public int getRandonNumber(int count){
		Random rand = new Random(); 
		int value = rand.nextInt(count);
		System.out.println(value);
		return value;
	}
	
	public void selectFromDropdown(By by,String value){
		Select dropdown = new Select(getElement(by));
		dropdown.selectByVisibleText(value);
	}
}
