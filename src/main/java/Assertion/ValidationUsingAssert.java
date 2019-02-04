package Assertion;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//user#2 makes first commit

public class ValidationUsingAssert {

	WebDriver driver;
	
@BeforeMethod
	 public void setUp() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Abha Kumari\\Documents\\INTERVIEW\\SELENIUM\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	launchURL();
	 }

public void launchURL() {
	 driver.get("http://formy-project.herokuapp.com/");
	
}
	
	
@Test (priority = 1)
public void titleValidationTest1() {
	String x = driver.getTitle();
	System.out.println(x);
	Assert.assertEquals (x, "Formy", "The expected title did not found");
	//There is no need of having if clause with assert feature. In case of failure you can simply print the fail message.
}

//The below test I am deliberately making fail
@Test (priority = 2)
public void titleValidationTest2() {
	String x = driver.getTitle();
	System.out.println(x);
	Assert.assertEquals (x, "Formy123", "The expected title did not found");
	//There is no need of having if clause with assert feature. In case of failure you can simply print the fail message.
}

@AfterMethod
public void tearDown() {
	driver.quit();
}

	
	
	
}
