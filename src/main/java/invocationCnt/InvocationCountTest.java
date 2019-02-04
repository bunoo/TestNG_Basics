package invocationCnt;

import org.testng.annotations.Test;

public class InvocationCountTest {

//If you want to run a particular test 10 times, then use "invocationCount" feature of TestNG
@Test (invocationCount = 10)
public void printSum() {
    int a = 10;
    int b = 20;
    int sum = a + b;

    System.out.println("The sum is =" +sum);
}
	
}

//Cannot inject @Test annotated Method [printSum] with [int, int].