package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class klogin2page 
{
	@FindBy(xpath="//input[@type='password']") private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']") private WebElement CON;
	
	klogin2page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void entPIN(String pin)
	{
		PIN.sendKeys(pin);
	}
	
	public void clickCON()
	{
		CON.click();
	}
	
	
	
	
}
