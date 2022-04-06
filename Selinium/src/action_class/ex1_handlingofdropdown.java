package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex1_handlingofdropdown
{
	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\selenium new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//click on close btn
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//step1 = identify dropdown elmnt
		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		
		//step2 = create objct of action class
		//        with webdriver objct as input
		Actions act = new Actions(driver);
		
		//step3 = call action class method----> movetoelement
		act.moveToElement(login).perform();
		
		
		
		
		
		
		
		
		
	}

}
