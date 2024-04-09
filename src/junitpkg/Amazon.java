package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Amazon {
	ChromeDriver driver;
	String Baseurl="https://www.amazon.in/";
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(Baseurl);
	}
	
	@Test
	public void googlesearch() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile",Keys.ENTER);
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]")).click();
		driver.findElement(By.xpath("//div[@id='s-refinements']/div[2]/ul/li/span/a/span")).click();



	}
}
