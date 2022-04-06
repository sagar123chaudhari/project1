package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loghomepage 
{
	@FindBy(xpath="//span[@class='user-id']") private WebElement id;

	public loghomepage (WebDriver d) 
	{
		PageFactory.initElements(d, this);
	}
	
	public String getloghomepage()
	{
		String actid = id.getText();
		return actid;
	}
	
//	public void getuserklogid(String uid)
//	{
//		String actid = id.getText();
//		String expid = uid;
//		
//		if(actid.equals(expid))
//		{
//			System.out.println("pass");
//		}
//		
//		else
//		{
//			System.out.println("fail");
//		}
//		
//		
//		
//	}
//	
	
	
	
	
	

}
