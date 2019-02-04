package exceptionHandling;

import org.testng.annotations.Test;


public class timeOutTest {

//Intentionally I have created an infinite loop. The test will fail saying exception timeout. 
//If you want to run this test, run it separately.
	
	/*@Test (priority = 4)
	public void infiniteLoopTest1 () {
		int i = 1;
		while (i == 1){
			System.out.println(i);
		}
	}*/

//If we want to put a check around it, then use "timeOut" keyword

@Test (priority = 3,timeOut = 100) 
public void infiniteLoopTest2 () {
	int i = 1;
	while (i == 1){
		System.out.println(i);
	}
}

//We are trying to convert a string "x" into an integer. So exception is expected here ".NumberFormatException".
@Test (priority = 1)
public void test1() {
	String x = "100A";
	Integer.parseInt(x); 
}

//Suppose we want to bypass this exception and mark our test case pass, then use "expectedExceptions" keyword shown below :
@Test (priority = 2,expectedExceptions = NumberFormatException.class)
public void test2() {
	String x = "100A";
	Integer.parseInt(x);
}

}
