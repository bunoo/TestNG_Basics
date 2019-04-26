package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class PagewithoutFactory {

	WebDriver driver;

	/* Define web elements as a By class object*/
	By username = By.name ("userName");
	By password = By.name("password");
	By login = By.name("login");
	

	/* Define a parameterized Constructor*/
	public PagewithoutFactory (WebDriver driver){
	this.driver = driver;
	}

	/* Define methods */
	public void loginMethod (String uid, String pwd){
		driver.findElement(username).sendKeys(uid);
		driver.findElement(password).sendKeys (pwd);
		driver.findElement(login).click();
		}
}
