package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class klogin1page
{
	@FindBy(xpath="//input[@type='text']") private WebElement UN;
	@FindBy(xpath="//input[@type='password']") private WebElement PW;
	@FindBy(xpath="//button[@type='submit']") private WebElement LN;
	
	public klogin1page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void entUN(String user)
	{
		UN.sendKeys(user);
	}
	
	public void entPW(String pwd)
	{
		PW.sendKeys(pwd);
	}
	
	public void clickLN()
	{
		LN.click();
	}
    
    
    
    
    
    
    
    
    
    
}