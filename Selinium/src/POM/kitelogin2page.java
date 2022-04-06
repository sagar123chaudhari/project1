package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class2
public class kitelogin2page 
{
	@FindBy(xpath="//input[@type='password']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement conti;
	
	
	public kitelogin2page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterpin()
	{
		pin.sendKeys("812073");
	}
	
	public void clickconti()
	{
		conti.click();;
	}
	
	

}
