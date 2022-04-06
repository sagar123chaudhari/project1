package TestNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ex4_Annotations 
{
	@Test
	public void verifyuserid()
	{
		Reporter.log("running verifyuserid", true);
	}
	
	@BeforeMethod
	public void logintoapp()
	{
		Reporter.log("login to app", true);
	}

}
