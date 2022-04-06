package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class log1page 
{
	@FindBy(xpath="//input[@type='text']") private WebElement user;
	@FindBy(xpath="//input[@type='password']") private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	
	public log1page(WebDriver d)
	{
		PageFactory.initElements(d,this);
	}
	
	public void inputklog1user()
	{
		user.sendKeys("THM944");
	}
	
	public void inputklog1pwd()
	{
		pwd.sendKeys("Bisen@7566");
	}
	
	public void clickklog1login()
	{
		login.click();
	}
	
	
}
