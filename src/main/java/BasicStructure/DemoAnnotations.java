package BasicStructure;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

/*Set up for chrome browser
login
launch chrome

GROUP#1
Before Method = enter the url
This is the second test
After Method = logout from the app

GROUP#2
Before Method = enter the url
Google title test
After Method = logout from the app

Close browser
delete all cookies
PASSED: Test2
PASSED: GoogleTitleTest*/

public class DemoAnnotations {

//Pre-conditions annotations - starting with @Before

/*@BeforeSuite
public void setup () {
	System.out.println("Set up for chrome browser");
}*/

@BeforeClass
public void launchBrowser() {
	System.out.println("launch chrome");
}
	
@BeforeTest
public void login() {
	System.out.println("login");
}

@BeforeMethod
public void enterURL() {
	System.out.println("Before Mthod = enter the url");
}

//Test cases -- sorting with @Test
@Test  (priority = 2)
public void GoogleTitleTest() {
	System.out.println("Google title test");
}

@Test (priority = 1)
public void Test2() {
	System.out.println("This is the second test");
}

//Post conditions -- sorting with @After
@AfterMethod
public void logOut(){
	System.out.println ("After Mthod = logout from the app");
}

@AfterTest
public void deleteAllCookies() {
	System.out.println("delete all cookies");
}

@AfterClass
public void CloseBrowser() {
	System.out.println("Close browser");
}

//AfterSuite is not working. Try to know it later
/*@AfterSuite
public void Endsetup () {
	System.out.println("No set up for chrome required");
}*/

//PAIRING/GROUPING takes place in the following way:

/*@BeforeMethod
@priority 1 test
@AfterMethod

@BeforeMethod
@priority 2 test
@AfterMethod
*/










}
