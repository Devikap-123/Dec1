package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdob {
	ChromeDriver driver;
	String baseurl1="https://register.rediff.com/register/register.php?FormName=user_details";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl1);
	}
	

	@Test
	public void test()
	{
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select day=new Select(dayelement);
		day.selectByValue("04");
		WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select month=new Select(monthelement);
		day.selectByVisibleText("SEP");
		
	}

}
