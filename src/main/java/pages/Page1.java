package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page1 {

	WebDriver driver;
	JavascriptExecutor jse;
	WebDriverWait wait;
	
	public WebDriver returnDriver() {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Abha Kumari\\Documents\\INTERVIEW\\SELENIUM\\chromedriver\\chromedriver.exe");
		   driver = new ChromeDriver();
		   return driver;
		   
	   }
	   
	public void invokeBrowser() {
		   
		   returnDriver();
		   driver.manage().deleteAllCookies();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
	   }
		 
	public void launchURL() {
		   
		driver.get("http://formy-project.herokuapp.com/");
		
	   }
	
	
	public void openApplication() {
		
		invokeBrowser();
		launchURL();
	   }
	
	public void closeApplication() {
		
		driver.quit();
	  }
	
}
