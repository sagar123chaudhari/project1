package TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex9_sample1
{
	@Test
	public void tc1()
	{
		Reporter.log("running tc1", true);
	}
	
	@Test
	public void tc2()
	{
		Reporter.log("running tc2", true);
	}
	
	@Test
	public void tc3()
	{
        Assert.fail();
		Reporter.log("running tc3", true);
	}
	
	
	

	


}
