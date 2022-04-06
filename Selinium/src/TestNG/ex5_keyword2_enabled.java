package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex5_keyword2_enabled 
{
	@Test
	public void TC1()
	{
		Reporter.log("running TC1");
	}
	
	@Test(enabled=false)
	public void TC2()
	{
		Reporter.log("running TC2");
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("running TC3");
	}

}
