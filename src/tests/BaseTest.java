package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import framework.Utilities;


public class BaseTest{
	
	public WebDriver driver;
	/**
	 * Launch application
	 */
	@BeforeTest
	public void launchApplication() {
		
		 String browserType= Utilities.readConfig("browser");
		 
		 if(browserType.equalsIgnoreCase("firefox")){
			 System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe"); 
			 driver = new FirefoxDriver();			 
		 }
		 else if(browserType.equalsIgnoreCase("chrome")){ 
			 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			 driver = new ChromeDriver();
		 }
		 
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 String url = Utilities.readConfig("coatesturl");
		 driver.get(url); 
		 
	}
	
	
	/**
	 * close application after test
	 */
	@AfterTest
	public void closeApplication() {
		driver.quit();
	}
}
