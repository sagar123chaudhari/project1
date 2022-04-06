package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex3_EmailableReport1 
{
	@Test                    //test case or test method
	public void TC1()        //TC name = TC1
	{
		Reporter.log("running TC1", true);
	}
	
	@Test                    //test case or test method
	public void TC2()        //TC name = TC2
	{
		Reporter.log("running TC2", true);
	}

}
