package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demoguru {
	WebDriver driver;
	String baseurl1="https://demo.guru99.com/test/simple_context_menu.html";
			
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
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(ele);
		act.perform();
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
		edit.click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		
		WebElement click=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(click);
		act.perform();
		Alert b=driver.switchTo().alert();
		String alerttext1=a.getText();
		System.out.println(alerttext1);
		b.accept();
		
		
		
		
	}

}
