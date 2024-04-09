package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
	WebDriver driver;
	String baseurl1="https://www.ebay.com/";
			
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl1);
	}
	@Test
	public void test()
	{
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		act.moveToElement(ele);
		act.perform();
		
		WebElement clicks=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
		clicks.click();
		act.perform();
		
}

}
