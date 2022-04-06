package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ex4_Annotations2 
{
	@BeforeClass
	public void openapp()
	{
		Reporter.log("open app", true);
	}
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("login", true);
	}
	
	
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
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout", true);
	}
	
	
	@AfterClass
	public void closeapp()
	{
		Reporter.log("close app", true);
	}

}
