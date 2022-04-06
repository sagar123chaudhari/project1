package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex10_grouping2
{
	@Test(groups="login")
	public void tc1()
	{
		Reporter.log("running tc1", true);
	}
	
	@Test(groups="profile")
	public void tc2()
	{
		Reporter.log("running tc2", true);
	}
	
	@Test(groups="profile")
	public void tc3()
	{
		Reporter.log("running tc3", true);
	}
	
	@Test(groups="wishlist")
	public void tc4()
	{
		Reporter.log("running tc4", true);
	}
	
	@Test(groups="fund")
	public void tc5()
	{
		Reporter.log("running tc5", true);
	}

}
