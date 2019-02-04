package dependenyFeatue;

import org.testng.annotations.Test;

public class DependsOnLogin {

@Test (priority = 1, groups = "Feature#1")
public void loginTest() {
	System.out.println("login");
	//int i = 9/0; //This will throw Arithmetic exception. This I am writing to explore around "dependency" feature of testNG
}
	
@Test (priority = 2, groups = "Feature#2", dependsOnMethods = "loginTest")
public void homePageTest() {
	System.out.println("homePageTest");
}

@Test (priority = 3, groups = "Feature#3", dependsOnMethods = "loginTest")
public void searchBoxTest() {
	System.out.println("searchBoxTest");
}

@Test (priority = 4, groups = "Feature#4", dependsOnMethods = "loginTest")
public void regPageTest() {
	System.out.println("regPageTest");
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
