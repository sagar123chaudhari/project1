package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ex4_Annotations1 
{
	@Test
	public void verifyid1()
	{
	   Reporter.log("verify id1", true);
	}
	
	@Test
	public void verifyid2()
	{
	   Reporter.log("verify id2", true);
	}
	
	@BeforeMethod
	public void loginid()
	{
		Reporter.log("login", true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout", true);
	}

}
