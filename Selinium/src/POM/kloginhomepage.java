
package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kloginhomepage 
{
	@FindBy(xpath="//span[@class='user-id']") private WebElement user;
	
	public kloginhomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getuser()
	{
		String actual = user.getText();
		String exp ="THM944";
		
		if(actual.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	
	

}
