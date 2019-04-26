package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.PageWithFactory;


public class TestWithFactory {

	WebDriver driver;
	
	@Test
	public void verifylogin() throws InterruptedException{
	/* Define driver property and instantiate a driver instance */
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abha Kumari\\Documents\\INTERVIEW\\SELENIUM\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
	/*launch url*/
		driver.get("http://newtours.demoaut.com");
		//@CacheLookup
		

	/*In the below case, I am calling parameterized constructor of the page class, but in a different way. How? 
	Ans - By claiing the "page.class", I am sending out the bytecode of my class which makes the execution faster*/
		
	PageWithFactory obj = PageFactory.initElements (driver, PageWithFactory.class);
		
	/* Perform action by calling Page Class methods */
     obj.loginMethod("edureka","edureka123");
     driver.quit();

		
	}
	
	
}
