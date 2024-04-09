package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	String Baseurl="https://www.facebook.com";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(Baseurl);
	}
	
	
	@Test
	public void titleverification()
	{
		driver.findElement(By.id("email")).sendKeys("abc");
		driver.findElement(By.name("pass")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	}
	
	@Test
	
	public void test2()
	{
		String src=driver.getPageSource();
		
		if(src.contains("Gmail"))
		{
			System.out.println("contain gmail");
		}
		else
		{
			System.out.println("not contain");
		}
	}
	
	@After
	public void tearDown()
	{
		//driver.quit();
	}

}
