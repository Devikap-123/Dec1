package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationexcercise {
	
	ChromeDriver driver;
	
	String baseURL = "https://automationexercise.com/login";
	
	
	@Before
	
	public void setup()
	{
		driver = new ChromeDriver();
		
		driver.get(baseURL);
		
		driver.manage().window().minimize();
	}
	
	@Test

	public void titleVerify() {

		String expected = "Automation Exercise - SignUp / Login";
		
		String actual = driver.getTitle();
				
		if(expected.equalsIgnoreCase(actual))
		{
	
			System.out.println("Expected and actual titles are equal");
		}
		else
		{
			System.out.println("Expected and actual titles are not equal");
		}
	}
	
	@Test
	
	public void linkCount() {

		List <WebElement> li = driver.findElements(By.tagName("a"));
		
		System.out.println("Link count =" + li.size());
	}
	
	
	@Test

	public void text()
	
	{
		String PageSource = driver.getPageSource();
		
		if(PageSource.contains("New User Signup"))
		{
			System.out.println("New User Signup is present in the page");
		}
		else
		{
			System.out.println("New User Signup is not present in the page");

		}
	}
	
	@Test
	
	public void buttonTextVerify()
	{
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
	
		String buttonText = ele.getText();
		
		String expected = "Signup";
						
		if(buttonText.equalsIgnoreCase(expected))
		{
			System.out.println("Expected and actual button text are equal");
		}
		else
		{
			System.out.println("Expected and actual button text are not equal");
		}
	}
	
	@Test
		
	public void buttonEnableDisable()
	{
		boolean signUpButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).isEnabled();
		
	        if(signUpButton == true)
		{
			System.out.println("Sign Up Button is enabled");
		}
		else
         	{
			System.out.println("Sign Up button is disabled");

		}
	
	}
	
	
 
	
	
}