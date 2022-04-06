package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex5_keyword1_invocationcount
{
	
	@Test(invocationCount=5)
	public void TC1()
	{
		Reporter.log("running TC1", true);
	}

}
