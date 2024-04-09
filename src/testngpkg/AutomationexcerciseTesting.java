package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationexcerciseTesting {
	ChromeDriver driver;
	String baseURL = "https://automationexercise.com/login";
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseURL);
	}
	@BeforeMethod
	public void url()
	{
		driver.get(baseURL);
		
	}
	
	@Test
	public void titleVerify()
	{
		
	}
	

}
