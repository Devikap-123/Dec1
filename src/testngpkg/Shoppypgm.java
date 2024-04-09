package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Shoppypgm {
WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		driver =new ChromeDriver();
		driver.get("https://shoppy.sg/");
	}
		@Test
		public void test() throws Exception
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.name("/html/body/div[3]/div[2]/div[3]/div[2]/div[2]/ul/li[5]/a"));
			driver.findElement(By.name("//*[@id=\"customer_email\"]")).sendKeys("pullambidevika@gmail.com");
			driver.findElement(By.name("//*[@id=\"customer_password\"]")).sendKeys("1ee2");
			driver.findElement(By.name("//*[@id=\"customer_login\"]/input[5]")).click();
			Thread.sleep(3000); 
			
			String actualurl=driver.getCurrentUrl();
			System.out.println(actualurl);
			String expurl=("https://shoppy.sg/");	
			if(actualurl.equals(expurl))
			{
				System.out.println("Successful");
			}
			else
			{
				System.out.println("Unsuccessful");	
			
			}

	}
}