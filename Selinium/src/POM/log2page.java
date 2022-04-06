package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class log2page 
{
	@FindBy(xpath="//input[@type='password']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement contbtn;

	public log2page (WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void inputklog2pin()
	{
		pin.sendKeys("812073");
	}
	
	public void clickklog2contbtn()
	{
		contbtn.click();
	}
	
	
	
}
