package TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex5_keywords5_dependsonmethods1
{
	@Test
	public void login()
	{
		Assert.fail();
		Reporter.log("running login", true);
	}
	
	@Test(dependsOnMethods= {"login"})
	public void logout()
	{
		Reporter.log("running logout", true);
	}

}
