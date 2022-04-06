package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class1
public class kitelogin1page 
{
	//step1: declaration
	@FindBy(xpath="//input[@type='text']")	private WebElement un; //private webelement un =driver.findelement(By.xpath("")
	@FindBy(xpath="//input[@type='password']")	private WebElement pw; //private webelement pw =driver.findelement(By.xpath("")
	@FindBy(xpath="//button[@type='submit']")	private WebElement login;//private webelement login =driver.findelement(By.xpath("")
	
	public kitelogin1page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterun()
	{
		un.sendKeys("THM944");
	}
	
	public void enterpw()
	{
		pw.sendKeys("Bisen@7566");
	}
	
	public void clicklogin()
	{
		login.click();;
	}


	
	
}
