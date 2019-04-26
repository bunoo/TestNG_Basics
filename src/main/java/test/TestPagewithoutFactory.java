package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.PagewithoutFactory;

public class TestPagewithoutFactory {

	WebDriver driver;
	
	@Test
	public void verifylogin() throws InterruptedException
	{
	/* Define driver property and instantiate a driver instance */
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Abha Kumari\\Documents\\INTERVIEW\\SELENIUM\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	/*launch url*/
	driver.get("http://newtours.demoaut.com");

	/* Instantiation of Page class */
	PagewithoutFactory login = new PagewithoutFactory(driver);
    
	/* Perform action by calling Page Class methods */
	login.loginMethod("edureka", "edureka123");
	
	//driver.quit();
	}
	
	
	
}
