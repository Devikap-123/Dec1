package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Baseclass {
WebDriver driver;
	
	@BeforeClass
	
	public void setup()
	{
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		System.out.println("driver" + driver);
	}

}