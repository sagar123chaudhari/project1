package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex8_disableTCexecutionfrom_testsuite 
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
		Reporter.log("running tc3", true);
	}
	
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

}
