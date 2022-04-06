package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// pom class3
public class kitehomepage
{
	@FindBy(xpath="//span[@class='user-id']") private WebElement userid;
	
	public kitehomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyuserid()
	{
		String actualuserid = userid.getText();
		String expuserid = "THM944";
		
		if(actualuserid.equals(expuserid))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	}
	
	
	
	

}
