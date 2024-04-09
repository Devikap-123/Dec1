package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffbuttonverification {
	

	ChromeDriver driver;
	String baseurl1="https://register.rediff.com/register/register.php?FormName=user_details";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl1);
	}
	

	@Test
	public void buttontext()
	{
		WebElement button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
		String buttontext=button.getAttribute("value");
		if(buttontext.equals("Check availability"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}