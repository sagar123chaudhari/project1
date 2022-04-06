package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex9_sample2 
{
	@Test
	public void tc4()
	{
		Reporter.log("running tc4", true);
	}
	
	@Test
	public void tc5()
	{
		Reporter.log("running tc5", true);
	}
	
	@Test
	public void tc6()
	{
		Assert.fail();
		Reporter.log("running tc6", true);
	}
	


}
