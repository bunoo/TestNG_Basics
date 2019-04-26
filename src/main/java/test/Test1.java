package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Page1;

public class Test1 {

	Page1 pg1 = new Page1();
	
@BeforeTest
public void pre_requisute() {
		
		pg1.openApplication();
		
		}	
	

@Test (priority = 1, groups = "Validation of hyperlink")
public void JiraId_1200() throws Exception {
	
	System.out.println("Hello");}



@AfterTest
public void post_requisite() {
	
	pg1.closeApplication();
}
	
}
