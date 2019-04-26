package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageWithFactory {

	WebDriver driver;
	
	/* Define web elements using @FindBy annotation as WebElement*/
	@FindBy(name = "userName") WebElement username;
	@FindBy (how = How.NAME, using = "password") WebElement password;
	@FindBy (how = How.NAME, using = "login") WebElement login;

	
	/* Define a parameterized Constructor*/
	public PageWithFactory (WebDriver driver){
	  this.driver = driver;
	}

	/* Define methods */
	public void loginMethod (String uid, String pwd){
	  username.sendKeys(uid);
	  password.sendKeys (pwd);
	  login.click();
	}
	
}
