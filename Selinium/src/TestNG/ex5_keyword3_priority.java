package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex5_keyword3_priority 
{                                    
	                                  // here test case run--> default alphabetically
	@Test
	public void TC3()
	{
		Reporter.log("running TC3");
	}
	
	@Test
	public void TC1()
	{
		Reporter.log("running TC1");
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("running TC2");
	}

}
