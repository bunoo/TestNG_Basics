package threeStepsProcess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;



public class SimpleTest {

WebDriver driver;
JavascriptExecutor jse;
	 
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
 
 @Test (priority = 2, groups = "Feature#2")
 public void dropDownMenu() { 
			
launchURL();
String a = driver.getTitle();
System.out.println("The title is "+a);
WebDriverWait wait=new WebDriverWait(driver, 20); //Explicit wait
WebElement Components = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("navbarDropdownMenuLink")));
Components.click();
WebElement dropdown = driver.findElement(By.xpath("//a[@class='dropdown-item' and @href='/dropdown']"));				   
dropdown.click();
 }


 @Test (priority = 1, groups = "Feature#1")
 public void autoComplete() {
	   
launchURL();
WebDriverWait wait=new WebDriverWait(driver, 20); //Explicit wait
WebElement btnAutocomplete = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-lg' and @href='/autocomplete']")));
btnAutocomplete.click();
WebElement Address = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("autocomplete")));
Address.clear();
Address.sendKeys("1555 Park Blvd, Palo Alto, CA");
}
 
@Test (priority = 3, groups = "Feature#2")
public void fileupload() {
	   try {
		   launchURL();
		   Thread.sleep(4000); // Try to know how to use Explicit wait with jse and then use the same
		   jse = (JavascriptExecutor)driver;
		   jse.executeScript("scroll(0,800)");
		   WebElement upload = driver.findElement(By.xpath("//a[@class='btn btn-lg' and @href='/fileupload']"));
		   upload.click();
		   
		   Thread.sleep(4000);
		 
		   
		   WebElement fileurl = driver.findElement(By.id("file-upload-field"));
		   fileurl.sendKeys("C:\\Users\\Abha Kumari\\Documents\\INTERVIEW\\SELENIUM\\File_upload.txt");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
 
@AfterMethod
public void tearDown() {
	driver.quit();
}
 

 
}
